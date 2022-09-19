package com.NUExpenseManagementSystem.Services;

import java.util.List;

import com.NUExpenseManagementSystem.Models.DivisionModel;

public interface DivisionService {

	public List<DivisionModel> getDivisionList();

	public DivisionModel registerDivision(DivisionModel divisionModel);

	public DivisionModel getSingleDivision(long searchId);

	public DivisionModel updateDivision(DivisionModel divisionModel);

}
