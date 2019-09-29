package cn.hz.gq.hahaha.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor

public @Data class Car {
    private  String cid;//车牌号
    private  String cname;
}
