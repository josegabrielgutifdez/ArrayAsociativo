import static org.junit.Assert.*;

import org.junit.Test;


public class AsocArrayTest {
	
	@Test
	public void CrearTablaVacia(){
		AsocArray a = new AsocArray();
		assertNull(a.tabla.c);
		assertNull(a.tabla.v);
		assertNull(a.tabla.sig);
	}
}
