DESCRIPTION = "build Shared lib from HMM"
PR = "r2"

HMM_C="${TOPDIR}/HMM/HMM.c"
OUTDIR="${TOPDIR}/OUTPUT/shared"

do_build() {
	# Create OUTPUT dir if not exist in build/
	if [ ! -d "${TOPDIR}/OUTPUT" ]; then
		echo "create dir ${TOPDIR}/OUTPUT"
		mkdir ${TOPDIR}/OUTPUT
        else
		echo "Directory ${TOPDIR}/OUTPUT already exists."
	fi

	# Create Shared lib under build/OUTPUT/SHARED if not exist
	if [ ! -d "${OUTDIR}" ]; then	
		echo "create SHARED LIB ${OUTDIR}"	
	    	mkdir ${OUTDIR}
	    	gcc -c -fPIC -o ${OUTDIR}/IHMM.o ${HMM_C}
	    	gcc --shared -o ${OUTDIR}/libHMM.so ${OUTDIR}/IHMM.o

        else
		echo "Directory ${OUTDIR} already exists."
	fi

}

	
	
