package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 类目属性
 * @author zhangwei
 * date 2019/7/16
 * time 12:05
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Property extends BaseDomain {
    private static final long serialVersionUID = 7350229638397541610L;

    /*** 名称 */
    private String name;

    /*** 属性值类型 1-单选，2-多选，3-输入框 */
    private String valueType;

    /*** 排序 */
    private Integer sort;

    /*** 后台类目 */
    private Long catId;

    /*** 状态 */
    private Integer status;
}
