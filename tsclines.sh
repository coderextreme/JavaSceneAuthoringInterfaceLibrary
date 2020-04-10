tsc.exe X3DJSAIL.ts 2> tscerrors.txt
cat tscerrors.txt | sed -e 'sx.*(\(.*\),.*).*xNR==\1 { print $0; }x' >> awk.prog
awk -f awk.prog X3DJSAIL.ts

