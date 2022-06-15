package com.callor.selfit.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.callor.selfit.model.StartMenuDTO;
import com.callor.selfit.model.WorkoutDTO;

public interface SelfitDao {
	
	public List<WorkoutDTO> workOutview();
	public List<StartMenuDTO> selectStartMenu();
	public List<StartMenuDTO> selectDaySet(String sc_num);
	
	public List<StartMenuDTO> selectByScNum(String sc_num);
	public List<WorkoutDTO> selectWorkout(String sc_id);
	public WorkoutDTO seleDayHealth(@Param("sc_id") String sc_id,@Param("sc_listid") String listid);
}
