package tests;

import source.Line;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestLine {
	
	Line l1=new Line(1,1,2,2);
	Line l2=new Line(-1,-1,5,7);
	
	@Test
	public void testCoeficienteAngular() {
			assertTrue("coeficiente correto", l1.coeficienteAngular()==1);
	}
	
	@Test
	public void testCoeficienteLinear() {
		float a=l1.coeficienteAngular();
		
		assertTrue("coeficiente correto", l1.coeficienteLinear(a)==0);
	}
	
	@Test
	public void testIntersessao() {
		assertTrue("se cruzam",l1.intersessao(l2));
	}

}