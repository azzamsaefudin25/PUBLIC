/************************************/
/* Program   : titik.c */
/* Deskripsi : realisasi body modul Titik */
/* NIM/Nama  : 24060122130076 / Azzam Saefudin Rosyidi */
/* Tanggal   : Jumat, 1 September 2023*/
/***********************************/
#include <stdio.h>
#include "titik.h"
#include <math.h>

/*KONSTRUKTOR*/
/* procedure makeTitik(output T:Titik)*/
/*{I.S.: -}*/
/*{F.S.: T terdefinisi}*/
/*{proses: mengisi nilai komponen absis dan ordinat T dengan 0}*/
void makeTitik(Titik *T){

 // kamus lokal
 
 //algoritma
    (*T).absis=0;
    (*T).ordinat=0;
   
}

/*DESTRUKTOR*/

/**********SELEKTOR*/
/*function getAbsis(T:Titik)->integer*/
/*{mengembalikan nilai komponen absis T}*/
int getAbsis(Titik T){

 // kamus lokal
 
 //algoritma
    return T.absis;
}

/*function getOrdinat(T:Titik)->integer*/
/*{mengembalikan nilai komponen ordinat T}*/
int getOrdinat(Titik T){
 // kamus lokal
   return T.ordinat;
 //algoritma
}

/*********MUTATOR*/
/*procedure setAbsis(input/output T, input xx)*/
/*{I.S.: T terdefinisi}*/
/*{F.S.: T.absis=xx}*/
/*{proses: mengisi nilai komponen absis T}*/
void setAbsis(Titik *T, int xx){
 // kamus lokal
 
 //algoritma
    (*T).absis = xx;
}


/*procedure setOrdinat(input/output T, input yy)*/
/*{I.S.: T terdefinisi}*/
/*{F.S.: T.ordinat=yy}*/
/*{proses: mengisi nilai komponen ordinat T}*/
void setOrdinat(Titik *T, int yy){
 // kamus lokal
 
 //algoritma
    (*T).ordinat = yy;
}

/*********PREDIKAT*/
/*function isOrigin(T:Titik)->boolean*/
/*{mengembalikan true jika Titik T ada di persilangan sumbu X dan Y}*/
boolean isOrigin(Titik T){
 // kamus lokal
    boolean hasil;
 //algoritma
    if (T.absis == 0 && T.ordinat == 0) {
        hasil = true;
    }
    else{
        hasil = false;
    }
    return hasil;
}

/*********SUBRUTIN LAIN*/
/*procedure geserXY(input/output T:Titik, input dx, input dy)*/
/*{I.S.: T terdefinisi}*/
/*{F.S.: T bergeser sejauh (dx,dy)}*/
/*{proses: mengubah nilai komponen absis dan ordinat T}*/
void geserXY(Titik *T, int dx, int dy){
 
 // kamus lokal
 
 //algoritma
    (*T).absis = (*T).absis + dx;
    (*T).ordinat = (*T).ordinat + dy;

}

/*procedure refleksiSumbuX(input/output T:Titik)*/
/*{I.S.: T terdefinisi}*/
/*{F.S.: T dicerminkan ke sumbu X }*/
/*{proses: mengubah nilai komponen ordinat T}*/
void refleksiSumbuX(Titik *T){
 
 // kamus lokal
 
 //algoritma
    (*T).ordinat = -(*T).ordinat;
}

/*procedure refleksiSumbuY(input/output T:Titik)*/
/*{I.S.: T terdefinisi}*/
/*{F.S.: T dicerminkan ke sumbu Y }*/
/*{proses: mengubah nilai komponen absis T}*/
void refleksiSumbuY(Titik *T){
 // kamus lokal
 
 //algoritma
    (*T).absis = -(*T).absis;
}

/*function Kuadran(T:Titik)->integer*/
/*{mengembalikan posisi Titik T pada kuadran 1,2,3 atau 4}*/
/*{asumsi: bila titik memotong sumbu, maka nilai 0 dianggap positif}*/
int Kuadran(Titik T){
 
 // kamus lokal
    int hasil;
 //algoritma
    if (T.absis > 0 && T.ordinat > 0){
        hasil = 1;
    }
    else if (T.absis < 0 && T.ordinat > 0){
        hasil = 2;
    }
    else if (T.absis < 0 && T.ordinat < 0){
        hasil = 3;
    }
    else if (T.absis > 0 && T.ordinat < 0){
        hasil = 4;
    }
    else{
        hasil = 0;
    }
    return hasil;
}

/*function Jarak(T1:Titik, T2:Titik)->real*/
/*{mengembalikan jarak euclidian titik T1 dan T2}*/
/*{asumsi: aplikasikan rumus Pitagoras dan fungsi akar sqrt}*/
float Jarak(Titik T1, Titik T2){
 // kamus lokal
    float hasil;
    float p1 = (T1.absis-T2.absis);
    float p2 = (T1.ordinat-T2.ordinat);
 //algoritma
    hasil = sqrt((p1*p1)+(p2*p2));

    return hasil;
}

// jika input doang maka tidak usah pakai pointer
// jika input output atau ouput maka pakai pointer
