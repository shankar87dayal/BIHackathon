package com.hackathon.restws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.restws.model.Jams;
import com.hackathon.restws.repos.Jamsrepository;

@Service
public class JamsServiceImpl implements JamsService {

	@Autowired
	Jamsrepository repository;
	Map<Long, Jams> Jamss = new HashMap<>();
	long currentId = 123;

	public JamsServiceImpl() {
		init();
	}

	void init() {
		Jams Jams = new Jams();
		Jams.setId(currentId);
		Jams.setWid(51256);
		Jams.setPid(53089);
		Jams.setRemarks("QA site is down");
		Jams.seteId("IN1349");
		Jamss.put(Jams.getId(), Jams);
	}

	@Override
	public List<Jams> getJamss() {
		/*Collection<Jams> results = Jamss.values();
		List<Jams> response = new ArrayList<>(results);
		return response;*/
		return repository.findAll();
	}

	@Override
	public Jams getJams(Long id) {
		/*if (Jamss.get(id) == null) {
			throw new NotFoundException();
		}
		return Jamss.get(id);*/
		return repository.findOne(id);
	}

	@Override
	public Response createJams(Jams Jams) {
		Jams.setId(++currentId);
		//Jamss.put(Jams.getId(), Jams);
		Jams save = repository.save(Jams);
		return Response.ok(save).build();
		
	}

	@Override
	public Response updateJams(Jams Jams) {

		/*Jams currentJams = Jamss.get(Jams.getId());

		Response response;
		if (currentJams != null) {
			Jamss.put(Jams.getId(), Jams);
			response = Response.ok().build();
		} else {
			throw new JamsBusinessException();
		}
		return response;*/
		Jams save = repository.save(Jams);
		return Response.ok(save).build();
	}

	@Override
	public Response deleteJams(Long id) {
		/*Jams Jams = Jamss.get(id);

		Response response;

		if (Jams != null) {
			Jamss.remove(id);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;*/
		repository.delete(id);
		return Response.ok().build();
	}

}
