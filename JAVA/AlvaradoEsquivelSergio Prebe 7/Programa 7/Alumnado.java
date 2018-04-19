public class Alumnado{
	AlumnosAprueban a1, a2, a3;
	AlumnosReprueban r1, r2, r3;

	public Alumnado(AlumnosAprueban a1, AlumnosAprueban a2, AlumnosAprueban a3, AlumnosReprueban r1, AlumnosReprueban r2, AlumnosReprueban r3){
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
	}

	public void aprobar1(){
		a1.aprobar();
	}
	public void aprobar2(){
		a2.aprobar();
	}
	public void aprobar3(){
		a3.aprobar();
	}
	public void reprobar1(){
		r1.reprobar();
	}
	public void reprobar2(){
		r2.reprobar();
	}
	public void reprobar3(){
		r3.reprobar();
	}
}