package xyz.weechang.yanshop.ware.admin.dao;

import org.springframework.stereotype.Repository;
import xyz.weechang.moreco.data.jpa.JpaBaseRepository;
import xyz.weechang.yanshop.ware.admin.domain.Property;

/**
 * @author zhangwei
 * date 2019/7/16
 * time 13:37
 */
@Repository
public interface PropertyDao extends JpaBaseRepository<Property> {
}
