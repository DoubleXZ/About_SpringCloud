package org.cloudxue.springcloud.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName SecKillOrderDTO
 * @Description 请描述类的业务用途
 * @Author xuexiao
 * @Date 2022/3/12 下午8:39
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SecKillOrderDTO implements Serializable {
    //订单ID
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long id;

    //支付金额
    private BigDecimal money;

    //秒杀用户的用户ID
    private Long userId;

    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8" )
    private Date createTime;

    //支付时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss" )
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8" )
    private Date payTime;

    //秒杀商品，和订单是一对多的关系
    private Long skuId;

    //订单状态， -1:无效 0:成功 1:已付款
    private Short status;

}
