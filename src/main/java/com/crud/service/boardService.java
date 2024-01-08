package com.crud.service;

import com.crud.dto.boardDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class boardService {
    // 몇 번째 데이터가 들어왔는지 확인
    private Long nextId = 1L;

    // 데이터를 담기 위한 리스트
    private final List<boardDto> boardList = new ArrayList<>();

    // 사용자의 데이터를 받아서 새로운 학생 객체를 생성해
    // 리스트에 저장한다
    public boardDto createBoard(
            String name,
            String text,
            String password
    ){
        boardDto newBoard = new boardDto(nextId, name, text, password);
        nextId++;
        boardList.add(newBoard);
        return newBoard;
    }

    // 모든 데이터를 보자
    public List<boardDto> readBoardAll(){
        return boardList;
    }

    // 데이터 하나 반환
    // id를 받아서 하나의 데이터 반환하자
    public boardDto readBoard(Long id){
        // readList의 데이터를 하나씩 확인해서
        // getId가 id인 데이터를 반환하고
        for (boardDto boardDto: boardList){
            if (boardDto.getId().equals(id)){
                return boardDto;
            }
        }
        // 없을 경우 null을 반환하자
        return null;

    }
}