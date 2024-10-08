DESCRIPTION = "build static lib from HMM"
PR = "r3"

HMM_C="${TOPDIR}/HMM/HMM.c"
OUTDIR="${TOPDIR}/OUTPUT/static"

do_build() {

	# Create OUTPUT dir under build/ if not exist
	if [ ! -d "${TOPDIR}/OUTPUT" ]; then
		echo "create dir ${TOPDIR}/OUTPUT"
		mkdir ${TOPDIR}/OUTPUT
        else
		echo "Directory ${TOPDIR}/OUTPUT already exists."
	fi

	# Create Shared lib under build/OUTPUT/STATIC if not exist
	if [ ! -d "${OUTDIR}" ]; then	
		echo "create STATIC LIB ${OUTDIR}"	
	    	mkdir ${OUTDIR}
	    	gcc -c ${HMM_C} -o ${OUTDIR}/HMM.o
	    	ar -r ${OUTDIR}/lib.a ${OUTDIR}/HMM.o 
        else
		echo "Directory ${OUTDIR} already exists."
	fi
	
}

