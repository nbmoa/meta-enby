# Base this image on core-image-minimal
include recipes-core/images/rpi-hwup-image.bb

IMAGE_FEATURES += "ssh-server-dropbear"

#SPLASH = "psplash-raspberrypi"
#IMAGE_FEATURES += "splash"

# Include modules in rootfs
IMAGE_INSTALL += " \
	usb-gadget \
	"
