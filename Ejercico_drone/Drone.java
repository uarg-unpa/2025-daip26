public class Drone {
    //atributos
    private String modelo;
    private int alturaMax;
    private double nivelBateria;
    private double pesoMax;
    private double cargaActual;
    //conntructor
    public Drone(String modelo, int alturaMax, double nivelBateria, double pesoMax, double cargaActual){
        this.modelo=modelo;
        this.alturaMax=alturaMax;
        this.nivelBateria=nivelBateria;
        this.pesoMax=pesoMax;
        this.cargaActual=cargaActual;
    }
    //getter y setter
    public String getModelo(){
        return modelo;
    }
    public int getAlturaMax(){
        return alturaMax;
    }
    public double getNivelBateria(){
        return nivelBateria;
    }
    public double getPesoMax(){
        return pesoMax;
    }
    public double getCargaActual(){
        return cargaActual;
    }
    
    public void setModelo( String modelo){
        this.modelo=modelo;
    }
    public void setAlturaMax(int alturaMax){
        this.alturaMax=alturaMax;
    }
    public void setNivelBateria( double nivelBateria){
        this.nivelBateria=nivelBateria;
    }
    public void setPesoMax( double pesoMax){
        this.pesoMax=pesoMax;
    }
    public void setCargaActual(double cargaActual){
        this.cargaActual=cargaActual;
    }
    //metodo
    public boolean puedeDespegar(){
        return nivelBateria>20;
    }
    public int calcularViajes(){
        if(cargaActual<=0){
            return 0;
        }
    
    int Viajes= (int)(cargaActual/pesoMax);
    if (cargaActual%pesoMax !=0){
        Viajes++;
    }  
    return Viajes;
    }
    public void mostrarInforme(){
        System.out.println("Informe del estado del DRONE");
        System.out.println("Modelo DRONE: "+modelo);
        System.out.println("Altura Maxima de vuelo: "+alturaMax);
        System.out.println("Nivel de Bateria: "+nivelBateria+ "%");
        System.out.println("Peso Maximo: "+pesoMax+"kg");
        System.out.println("Carga actual de peso: "+cargaActual+ "kg");
    }
}
