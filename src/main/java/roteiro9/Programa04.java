package roteiro9;

public class Programa04 {
    public static void main(String[] args) {
        int base, exp;
        
        System.out.println("4 - Potências");
        
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + " - ");
            System.out.print("\nBase: ");
            base = Validadores.ehInteiro();
            
            System.out.print("Expoente: ");
            exp = Validadores.ehInteiro();
            
            System.out.println("Resultado: " + potencia(base, exp));
        }
    }
    public static int potencia (int base,int exp) {
        int resultado = 1;
        
        if (exp < 0) {
            return 0;
        }
        
        for (int i = 0; i < exp; i++) {
            resultado = resultado * base;
        }
        
        return resultado;
    }
}
