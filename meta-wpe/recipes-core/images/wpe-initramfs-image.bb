# Copyright (C) 2016 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "WPE initramfs rootfs image"
LICENSE = "MIT"

require wpe-westeros-image.bb

IMAGE_FSTYPES_rpi = " ${INITRAMFS_FSTYPES}"
