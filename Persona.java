package Persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getDnisinletra(){
        return dnisinletra;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }

    public void setDnisinletra(int dni){
        this.dnisinletra = dni;
    }

    public void setEdad(int ed){
        if(ed >= 21){
            System.out.println("Estas hecho un chaval");
        } else {
            System.out.println("Ya estas talludito");
        }

        this.edad = ed;
    }
}
