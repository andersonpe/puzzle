package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe respons�vel por armazenar os m�todo que correspondem aos eventos.
 * @author Andy
 *
 */
public class EventosListeners {
	
	/**
	 * Evento: Encerrar o programa.
	 */
	public static ActionListener ENCERRAR = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	};

}
