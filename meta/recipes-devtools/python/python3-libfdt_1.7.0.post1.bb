SUMMARY = "Python bindings for libfdt."
LICENSE = "GPL-2.0-only | BSD-2-Clause"
LIC_FILES_CHKSUM = " \
    file://BSD-2-Clause;md5=5d6306d1b08f8df623178dfd81880927 \
    file://GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit pypi setuptools3

PYPI_PACKAGE = "pylibfdt"

SRC_URI[sha256sum] = "2d048f9f8ce9a0527d497f423dea1f1135f9811c05b009cc5d5753771c1f9ba1"

BBCLASSEXTEND = "native nativesdk"

DEPENDS += " \
    python3-pip-native \
    python3-setuptools-scm-native \
    swig-native \
"
