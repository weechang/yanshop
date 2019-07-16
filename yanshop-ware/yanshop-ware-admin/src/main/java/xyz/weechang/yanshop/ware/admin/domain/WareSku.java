package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

import java.math.BigDecimal;

/**
 * 商品SKU
 * @author zhangwei
 * date 2019/7/16
 * time 10:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WareSku extends BaseDomain {
    private static final long serialVersionUID = 7508615000135910835L;

    /*** SKU编码 */
    private String skuCode;

    /*** SPU编码 */
    private String spuCode;

    /*** 国条码 */
    private String itemCode;

    /*** 商品名称 */
    private String name;

    /*** 品牌Id */
    private Long brandId;

    /*** 后台类目ID */
    private Long catId;

    /*** 单位 */
    private String chine;

    /*** 关键词 */
    private String keyWord;

    /*** 毛重  kg */
    private Float weight;

    /*** 长 cm */
    private Float length;

    /*** 宽 cm */
    private Float width;

    /*** 高 cm */
    private Float height;

    /*** 标价 */
    private BigDecimal tagPrice;

    /*** 售价 */
    private BigDecimal salePrice;

    /*** 属性 */
    private String properties;

    /*** 状态 */
    private Integer status;

}
