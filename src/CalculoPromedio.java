import java.sql.Array;

public class CalculoPromedio
{
    public String alumno="Osvaldo";

    public int [] calificaciones = {100,100,100,90,100};
    public int calculoPromedio (int [] materias){
        int suma=0,promedio=0;
        for(int i=0;i< materias.length;i++){
            suma+=materias[i];

        }
        promedio=suma/materias.length;
        //System.out.println(suma);
        //System.out.println("promedio: "+promedio);
        return promedio;
    }
    public char calificacionFinal (int promedio2) {
        char letra='F';
        if (promedio2<=50){
        letra='F';
        }
        else if (promedio2>=51 && promedio2<=60){
            letra='E';

        }
        else if (promedio2>=61 && promedio2<=70){
            letra='D';

        }
        else if (promedio2>=71 && promedio2<=80){
            letra='C';
        }
        else if (promedio2>=81 && promedio2<=90){
            letra='B';
        }
        else if (promedio2>=91 && promedio2<=100){
            letra='A';
        }
        return letra;
    }
    public void imprimeResultado(String nombre, int promedio, char calificacion){
        System.out.println("nombre del estudiante: "+nombre);
        for(int i=0;i< calificaciones.length;i++){
            System.out.println("calificacion "+(i+1) +": "+ calificaciones[i]);

        }
        System.out.println("promedio: "+promedio);
        System.out.println("calificacion: "+calificacion);
    }

    public static void main (String [] args) {
        CalculoPromedio cp= new CalculoPromedio();
        int promedioFinal=cp.calculoPromedio(cp.calificaciones);
//        System.out.println("nombre del estudiante: "+cp.alumno);
//        System.out.println(promedioFinal);
//        System.out.println(calificacionFinal(promedioFinal));
        cp.imprimeResultado(cp.alumno, cp.calculoPromedio(cp.calificaciones), cp.calificacionFinal(promedioFinal));
    }

}
