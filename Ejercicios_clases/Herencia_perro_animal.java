
public class Herencia_perro_animal extends AnimalEncapsulamiento {
    private String raza;

    public Herencia_perro_animal(String nombre, String tipo_alimento, int edad, int peso){
        super(nombre, tipo_alimento, edad, peso);
        this.raza=raza;

    }
    public String getRaza(){
        return raza;

    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public void mostrar(){
        System.out.println(getNombre()+" - "+getTipo_alimento()+" - "+getEdad()+" - "+getPeso()+" - "+getRaza());
    }
}



