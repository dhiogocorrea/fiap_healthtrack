import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.grupo30.dao.PesoDao;
import com.grupo30.model.Peso;

public class Teste {

	public static void main(String[] args) throws ParseException {
		DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
		
		PesoDao pesoDao = new PesoDao();
		
		pesoDao.insert(new Peso(82.0, dtf.parse("10/09/2020")));
		pesoDao.insert(new Peso(80.0, dtf.parse("26/09/2020")));
		pesoDao.insert(new Peso(78.0, dtf.parse("05/10/2020")));
		pesoDao.insert(new Peso(77.0, dtf.parse("10/10/2020")));
		pesoDao.insert(new Peso(76.0, dtf.parse("20/10/2020")));
		
		List<Peso> pesos = pesoDao.getAll();
		
		for(Peso peso : pesos) {
			System.out.println(peso.getCodPeso() + " - " + peso.getValor() + "kg em " + dtf.format(peso.getDtPesagem()));
		}
	}
}
