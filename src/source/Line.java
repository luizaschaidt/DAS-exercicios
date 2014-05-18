package source;

public class Line {
	
	public float x1;
	public float y1;
	public float x2;
	public float y2;
	
	public Line(float x1, float y1, float x2, float y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	

	public float coeficienteAngular(){
		float a;
		
		a=(y1-y2)/(x1-x2);		
				
		System.out.println("a=");
		System.out.println(a);

		return a;
		
	}

	public int coeficienteLinear(float a) {
		float b;
		b=y1-(a*x1);
		System.out.println("b=");
		System.out.println(b);
		return 0;
	}
	
	public float getX1() {
		return x1;
	}


	public float getY1() {
		return y1;
	}


	public float getX2() {
		return x2;
	}


	public float getY2() {
		return y2;
	}



	public boolean intersessao(Line l2) {
		float a1=this.coeficienteAngular();
		float a2=l2.coeficienteAngular();
		
		if(a1==a2){
			return false;
			//nao se cruzam, sao paralelas
		}
		else
		return true;
	}


}
