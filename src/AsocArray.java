
public class AsocArray {
	public TPar tabla;
	
	public AsocArray(){
		tabla=new TPar();
		tabla.sig=null;
	}
	
	public void put(String clave, String valor){
		tabla.c=clave;
		tabla.v=valor;
	}
	
	public String get(String clave){
		return null;
	}
	
	public String getOrElse(String clave, String valorPorDefecto){
		return null;
	}
	
	public boolean remove(String clave){
		return false;
	}
	
	public int size(){
		return 0;
	}
}
