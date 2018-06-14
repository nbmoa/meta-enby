FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


do_deploy_append_raspberrypi0() {
    echo "# enable USB gadget mode" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=dwc2" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

KERNEL_MODULE_AUTOLOAD_raspberrypi0 += " dwc2 libcomposite"
