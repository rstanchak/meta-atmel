require u-boot.inc

# To build u-boot for your machine, provide the following lines in your machine
# config, replacing the assignments as appropriate for your machine.
# UBOOT_MACHINE = "omap3_beagle_config"
# UBOOT_ENTRYPOINT = "0x80008000"
# UBOOT_LOADADDRESS = "0x80008000"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=2687c5ebfd9cb284491c3204b726ea29"

SRCREV = "f442357fadb535f4f343dc0593adb945fa03fc0c"

PV = "v2014.07-at91"
PR = "r1"

COMPATIBLE_MACHINE = "(sama5d3xek|sama5d4ek)"

SRC_URI = "git://obelix.corp.atmel.com/local/uboot/dev/9-x5.git;branch=u-boot-2014.07-at91"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"