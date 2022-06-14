package com.callor.selfit.persistance;

import java.util.List;

import com.callor.selfit.model.StartMenuDTO;
import com.callor.selfit.model.WorkoutDTO;

public interface SelfitDao {
	public List<WorkoutDTO> workOutview();
	public List<StartMenuDTO> selectStartMenu();
	public List<StartMenuDTO> selectDaySet(String sc_num);
}
