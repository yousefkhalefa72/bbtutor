DESCRIPTION = "Cleaning output files"
PR = "r4"

OUTDIR="${TOPDIR}/OUTPUT/"

do_build() {
	# Clean OUTPUT dir if found
	if [ -d "${TOPDIR}/OUTPUT" ]; then
		echo "CLEANING...."
		rm -r ${TOPDIR}/OUTPUT
        else
		echo "Already Cleaned."
	fi
}
