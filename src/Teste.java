import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import com.grupo30.dao.PesoDao;
import com.grupo30.model.Peso;

public class Teste {

	public static void main(String[] args) {
		DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		
		PesoDao pesoDao = new PesoDao();
		List<Peso> pesos = pesoDao.getAll();
		
		for(Peso peso : pesos) {
			System.out.println(peso.getCodPeso() + " - " + peso.getValor() + "kg em " + dtf.format(peso.getDtPesagem()));
		}
	}
}
