public class ContBancar {
    private double sold = 0.0;

    public ContBancar(double sold) {
        this.sold = sold;
    }

    public void depozitareSuma(double suma) {
        sold += suma;
    }

    public boolean retragereSuma(double suma) {
        if (suma > 0 && suma <= sold) {
            sold -= suma;
            return true;
        } else {
            return false;
        }
    }

    public double interogareSold() {
        return sold;
    }

    
    public String toString() {
        return "Soldul contului bancar este " + sold;
    }

    public static void main(String[] args) {
        ContBancar cont = new ContBancar(500);
        
        

        System.out.println("Depozitare 300");
        cont.depozitareSuma(300);
        
        System.out.println("Soldul este " + cont.interogareSold());
        
      
        
        System.out.println(cont.toString());
    }
}
