public class Productos {
    String marca;

    String tipo;
    Double precio;

    public Productos(String marca, String tipo, Double precio) {
        this.marca = marca;

        this.tipo = tipo;
        this.precio = precio;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {

        this.precio = precio;
    }


}
