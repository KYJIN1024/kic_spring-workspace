package model1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mapper.BoardMapperInter;

@Repository
public class BoardDAO {
	
	@Autowired
	private BoardMapperInter mapper;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;  // jdbcTemplate 선언
	
	public ArrayList<BoardTO> boardList() {
		ArrayList<BoardTO> boardlists = (ArrayList<BoardTO>)mapper.boardList();
		return boardlists;  // 변수 이름 수정
	}
	
	public int boardWriteOk(BoardTO to) {
		int flag = 1;
		int result = mapper.boardWriteOk(to);
		if (result == 1) {
			flag = 0;
		}
		return flag; 
	}  // 메소드 블록 제대로 닫기
	
	public BoardTO boardView(BoardTO to) {
		int result = jdbcTemplate.update(
				"update board1 set hit=hit+1 where seq=?",
				to.getSeq());

		to = jdbcTemplate.queryForObject(
				"select seq, subject, writer, date_format(wdate, '%Y-%m-%d') wdate, hit, datediff(now(), wdate) wgap from board1 order by seq desc",
				new BeanPropertyRowMapper<BoardTO>(BoardTO.class),
				to.getSeq() );

		return to;
	}
}