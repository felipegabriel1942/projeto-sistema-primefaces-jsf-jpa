package br.com.framework.util;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * Classe utilizada para saber o que os usuarios esão fazendo no BD
 * @author pinhe
 *
 */
@Component
public class UtilFramework implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	//Organiza uma fila de acessos para os metodos
	private static ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();
	
	public synchronized static ThreadLocal<Long> geThreadLocal(){
		return threadLocal;
	}
	
}
