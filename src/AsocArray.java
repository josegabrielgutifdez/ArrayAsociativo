
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
			TPar c=null;
			TPar aux=tabla;
			boolean esta=false;
			do{
				if(aux.c==clave){
					esta=true;
					aux.v=valor;
				}else{
					c=aux;
					aux=aux.sig;
				}
			}while(aux!=null && !esta);
			if(!esta){	
			nuevo.c=clave;
			nuevo.v=valor;
			c.sig=nuevo;
			}
		}
	}
	
	public String get(String clave){
		String sol=null;
		TPar aux=tabla;
		while(aux!=null){
			if(aux.c==clave){
				return aux.v;
			}else{
				aux=aux.sig;
			}
		}
		return null;
	}
	
	public String getOrElse(String clave, String valorPorDefecto){
		TPar aux=tabla;
		while(aux!=null){
			if(aux.c==clave){
				return aux.v;
			}else{
				aux=aux.sig;
			}
		}
		return valorPorDefecto;
	}
	public boolean containsKey(String clave){
		TPar aux=tabla;
		while(aux!=null){
			if(aux.c==clave){
				return true;
			}else{
				aux=aux.sig;
			}
		}
		return false;
	}
	
	public boolean remove(String clave){
		boolean esta=false;
		
		if(tabla.c!=null){
			
			TPar aux=tabla;
			TPar c=null;
			
			while(aux!=null && !esta){
				
				if(aux.c==clave){
					esta=true;
				}else{
					c=aux;
					aux=aux.sig;
					
				}
			}
			if(esta){
				if(c==null ){
					if(tabla.sig==null){
						tabla.c=null;
						tabla.v=null;
					}else{
						tabla=tabla.sig;
					}
				}else{
					c.sig=aux.sig;
				}
			}
		}
		return esta;
	}
	
	public int size(){
		int cont=0;
		if(tabla.c!=null){
			TPar aux=tabla;
			while(aux!=null){
				cont++;
				aux=aux.sig;
			}
		}
		return cont;
	}
}
