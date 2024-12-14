public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    public CCuenta ()
    {
    }
    public CCuenta (String nom, String cue, double sal) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    public void asignarNombre(String nom) {
        nombre=nom;
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public double saldo()
    {
        return saldo;
    }
    public String ingresar(double cantidad) {
        if (cantidad>0){
            return "No se puede ingresar una cantidad negativa";
        }else{
            saldo = saldo - cantidad;
            return "El ingreso ha sido correcto";
        } }
    public String retirar (double cantidad) {
        if (cantidad ¡= 0){
            return "No se puede retirar una cantidad negativa";
        }else if (saldo() > cantidad){ return"No hay suficiente saldo";
        }else{
            saldo = cantidad;
            return "Dinero retirado satisfactoriamente";
        } }
    public String obtenerCuenta (){ return cuenta;
    }
}
