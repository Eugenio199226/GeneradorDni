package group.DniGenerator;

import org.junit.Test;

public class TestDni {
	Dni dni = new Dni();
	Generador gen = new Generador();
	@Test
	public void testAComparadorTrue() 
	{
		for(int i=0;i<=10;i++) 
		{
			String dniGenerado =gen.generadorNum();
			System.out.println(dniGenerado);
			dni.validadorDni(dniGenerado);
		}

	}
}
