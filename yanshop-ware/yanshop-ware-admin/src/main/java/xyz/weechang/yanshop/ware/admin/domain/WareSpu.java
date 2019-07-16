package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 商品SPU
 * @author zhangwei
 * date 2019/7/16
 * time 12:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WareSpu extends BaseDomain {
    private static final long serialVersionUID = 2307638288767757779L;

    /*** SPU编码 */
    private String spuCode;

    /*** SPU名称 */
    private String name;

    /*** 品牌Id */
    private Long brandId;

    /*** 分类Id */
    private Long catId;

    /*** SKU属性 */
    private String skuProperties;

    /*** 状态 */
    private Integer status;
}
