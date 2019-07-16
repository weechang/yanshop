package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 商品分类
 * @author zhangwei
 * date 2019/7/16
 * time 10:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Category extends BaseDomain {
    private static final long serialVersionUID = -5154936118006760019L;

    /*** 上级分类Id */
    private Long parentId;

    /*** 分类名称 */
    private String name;

    /*** 分类图标 */
    private String icon;

    /*** 分类层级 */
    private Integer level;

    /*** 排序 */
    private Integer sort;

    /*** 分类类型1：后台类目，2-前台类目 */
    private Integer catType;

    /*** 状态 */
    private Integer status;

    /*** 备注 */
    private String remark;

}
