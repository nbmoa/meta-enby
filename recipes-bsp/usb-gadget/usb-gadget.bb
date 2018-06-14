# Copyright (C) 2018 emuh1 <moa.ziegler@snuk.io>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Turns PI Zero into a usb gadget"
HOMEPAGE = ""

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=6bd1a23e164026f910cada2dd468c8d1"

#SECTION = ""
DEPENDS = "rpi-config"

COMPATIBLE_MACHINE = "^rpi$"

SRC_URI = "file://usb-gadget.init"
SRC_URI += "file://usb-gadget-init.service"

SYSTEMD_SERVICE_${PN} += " usb-gadget-init.service"

REQUIRED_DISTRO_FEATURES = "systemd"

do_install_append() {
             install -d ${D}/usr/bin
             install -m 0755 ${WORKDIR}/usb-gadget.init ${D}/usr/bin

             install -d ${D}{systemd_system_unitdir}
             install -m 0644 ${WORKDIR}/usb-gadget-init.service ${D}{systemd_system_unitdir}
}

