package proyecto.ud2;
import java.util.Scanner;

public class CalculadoraFinal {
    /*
    *Aquí aparecen palabras reservadas
    *como "public", "static" o "void"
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* Declaramos e inicializamos la variable a,b y resultado
        Estas variables iniciales son generales (pueden ser accedidas por 
        cualquier función o bloque) y son del tipo primitivo double, por tanto 
        sus valores podrán contener decimales*/
        double a = 0, b = 0, resultado = 0;
        String opciones;
        //En la siguiente linea hemos incluido un line break.
        System.out.println("Por favor introduce números positivos,\nque no sean 0");
        System.out.println();
        System.out.println("Operaciones disponibles:");
        System.out.println("+, -, *, /, raiz");
        System.out.println("valorabs, logaritmo, funcionexp, seno, coseno");
        System.out.println("tangente, arcosen, arcotang, redondeo");
        System.out.println("acumulador, Fibonacci, Mayor, factorial, truncar");
        System.out.println("tabla, rango");
        System.out.println("SALIR -> pulse s");
        System.out.println();
        
        //Ejemplo bucle do-while.
        do {
            System.out.print("¿Qué deseas calcular? ");
            opciones = sc.nextLine();

            // Ejemplo de condicional doble.
            if (opciones.equalsIgnoreCase("s")) {
                System.out.println("fin");
                break;
            }
            if ("+-*/Mayor".contains(opciones)) {
                System.out.print("Introduce un número: ");
                a = sc.nextDouble();
                System.out.print("Introduce otro número: ");
                b = sc.nextDouble();
                sc.nextLine(); // Consumir salto de línea.
            } else if ("rango".contains(opciones)){
                
            } else {
                System.out.print("Introduce un número: ");
                a = sc.nextDouble();
                sc.nextLine(); // Consumir salto de línea.
            }
            // Ejemplo de uso de switch como expresión.
            switch (opciones) {
                case "+" -> resultado = suma(a, b);
                case "-" -> resultado = resta(a, b);
                //En el siguiente caso se ha usado una expresión.
                case "*" -> resultado = a*b;
                case "/" -> resultado = division(a, b);
                case "raiz" -> resultado = Math.sqrt(a);
                case "valorabs" -> resultado = Math.abs(a);
                case "logaritmo" -> resultado = Math.log(a);
                case "funcionexp" -> resultado = Math.exp(a);
                case "seno" -> resultado = Math.sin(a);
                case "coseno" -> resultado = Math.cos(a);
                case "tangente" -> resultado = Math.tan(a);
                case "arcosen" -> resultado = Math.asin(a);
                case "arcotang" -> resultado = Math.atan(a);
                case "redondeo" -> resultado = Math.round(a);
                case "acumulador" -> resultado = acumulador(a);
                case "primo" -> {
                    // conversión de tipo explícita.
                    primos((int)a);
                }
                case "Fibonacci" -> {
                    // Ejemplo de llamada a la función.
                    hastaFibonacci((int) a);                    
                }
                case "Positivo" -> {
                    System.out.println(esPositivo(a));
                }
                case "Mayor" -> {        
                    System.out.println("Es mayor: " + esMayor(a,b));
                    resultado = 0;
                }
                case "factorial" -> {
                    System.out.println(a+"!: "+factorial (a));
                }
                case "truncar" -> resultado= truncar (a);
                case "tabla" -> {
                    //Ejemplo de bucle anidado dependiente.
                    for (int i=1; i<=a; i++) {
                        for (int j=1; j<=i; j++) {
                        System.out.print(j);
                        }
                        System.out.println();
                    }
                }
                case "rango" -> {
                    double x = Math.random()*100+1;
                    double y = Math.random()*100+1;
                    int rangoAbajo = (int) x;
                    int rangoArriba =(int) y;
                    if (rangoAbajo>rangoArriba)
                    System.out.println("[" + rangoArriba + " , " + rangoAbajo + "]");
                }
                
                default -> resultado = 0;
            }

            if (resultado != 0) {
                System.out.println("Resultado: " + resultado);
            }
        } while (!opciones.equalsIgnoreCase("s"));
    }

    public static double suma(double a, double b) {
        //Ejemplo de operadores aritméticos.
        return a + b;
    }

    //Ejemplo de función
    public static double resta(double a, double b) {
        //Ejemplo de return en una función
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        //Ejemplo de operadores lógicos y de un if de una línea.
        if (a != 0 && b != 0) 
            return a / b;
        
        System.out.println("Error: División por cero.");
        return 0;
    }

    public static double acumulador(double a) {
        double sumador = 0;
        final double EULER = Math.E;
        for (double i = 0; i <= 10; i += 0.87) {
            /*En la siguiente linea tenemos un operador opera y asigna:
            sumador =sumador+EULER...*/
            sumador += EULER * a;
        }
        return sumador;
    }

    public static void hastaFibonacci(int a) {
        int elPrimero = 0, elSegundo = 1, siguiente;
        System.out.println("Los números de la serie Fibonacci hasta " + a + " son: ");
        //Ejemplo de un while.
        while (elPrimero < a) {
            System.out.print(elPrimero + " ");
            siguiente = elPrimero + elSegundo;
            elPrimero = elSegundo;
            elSegundo = siguiente;
        }
        System.out.println();
    }

    public static double esMayor(double a, double b) {
        //En la siguiente línea aparece un operador ternario.
        return a > b?a:b;
    }
    
    public static boolean esPositivo(double a) {
        //Esta funcion te devuelve un operador relacional (mayor o igual).
        return a>=0;
    }
    
    public static void primos(int x) {
        int num = x;
        
        if (x > 2) {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    // Ejemplo de salida anticipada break.
                    System.out.println("no es primo");
                    break;
                } else {
                    System.out.println("es primo");
                    break;
                }
            }
        }
    }
    
    /**
    * Calcula el factorial de un número n.
    * @param a es el numero al que le vamos a calcular el factorial.
    * @return the results.
    */
    public static double factorial (double a){
      //La variable fact es local y sólo se podrá usar en este bloque.
      double fact = 1;
      //Ejemplo de un bucle for.
      for(double i = a; i >= 1; --i) {
         fact = i * fact;
      }
    return fact;
    }
    /**
     * Funcion que trunca un número n
     * @param a es el número introducido con decimales a truncar
     * @return número truncado
     */
    //Esto es una declaración de funcion donde "a" es un parámetro de la misma.
    public static double truncar (double a){
        return Math.floor(a);
    }
    
    public static double rango(double a, double b) { 
    // Calcula el rango entre dos números 
    return Math.abs(a - b); }
    }