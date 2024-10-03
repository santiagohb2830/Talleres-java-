// Clase Vehiculo
public class Vehiculo {
    // Atributos privados
    private String placa;
    private String marca;
    private int cilindrada;
    private double velocidadMax;
    private int caballosFuerza;
    private String tipoCombustible;
    private Motor motor;

    // Constructor 1: Recibe solo placa y marca
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    // Constructor 2: Recibe placa, marca, y los atributos del motor
    public Vehiculo(String placa, String marca, int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.placa = placa;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.velocidadMax = velocidadMax;
        this.caballosFuerza = caballosFuerza;
        this.tipoCombustible = tipoCombustible;
        this.motor = new Motor(cilindrada, velocidadMax, caballosFuerza, tipoCombustible);
    }

    // Métodos Get y Set para los atributos de Vehiculo
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Métodos Get y Set para el motor
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
