package src.main.java.dto;


import javax.persistence.Id;

public class orden {
    @Id
    public String id;
    public String metodo_de_pago;
    public String direccion;
    public String ciudad_de_envio;

    public orden(String id, String metodo_de_pago, String direccion, String ciudad_de_envio) {
        this.id = id;
        this.metodo_de_pago = metodo_de_pago;
        this.direccion = direccion;
        this.ciudad_de_envio = ciudad_de_envio;

    }
    public orden(){

    }

   @Override
    public String  toString() {
        return "orden{" +
                "id='" + id + '\'' +
                ", metodo_de_pago='" + metodo_de_pago + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad_de_envio='" + ciudad_de_envio + '\'' +
                '}';
    }
}
