package com.app.captain.domain.dao;

import com.app.captain.domain.vo.ReviewFileVO;
import com.app.captain.mapper.ReviewFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewFileDAO {

    private final ReviewFileMapper reviewFileMapper;

    //    파일 추가
    public void save(ReviewFileVO reviewFileVO){
        reviewFileMapper.insert(reviewFileVO);
    };

    //    파일 전체 조회
    public List<ReviewFileVO> findById(Long reviewId){
        return reviewFileMapper.select(reviewId);
    };

    //    전일 등록된 파일 조회
    public List<ReviewFileVO> findYesterday(){
        return reviewFileMapper.selectYesterday();
    };

    //    파일 삭제
    public void deleteById(Long reviewId){
        reviewFileMapper.delete(reviewId);
    };
}
