package com.t3.musicchart.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.t3.musicchart.dto.ChartDto;

@Repository
public class ChartDao {

	@Autowired
	SqlSession sqlsession;
	
	public List<ChartDto> JuneSelect() {
		List<ChartDto> JuneList = sqlsession.selectList("chart.select_june");
		return JuneList;
	}
	
	public List<ChartDto> JulySelect() {
		List<ChartDto> JulyList = sqlsession.selectList("chart.select_july");
		return JulyList;
	}
	
	public List<ChartDto> AugustSelect() {
		List<ChartDto> AugustList = sqlsession.selectList("chart.select_august");
		return AugustList;
	}
}
