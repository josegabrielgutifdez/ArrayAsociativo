import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AsocArrayTest {
	
	private AsocArray a ;
	
	@Before
	public void setUp(){
		a= new AsocArray();
	}
	
	@Test
	public void CrearTablaVacia(){
		
		assertNull(a.tabla.c);
		assertNull(a.tabla.v);
		assertNull(a.tabla.sig);
	}
	
	@Test
	public void PonerParNuevoEnTablaVacia(){
		
		a.put("nombre","luis");
		assertEquals(a.tabla.c,"nombre");
		assertEquals(a.tabla.v,"luis");
		assertNull(a.tabla.sig);
	}
}
