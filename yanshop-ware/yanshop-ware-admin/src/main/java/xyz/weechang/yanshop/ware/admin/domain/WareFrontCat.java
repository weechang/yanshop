package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 商品前台类目
 * @author zhangwei
 * date 2019/7/16
 * time 12:03
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WareFrontCat extends BaseDomain {
    private static final long serialVersionUID = 6094574736250205775L;

    /*** 类目ID */
    private Long catId;

    /*** spuId */
    private Long spuId;
}
