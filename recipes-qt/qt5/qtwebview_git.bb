LICENSE = "GFDL-1.3 & BSD & ( GPL-2.0+ | LGPL-3.0 ) | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
    file://LICENSE.GPLv2;md5=c96076271561b0e3785dad260634eaa8 \
    file://LICENSE.GPLv3;md5=88e2b9117e6be406b5ed6ee4ca99a705 \
    file://LICENSE.LGPLv3;md5=e0459b45c5c4840b353141a8bbed91f0 \
"

require qt5.inc
require qt5-git.inc

SRC_URI += "file://0001-Add-missing-include-for-qWarning.patch"

DEPENDS += "qtbase qtwebengine"

SRCREV = "6e55abf3b6a5f373cd4b649c2318a45c49b40589"
