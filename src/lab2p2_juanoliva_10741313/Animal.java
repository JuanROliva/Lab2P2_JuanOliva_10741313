package lab2p2_juanoliva_10741313;
public class Animal {
    
    private String nombreCientifico;
    private String nombreComun;
    private String habitat;
    private String alimentacion;
    private String descripcionRasgos;
    private String distribucionGeografica;
    private int vida;

    public Animal() {
    }

    public Animal(String nombreCientifico, String nombreComun, String habitat, String alimentacion, String descripcionRasgos, String distribucionGeografica, int vida) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripcionRasgos = descripcionRasgos;
        this.distribucionGeografica = distribucionGeografica;
        this.vida = vida;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDescripcionRasgos() {
        return descripcionRasgos;
    }

    public void setDescripcionRasgos(String descripcionRasgos) {
        this.descripcionRasgos = descripcionRasgos;
    }

    public String getDistribucionGeografica() {
        return distribucionGeografica;
    }

    public void setDistribucionGeografica(String distribucionGeografica) {
        this.distribucionGeografica = distribucionGeografica;
    }

    public int getVida() {
        return vida;
    }

    public boolean setVida(int vida) {
        if (vida>0) {
            this.vida = vida;
            return true;
        }else{
            return false;
        }
    }
    
    public void comer(Animal a){
        vida += a.getVida();
    }
}
