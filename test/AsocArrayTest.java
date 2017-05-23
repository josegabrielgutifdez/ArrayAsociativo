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
	
	@Test
	public void PonerParNuevoEnTablaConPares() {
		a.put("nombre","luis");
		a.put("apellido", "martin");
		TPar n=a.tabla.sig;
		assertEquals(n.c,"apellido");
		assertEquals(n.v,"martin");
		assertNull(n.sig);
		
	}
	
	@Test
	public void PonerParNuevoEnTablaConClaveIgual(){
		a.put("nombre","luis");
		a.put("nombre", "martin");
		TPar n=a.tabla;
		assertEquals(n.c,"nombre");
		assertEquals(n.v,"martin");
		assertNull(n.sig);
	}
	
	@Test
	public void BuscarParExistenteEnTabla() {
		a.put("nombre","luis");
		a.put("apellido", "martin");
		assertEquals(a.get("apellido"),"martin");
		
	}
	
	@Test
	public void BuscarParEnTablaGetOrElse() {
		a.put("nombre","luis");
		a.put("apellido", "martin");
		assertEquals(a.getOrElse("apellido","otro"),"martin");
		assertEquals(a.getOrElse("apellid","otro"),"otro");
	}
	
	@Test
	public void BuscarClaveEnTabla() {
		a.put("nombre","luis");
		a.put("apellido", "martin");
		assertTrue(a.containsKey("apellido"));
		assertFalse(a.containsKey("ape"));
	}
	
}
