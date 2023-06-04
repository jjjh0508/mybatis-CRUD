package com.greedy.section01.remixconfig.dao;

import java.util.List;

import com.greedy.section01.remixconfig.DTO.InsertDTO;
import com.greedy.section01.remixconfig.DTO.ModifyPostDTO;
import com.greedy.section01.remixconfig.DTO.PostDTO;

public interface PostDAO { //DAO는 java식으로 인터페이스로 만듬
	// 데이터 베이스와 매핑되어 쿼리를 수행
	
	List<PostDTO> selectAllPost();

	PostDTO selectPost(int code);

	int modifyPost(ModifyPostDTO postDTO);

	int deletePost(int code);

	int insertPost(InsertDTO postDTO);
	
	

}
