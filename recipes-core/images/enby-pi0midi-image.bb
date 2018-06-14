include recipes-core/images/enby-base-image.bb

LICENSE = "MIT"

# Include modules in rootfs
IMAGE_INSTALL += " \
	usb-gadget \
	"
