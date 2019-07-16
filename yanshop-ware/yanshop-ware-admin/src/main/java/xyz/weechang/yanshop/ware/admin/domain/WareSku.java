package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

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

    /*** 商品名称 */
    private String name;

    /*** 后台类目ID */
    private Long backCatId;

}
