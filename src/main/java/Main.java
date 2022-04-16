public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(24,"jose",987532753,2000.0);
        Trabajdor trabajdor = new Trabajdor(32,"alex",234128976,15000.0);

        System.out.println("cliente: "+cliente.getNombre()
                          +" "+cliente.getEdad()
                          +" "+cliente.getTelefono()
                          +" "+cliente.getCredito());

        System.out.println("trabajador: "+trabajdor.getNombre()
                +" "+trabajdor.getEdad()
                +" "+trabajdor.getTelefono()
                +" "+trabajdor.getSalario());
    }


}
