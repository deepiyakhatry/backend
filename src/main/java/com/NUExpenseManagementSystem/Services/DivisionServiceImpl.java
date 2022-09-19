package com.NUExpenseManagementSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NUExpenseManagementSystem.Models.DivisionModel;
import com.NUExpenseManagementSystem.Repository.DivisionRepository;

@Service
public class DivisionServiceImpl implements DivisionService {
	
	@Autowired
	private DivisionRepository divisionRepository;
	
	@Override
	public List<DivisionModel> getDivisionList() {
		return divisionRepository.findAll();
	}
	
	@Override
	public DivisionModel getSingleDivision(long searchId) {
		return this.divisionRepository.findById(searchId).get();
	}

	@Override
	public DivisionModel registerDivision(DivisionModel divisionModel) {
		divisionRepository.save(divisionModel);
		return divisionModel;
	}

	@Override
	public DivisionModel updateDivision(DivisionModel divisionModel) {
		divisionRepository.save(divisionModel);
		return divisionModel;
	}

}
