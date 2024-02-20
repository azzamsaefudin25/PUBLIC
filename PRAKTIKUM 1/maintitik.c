/************************************/
/* Program   : maintitik.c */
/* Deskripsi : aplikasi driver modul Titik */
/* NIM/Nama  : 24060122130076 / Azzam Saefudin Rosyidi*/
/* Tanggal   : Jumat, 1 September 2023*/
/***********************************/
#include <stdio.h>
#include "titik.h"
#include "titik.c"

int main(void)
{

    // kamus main
    Titik T1, T2;
    int angkaT1, angkaT2;
    float b;
    // algoritma
    T1.absis = 4;
    T2.ordinat = 5;
    printf("Percobaan 1 : absis = %d dan ordinat = %d\n", T1.absis, T2.ordinat);
    angkaT1 = getAbsis(T1);
    angkaT2 = getOrdinat(T2);
    printf("Percobaan 2 : absis = %d dan ordinat = %d\n", angkaT1, angkaT2);
    setAbsis(&T1, 5);
    printf("setAbsis = %d", T1.absis);
    printf("\n");
    setOrdinat(&T2, 3);
    printf("setOrdinat = %d", T2.ordinat);
    geserXY(&T1, 2, 5);
    printf("\ngeserXY = %d", T1.absis);
    geserXY(&T2, 2, 5);
    printf("\ngeserXY = %d", T2.ordinat);
    refleksiSumbuX(&T2);
    refleksiSumbuY(&T1);
    printf("\nrefleksi sumbu x = %d dan sumbu y = %d", T1.absis, T2.ordinat);
    angkaT1 = Kuadran(T1);
    angkaT2 = Kuadran(T2);
    printf("\nKuadran T1 = %d dan T2 = %d", angkaT1, angkaT2);
    b = Jarak(T1, T2);
    printf("\njarak = %.2f", b);

    return 0;
}
