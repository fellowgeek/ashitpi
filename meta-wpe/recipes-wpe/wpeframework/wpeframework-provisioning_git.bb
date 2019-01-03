SUMMARY = "WPE Framework Provisioning plugin"
HOMEPAGE = "https://github.com/WebPlatformForEmbedded"
SECTION = "wpe"
LICENSE = "CLOSED"

DEPENDS = "wpeframework libprovision"

PV = "3.0+gitr${SRCPV}"

SRC_URI = "git://git@github.com/WebPlatformForEmbedded/WPEPluginProvisioning.git;protocol=ssh;branch=master \
		  file://0002-cmake-Remove-redundant-include.patch"

SRCREV = "fe4ac5a92333019182e71c006f4077b7b220d4b3"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ?= ""
PACKAGECONFIG[debug]            = "-DCMAKE_BUILD_TYPE=Debug,-DCMAKE_BUILD_TYPE=Release,"

# ----------------------------------------------------------------------------

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/wpeframework/plugins/libWPEFrameworkProvisioning.so"
INSANE_SKIP_${PN} = ""

# ----------------------------------------------------------------------------

TOOLCHAIN = "gcc"
