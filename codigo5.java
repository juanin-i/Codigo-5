
//

Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni);  // Convertir la cadena a entero
        
        int afo = 0;
        int noAfo = 0;
        
        // Convertir el número a una variable int para la manipulación
        int num = c;
        
        while (num > 0) {
            int digito = num % 10;
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            num /= 10;  // Actualizar la variable num
        }
        
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        
        s.close();  // Cerrar el scanner para liberar recursos
    }
    }