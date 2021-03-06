SUMMARY = "GStreamer integration library for Clutter"
HOMEPAGE = "http://www.clutter-project.org/"
LICENSE = "LGPLv2+"

inherit clutter distro_features_check upstream-version-is-even gobject-introspection
# depends on clutter-1.0 which depends on cogl-1.0
REQUIRED_DISTRO_FEATURES ?= "opengl"

SRC_URI += "file://0001-Install-example-binary-needed-for-core-image-clutter.patch"

DEPENDS = "gstreamer1.0-plugins-base gstreamer1.0-plugins-bad clutter-1.0 libgudev"
RDEPENDS_${PN} += "gstreamer1.0-meta-base"
PACKAGES  =+ "${PN}-examples"

FILES_${PN}          += "${libdir}/gstreamer-1.0/lib*.so"
FILES_${PN}-dev      += "${libdir}/gstreamer-1.0/*.la"
FILES_${PN}-examples  = "${bindir}/video-player ${bindir}/video-sink"

# Needs to be disable due to a dependency on gstreamer-plugins introspection files
EXTRA_OECONF_append_mips64 = " --disable-introspection "

