package pe.edu.upc.demo.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Marca;
import pe.edu.upc.demo.repositories.IMarcaRepository;
import pe.edu.upc.demo.serviceinterface.IMarcaService;

@Service
public class MarcaServiceImpl implements IMarcaService {

	@Autowired
	private IMarcaRepository marcaRepository;

	@Override
	public void Insert(Marca marca) {
		marcaRepository.save(marca);

	}

	@Override
	public List<Marca> list() {
		// TODO Auto-generated method stub
		return marcaRepository.findAll();
	}

}
