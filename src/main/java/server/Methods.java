package server;

public class Methods{
    public double imc  (String nombre, double peso, double altura) {
        double imc  = peso / (altura * altura);
        return imc ;
    }

///////// 2

    public String ejr_2(String name, double num1, double num2, double num3){
        String message;
        double sum = num1 + num2 + num3;
        double prom = sum/3;
        message = "Hola, tu  producto es: " + name + ", la suma es: " + sum + ", el promedio es: " + prom;
        return message;
    }
////3

        public  int ejr_3 (int n1,int n2){
            int sum = 0;
            for (int i = n1; i < n1 ; i++) {
                sum +=i;
            }
            return sum - n1;
        }

}



