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
	
	@Test
	public void PonerParNuevoEnTablaVacia(){
		AsocArray a= new AsocArray();
		a.put("nombre","luis");
		assertEquals(a.tabla.c,"nombre");
		assertEquals(a.tabla.v,"luis");
		assertNull(a.tabla.sig);
	}
}
