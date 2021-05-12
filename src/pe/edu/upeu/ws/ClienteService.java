package pe.edu.upeu.ws;

public class ClienteService {
	public static void main(String[] args) {
		SueldoImpService sip=new SueldoImpService();
		SueldoDao cliente=sip.getSueldoImpPort();
		System.out.println("Sueldo Bruto");
		System.out.println(cliente.calcularSueldo(41,20));
	}
}
