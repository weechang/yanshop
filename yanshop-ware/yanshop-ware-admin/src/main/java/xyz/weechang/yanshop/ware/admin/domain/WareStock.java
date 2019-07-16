package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 商品库存
 * @author zhangwei
 * date 2019/7/16
 * time 13:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WareStock extends BaseDomain {
    private static final long serialVersionUID = 6087501824914113204L;

    /*** skuId */
    private Long skuId;

    /*** 库存数 */
    private Integer stock;

    /*** 预占库存 */
    private Integer preStock;

    /*** 安全库存 */
    private Integer safeStock;
}
