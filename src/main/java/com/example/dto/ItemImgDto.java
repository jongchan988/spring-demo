package com.example.dto;

import com.example.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter@Setter
public class ItemImgDto {
    //이랜드 서류합격
    //인터뷰 줌 30분
    //다음주 월 오후3시
    //이랜드 채용 이력서에 등록해야됩니다.
    private Long id;

    private String imgName;

    private String oriImgName;

    private String imgUrl;

    private String repImgYn;

    private static ModelMapper modelMapper =  new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg){
        return modelMapper.map(itemImg, ItemImgDto.class);
    }
}
