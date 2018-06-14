do_configure_prepend() {
    mv -f ${B}/.config ${B}/.config.patched
    CONF_SED_SCRIPT=""

    # MOA added dummy_hcd support
    kernel_configure_variable DUMMY_HCD m

    # Keep this the last line
    # Remove all modified configs and add the rest to .config
    sed -e "${CONF_SED_SCRIPT}" < '${B}/.config.patched' >> '${B}/.config'
    rm -f ${B}/.config.patched

    yes '' | oe_runmake oldconfig
}
