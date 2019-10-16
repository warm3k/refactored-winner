public class Fraction(){
    private int denominateur;
    private int numerateur; 
    final ZERO=(0,1);
    final UN=(1,1);

	Fraction(){
		this.numerateur = 0;
		this.denominateur = 1;			
	}
	
	Fraction(int numerateur){
		this.numerateur = numerateur;
		this.denominateur = 1;			
	}
	
    Fraction(int denominateur,int numerateur){
        this.denominateur=denominateur;
        this.numerateur=numerateur;

    }
    getN(){
        return this.numerateur;
    }
    getD(){
        return this.denominateur;
    }
    
    

}
