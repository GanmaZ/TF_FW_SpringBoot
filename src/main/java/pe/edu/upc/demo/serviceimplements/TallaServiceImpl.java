package pe.edu.upc.demo.serviceimplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Talla;
import pe.edu.upc.demo.repositories.ITallaRepository;
import pe.edu.upc.demo.serviceinterface.ITallaService;

@Service
public class TallaServiceImpl implements ITallaService {

	@Autowired
	private ITallaRepository tallaRepository;

	@Override
	public List<Talla> list() {
		// TODO Auto-generated method stub
		return tallaRepository.findAll();
	}

	// av
}
