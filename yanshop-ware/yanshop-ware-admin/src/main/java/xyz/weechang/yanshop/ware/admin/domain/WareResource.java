package xyz.weechang.yanshop.ware.admin.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.weechang.moreco.core.model.domain.BaseDomain;

/**
 * 商品相册
 *
 * @author zhangwei
 * date 2019/7/16
 * time 12:10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WareResource extends BaseDomain {
    private static final long serialVersionUID = -6925429524759893450L;

    /*** 资源路径 */
    private String sourceUrl;

    /*** 资源类型 1-图片资源 2-视频资源 */
    private Integer sourceType;

    /*** 资源位置 1-相册资源 2-商详资源 */
    private Integer sourceLocation;

    /*** 资源排序 */
    private Integer sort;
}
