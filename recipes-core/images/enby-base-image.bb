# Base this image on core-image-minimal
include recipes-core/images/core-minimal-image.bb

LICENSE = "MIT"

IMAGE_FEATURES += "ssh-server-dropbear"

#SPLASH = "psplash-raspberrypi"
#IMAGE_FEATURES += "splash"
