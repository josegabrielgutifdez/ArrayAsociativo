
public class AsocArray {
	public TPar tabla;
	
	public AsocArray(){
		tabla=new TPar();
		tabla.sig=null;
	}
	
	public void put(String clave, String valor){
		TPar nuevo=new TPar();
		if(tabla.c==null){
		tabla.c=clave;
		tabla.v=valor;
		}
		else{
			TPar aux=tabla;
			while(aux.sig!=null){
				aux=aux.sig;
			}
			nuevo.c=clave;
			nuevo.v=valor;
			aux.sig=nuevo;
		}
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
