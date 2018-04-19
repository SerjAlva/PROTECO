public class Barra{
	public int altura;
	public int grapher;

	public boolean hasLeft(Barra [] b1, int x){
		if(x != 0){
			//if(b1[x-1].altura != 0)
				return true;
		}
		return false;
	}

	public boolean hasRight(Barra [] b1, int x){
		if(x != b1.length-1){
			//if(b1[x+1].altura != 0)
				return true;
		}
		return false;
	}

	public int water(Barra [] b1, int x){
		int mayorizq = 0;
		int mayorder = x+1;
		for(int i = 1; i<x; i++){
			if(b1[mayorizq].altura < b1[i].altura)
				mayorizq = i;
		}
		for(int i = x+1; i<b1.length; i++){
			if(b1[mayorder].altura < b1[i].altura)
				mayorizq = i;
		}
		if(b1[x].altura <= b1[mayorizq].altura && b1[x].altura <= b1[mayorder].altura){
			if(b1[mayorizq].altura <= b1[mayorder].altura){
				return b1[mayorizq].altura-b1[x].altura;
			}
			else
				return b1[mayorder].altura-b1[x].altura;
				
		}
		else
			return 0;
	}

	
	public void setGrapher(int mayor){
		grapher = mayor;
	}
	public int graph(){
		if(altura <= grapher){
			grapher-=1;
			return 32;
		}
		grapher-=1;
		return 2;
	}
	/*Esto imprime la gráfica de barras pero al revés
	public void setGrapher(int altura){
		grapher = altura;
	} 
	public int graph(){
		if (grapher > 0){
			grapher-=1;
			return 2;			
		}
		grapher-=1;
		return 32;
	}*/

	Barra(int altura){
		this.altura = altura;
	}
}