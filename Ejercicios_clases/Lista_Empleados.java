import java.util.*;
import java.util.Scanner;
import Personal.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import Personal.java;

public class Lista_Empleados {
    public  static void main(String[] args) {
        String.path=("C:\\Users\\pame\\Desktop\\INFO2021esPECIALIZACION\\Isla_Pamela_Info2021\\Ejercicios_clases\\Empleados.txt")
        
        List<Personal>pers=new ArrayList<>();

        Personal a1= new Personal("ABUGAUCH", "NATALI SOLANGE", 19/10/1999, 42217764, 27-42217764-2, "Febrero- Diciembre",250000);

        Personal a2=new Personal("ACOTTO", "ABRIL",17/04/2000,32836060,27-32836060-3,"Febrero-Diciembre",350000);
        Personal a3= new Personal("ACUÑA" ,"AYELEN LAURA", 8/07/1999,42053266,27-42053266-6,"Febrero-Diciembre",450000);
        Personal a4=new Personal("ALANIZ" ,"CARLA",12/12/1996,39971941,27-39971941-6,"Febrero-Diciembre",555000);
        Personal a5= new Personal("ALTAMIRANO"," SERGIO EDGARDO EZEQUIEL",07/11/1993,39073094,20-39073094-3,"Febrero Diciembre",650545);
        Personal a6=new Personal("ALVAREZ" ,"FABIANA ANDREA", 20/01/1996,394949243,27-39494923-3,"Febrero-Diciembre",789258);
        Personal a7= new Personal("ALVAREZ"," ANRIQUE PAMELA SOLEDAD", 19/8/1992, 36631583,27-36631583-2,"Febrero-Diciembre",456788);
        Personal a8=new Personal("ANDAHUA"," GONZALEZ CARLOS DAVID", 01/07/1998, 95736424,20-95736424-2,"Febrero-Diciembre",123586);
        Personal a9= new Personal("ARCE","MAIRA NATALIA",06/12/1999,42336357,27-42336657-0,"Febrero-Diciembre",250000);
        Personal a10=new Personal("AREVALO"," DANIELA BELEN",11/9/1992,36433008,27-36433008-7,"Febrero-Diciembre",350000);
        Personal a11= new Personal("ASTRADA"," DEBORA DAIANA",07/02/1999,41762269,27-41762269-7,"Febrero-Diciembre",250000);
        Personal a12=new Personal("BANEGAS","LUCAS MAURO", 05/11/1980 ,28425992, 20-28425992-1, "Febrero-Diciembre",350000);
        Personal a13= new Personal("BARITAUD", "ANA KARINA",20/02/1973, 23195639,27-23195639-0,"Febrero-Diciembre",250000);
        Personal a14=new Personal("BARREDA PEREZ", "MILENKA CELESTE",8/12/1997 ,40685744, 27-40685744-7,"Febrero-Diciembre",350000);
        Personal a15= new Personal("BARRERA", "LUDMILA AYELEN", 11/11/1999, 42895342 ,27-42895342-3 ,"Febrero Diciembre",250000);
        Personal a16=new Personal("BAYARRI ALBORNOZ"," JULIETA ANDREA", 18/01/1997,40109407,27-40109407-0,"Febrero-Diciembre",350000);
        Personal a17=new Personal("CABRAL","LORENA FLORENCIA", 06/9/1999,42107432,27-42107432-7,"Febrero Diciembre",987544);
        Personal a18=new Personal("CABRERA" ,"ANGEL FRANCISCO", 15/05/2000, 42669101, 23-42669101-9,"Febrero Diciembre",6535854);
        Personal a19=new Personal("CABRERA SILVA", "KEVIN NAHUEL", 10/03/2000, 42978906,20-42978906-1, "Febrero Diciembre",7894566);
        Personal a20=new Personal("CALDERON" ,"EMILSE CAROLINA", 25/03/2000, 44347060, 27-44347060-9, "Febrero Diciembre",126753);
        Personal a21=new Personal("CALDERON", "LOURDES IVANA", 10/10/1997,40502560,23-40502560-4,"Febrero Diciembre",963258);
        Personal a22=new Personal("CALDERON", "BAUTISTA ABIGAIL", 11/9/1998, 41588635, 27-41588635-2,"Febrero Diciembre",147258);
        Personal a23=new Personal("CAMPOS", "LOURDES", 03/11/1997, 40686579, 27-40686579-2, "Febrero Diciembre",357159);
        Personal a24=new Personal("CANCHO OCHOA", "WALDYR", 23/07/1997, 95694858, 20-95694858-5 ,"Febrero Diciembre",789654);
        Personal a25=new Personal("CARNERO"," MAXIMILIANO ARIEL", 19/10/1999, 42259398 ,20-42259398-6,  "Febrero Diciembre",120354);
        Personal a26=new Personal("CARREÑO", "CARLA ANTONELLA", 28/9/1999, 42160691, 27-42160691-4,  "Febrero Diciembre",321456);
        Personal a27=new Personal("CARRIZO", "MARISA ROXANA", 13/01/1977, 25794136, 27-25794136-7,  "Febrero Diciembre",987654);
        Personal a28=new Personal("CASAS", "NAIR AGUSTINA",30/12/1999, 42336282, 27-42336282-6 ,"Febrero Diciembre",564789);
        Personal a29=new Personal("CASTILLO SALCEDO", "AYELEN ALEJANDRA", 02/12/1999 ,42336802, 27-42336802-6 , "Febrero Diciembre",456357);
        Personal a30=new Personal("CASTILLO SALCEDO", "ELIZABETH REBECA", 04/04/1996, 42218041, 27-42218041-4,"Febrero Diciembre",987321);
        Personal a31=new Personal("CAVALLI FERNANDEZ", "AGOSTINA", 02/04/1999, 41811251, 23-41811251-4 , "Febrero Diciembre",147258);
        Personal a32=new Personal("CEBALLOS","ALICIA DEL CARMEN", 19/11/1967,18594442, 27-18594442-0 , "Febrero Diciembre",365412);
        Personal a33=new Personal("CHAVARRIA TOLA", "ROCIO",16/04/2000,94262277, 27-94262277-0,"Febrero-Diciembre",789621);
        Personal a34=new Personal("CHAVEZ" ,"LEONELA SABRINA",9/8/1999,42107364,27-42107364-9,"Febrero-Diciembre",963571);
        

        pers.add(a1);
        pers.add(a2);
        pers.add(a3);
        pers.add(a4);
        pers.add(a5);
        pers.add(a6);
        pers.add(a7);
        pers.add(a8);
        pers.add(a9);
        pers.add(a10);
        pers.add(a11);
        pers.add(a12);
        pers.add(a13);
        pers.add(a14);
        pers.add(a15);
        pers.add(a16);
        pers.add(a17);
        pers.add(a18);
        pers.add(a19);
        pers.add(a20);
        pers.add(a21);
        pers.add(a22);
        pers.add(a23);
        pers.add(a24);
        pers.add(a25);
        pers.add(a26);
        pers.add(a27);
        pers.add(a28);
        pers.add(a29);
        pers.add(a30);
        pers.add(a31);
        pers.add(a32);
        pers.add(a33);
        pers.add(a34);
        }

