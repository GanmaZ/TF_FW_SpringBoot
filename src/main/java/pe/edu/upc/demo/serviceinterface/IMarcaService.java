package pe.edu.upc.demo.serviceinterface;

import java.util.List;

import pe.edu.upc.demo.entities.Marca;

public interface IMarcaService {

	public void Insert(Marca marca);

	public List<Marca> list();

}
