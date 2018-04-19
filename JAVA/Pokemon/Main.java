import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		Pokemon p1 = new Pokemon(150, 50);
		Pokemon p2 = new Pokemon(150, 50);
		Ataque lanzallamas = new Ataque("lanzallamas", 30);
		Ataque hojas_navaja = new Ataque("hojas_navaja", 30);
		Ataque hidro_bomba = new Ataque("hidro_bomba", 30);
		Ataque placaje = new Ataque("placaje", 20);
		Ataque cabezaso = new Ataque("cabezaso", 25);
		Ataque mordisco = new Ataque("mordisco",20);
		Ataque patada_baja = new Ataque("patada_baja", 27);
		Ataque lanzarocas = new Ataque("lanzarocas", 30);
		Ataque impactrueno = new Ataque("impactrueno", 30);
		Ataque golpe_roca = new Ataque("golpe_roca", 25);
		Ataque golpe_karate = new Ataque("golpe_karate", 28);
		Ataque latigo_sepa = new Ataque("latigo_sepa", 30);
		Ataque corte = new Ataque("corte", 25);
		p1.ataque1 = lanzallamas;
		p1.ataque2 = placaje;
		p1.ataque3 = mordisco;
		p1.ataque4 = golpe_karate;
		p2.ataque1 = latigo_sepa;
		p2.ataque2 = hojas_navaja;
		p2.ataque3 = cabezaso;
		p2.ataque4 = corte;
		p1.turno = true;
		p2.turno = false;

		while(p1.vida > 0 || p2.vida > 0){
			if(p1.turno){
				System.out.println("Es el turno de " + p1.nombre );
				System.out.println("Qué ataque deseas usar? \n\t1)" + p1.ataque1.nombre + "\n\t2)" + p1.ataque2.nombre + "\n\t3)" + p1.ataque3.nombre + "\n\t4)" + p1.ataque4.nombre);
				opcion = sc.nextInt();
				switch (opcion){
					case 1:
						p2.vida = p2.vida - p1.ataque1.dano;
						break;
					case 2:
						p2.vida = p2.vida - p1.ataque2.dano;
						break;
					case 3:
						p2.vida = p2.vida - p1.ataque3.dano;
						break;
					case 4:
						p2.vida = p2.vida - p1.ataque4.dano;
						break;
				}
				p1.turno=false;
				p2.turno=true;
			}
			else{
				System.out.println("Es el turno de " + p2.nombre );
				System.out.println("Qué ataque deseas usar? \n\t1)" + p2.ataque1.nombre + "\n\t2)" + p2.ataque2.nombre + "\n\t3)" + p2.ataque3.nombre + "\n\t4)" + p2.ataque4.nombre);
				opcion = sc.nextInt();
				switch (opcion){
					case 1:
						p1.vida = p1.vida - p2.ataque1.dano;
						break;
					case 2:
						p1.vida = p1.vida - p2.ataque2.dano;
						break;
					case 3:
						p1.vida = p1.vida - p2.ataque3.dano;
						break;
					case 4:
						p1.vida = p1.vida - p2.ataque4.dano;
						break;
				}
				p2.turno=false;
				p1.turno=true;
			}
		}
		if(p1.vida<=0)
			System.out.println("El ganador es " + p2.nombre);
		else
			System.out.println("El ganador es " + p1.nombre);
	}
}