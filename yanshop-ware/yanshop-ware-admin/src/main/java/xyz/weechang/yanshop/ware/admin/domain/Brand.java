package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 品牌
 * @author zhangwei
 * date 2019/7/16
 * time 12:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Brand extends BaseDomain {
    private static final long serialVersionUID = 1014078770164897461L;

    /*** 品牌名 */
    private String name;

    /*** 首字母 */
    private String firstChar;

    /*** logo */
    private String logo;

    /*** 状态 */
    private Integer status;
}
