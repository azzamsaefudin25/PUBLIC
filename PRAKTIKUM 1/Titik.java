/**
 * File      : Titik.java		21/2/2024
 * Nama penulis   : Azzam Saefudin Rosyidi
 * NIM       : 24060122130076
 * Deskripsi : Kelas yang berisi body dari Titik
 * 
 */

class Titik
{
	double absis, ordinat;
	static double counterTitik;

	Titik()
    	{
        	absis = 0;
        	ordinat = 0;
        	counterTitik++;
    	}

    	void setAbsis(double a){
        	absis = a;
    	}
    	double getAbsis(){
        	return absis;
    	}
    	void setOrdinat(double b){
        	ordinat = b;
    	}
    	double getOrdinat(){
        	return ordinat;
    	}	
	static double getCounterTitik()
	{
		return counterTitik;
	}
	Titik(double newabsis, double newordinat){
		absis = newabsis;
		ordinat = newordinat;
		counterTitik++;
	}
}