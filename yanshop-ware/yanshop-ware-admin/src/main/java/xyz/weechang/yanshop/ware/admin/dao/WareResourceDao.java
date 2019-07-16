package xyz.weechang.yanshop.ware.admin.dao;

import org.springframework.stereotype.Repository;
import xyz.weechang.moreco.data.jpa.JpaBaseRepository;
import xyz.weechang.yanshop.ware.admin.domain.WareResource;

/**
 * @author zhangwei
 * date 2019/7/16
 * time 13:38
 */
@Repository
public interface WareResourceDao extends JpaBaseRepository<WareResource> {
}
