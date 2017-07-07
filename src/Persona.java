
public class Persona {
    
    String nombre;
    String apellido;
    int edad;
    
    
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String toString (){
        
        String personaString;
        
        personaString = "Nombre: "+this.nombre+", Apellido: "+this.apellido+", Edad: "+this.edad;
        
        return personaString;
    }
}
