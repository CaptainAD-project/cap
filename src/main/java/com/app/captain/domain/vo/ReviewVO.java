package com.app.captain.domain.vo;

import com.app.captain.domain.dto.ReviewDTO;
import com.app.captain.domain.dto.ReviewFileDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReviewVO {
    private Long reviewId;
    private String reviewTitle;
    private String reviewContent;
    private String reviewCategory;
    private String reviewRegisterDate;
    private String reviewUpdateDate;
    private Double reviewGrade;
    private Long memberId;

    public ReviewFileDTO toDTO(){
        ReviewFileDTO reviewFileDTO = new ReviewFileDTO();
        reviewFileDTO.setReviewCategory(this.reviewCategory);
        reviewFileDTO.setReviewContent(this.reviewContent);
        reviewFileDTO.setReviewGrade(this.reviewGrade);
        reviewFileDTO.setReviewTitle(this.reviewTitle);
        reviewFileDTO.setMemberId(this.memberId);
        reviewFileDTO.setReviewId(this.reviewId);
        reviewFileDTO.setReviewRegisterDate(this.reviewRegisterDate);
        reviewFileDTO.setReviewUpdateDate(this.reviewUpdateDate);
        return reviewFileDTO;
    }
}
