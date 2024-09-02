DESCRIPTION = "download HMM from Git if it doesn't exist"
PR = "r1"

# Define the source URI for the Git repository
SRC_URI = "https://github.com/yousefkhalefa72/HMM.git"

# Define the directory where the repository should be placed
HMM_DIR = "${TOPDIR}/HMM"

do_build() {
    
    # Check if the directory doesn't exist
    if [ ! -d "${HMM_DIR}" ]; then
        echo "fetching ${SRC_URI} into ${HMM_DIR}"
        # create the HMM directory in build/
        mkdir "${HMM_DIR}"
        # Clone the repository into the directory
        git clone "${SRC_URI}" "${HMM_DIR}"
    else
        echo "Directory ${HMM_DIR} already exists. Skipping fetch."
    fi

}

