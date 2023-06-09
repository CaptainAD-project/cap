package com.app.captain.mapper;

import com.app.captain.domain.dto.Criteria;
import com.app.captain.domain.vo.NoticeVO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NoticeMapper {
    /* 공지사항 조회 */
    public NoticeVO select(Long noticeId);

    /* 공지사항 목록 불러오기 */
    public List<NoticeVO> selectAll(@Param("cri") Criteria criteria);

    /* 공지사항 개수 */
    public Integer selectNoticeCount();

    /* 공지사항 수정 */
    public void updateNotice(NoticeVO noticeVO);

    /* 공지사항 작성 */
    public void insertNotice(NoticeVO noticeVO);

    /* 공지사항 삭제 */
    public void deleteNotice(Long noticeId);
}
