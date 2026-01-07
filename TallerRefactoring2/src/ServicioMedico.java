public class ServicioMedico {
    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    // CORRECCIÓN: Usamos los setters en lugar de asignación directa
    // Esto asegura que la validación (if costo < 0) se ejecute al crear el objeto
        setCosto(costo);
        setDuracion(duracion);
        }

    public void setCosto(double costo) {
        if(costo < 0){
            System.out.println("El costo no puede ser menor a 0");
            return;
        }
        this.costo = costo;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {

        this.duracion = duracion;
    }
}
