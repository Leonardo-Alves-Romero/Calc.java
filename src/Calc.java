public class Calc {
    
    public static int calcularvalores(int numero1, int numero2) {
        return numero1 + numero2; 
        }

        
        public static void main(String[] args) {
        int numero1 =  2;
        int numero2 =  60;
        int resultado = Calc.calcularvalores(numero1, numero2);
        System.out.println("O resultado foi " + resultado);
    }

}