        for (Personal personal:pers){
            System.out.println("Apellido:"+ personal.Apellido+ "Nombre:" +personal.Nombre + "FechaNacimiento: "+personal.Fechanacimiento+ "Dni:"+personal.Dni+"cuil:"+personal.Cuil+  "Periodo de Liquidacion: "+personal.Perido_liq + "Monto: "+ personal.Monto);
        }
        public class Personal {
            private String apellido;
            private String  nombre;
            private String fechanacimiento;
            private int dni;
            private int cuil;
            private String periodo_liq;
            private int monto;
        
            public Personal(){
        
            }
            public Personal(String apellido,String nombre, String fechanacimiento, int dni, int cuil, String periodo_liq, int monto){
                this.apellido=apellido;
                this.nombre=nombre;
                this.fechanacimiento=fechanacimiento;
                this.dni=dni;
                this.cuil=cuil;
                this.periodo_liq=periodo_liq;
                this.monto=monto;
            }
            public String getApellido(){
                return apellido;
            }
            public void setApellido(String apellido){
                this.apellido=apellido;
            }
        
            public String getNombre(){
                return nombre;
        
            }
            public  void setNombre(String nombre){
                this.nombre=nombre;
            }
            public String getFechanacimiento(){
                return fechanacimiento;
            }
            public void setFechanacimiento(String fechanacimiento){
                this.fechanacimiento=fechanacimiento;
            }
            public int getDni(){
                return dni;
            }
            public void setDni(int dni){
                this.dni=dni;
            }
            public int getCuil(){
                return cuil;
            }
            public void setCuil(int cuil){
                this.cuil=cuil;
        
            }
            public String getPeriodo_liq(){
                return periodo_liq;
            }
            public void setPeriodo_liq(String periodo_liq){
                this.periodo_liq=periodo_liq;
            }
            public int getMonto(){
                return monto;
            }
            public void setMonto(int monto){
                this.monto=monto;
            }
            String sFichero = "empleado.txt";
File fichero = new File(sFichero);

if (fichero.exists()) {...}
BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
for (int x=0;x<10;x++)
   bw.write("Fila numero " + x + "\n");



    }
   




    
    
}
