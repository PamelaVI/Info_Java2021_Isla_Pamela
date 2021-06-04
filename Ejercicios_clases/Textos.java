
//lectura de archivos
import java.io.FileReader;
import java.io.BufferedReader;
public class Textos {
    public  static void main(String[] args){
        FileReader archivo;
        BufferedReader lector;
        try{
            archivo = new FileReader("C:\\Users\\pame\\Desktop\\INFO2021esPECIALIZACION\\Isla_Pamela_Info2021\\Ejercicios_clases\\alumnos.txt");
            if (archivo.ready()){
                lector =new BufferedReader(archivo);
                String cadena;
                while((cadena=lector.readLine())!=null){
                    System.out.println(cadena);
                }
            }else{
                System.out.println("El archivo no puede ser leido");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
    
    

