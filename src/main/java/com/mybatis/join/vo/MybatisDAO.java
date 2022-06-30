package com.mybatis.join.vo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<JoinVO> selectListJoin (JoinVO vo) {
		
		return mybatis.selectList("Join.selectListJoin", vo);
		
	}
	
	public List<Spring_JoinVO> selectListJoin (Spring_JoinVO vo) {
		
		return mybatis.selectList("s-join.selectListJoin", vo);
		
	}
	
	public List<AllJoinVO> selectListJoin (AllJoinVO vo) {
		
		return mybatis.selectList("Join.selectListJoin2", vo);
		
	}
	
	public List<AllJoinVO> selectListJoin2 (AllJoinVO vo) {
		
		return mybatis.selectList("Join.selectListJoin3", vo);
		
	}

}
