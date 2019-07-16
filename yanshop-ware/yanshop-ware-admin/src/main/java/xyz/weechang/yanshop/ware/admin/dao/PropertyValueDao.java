package xyz.weechang.yanshop.ware.admin.dao;

import org.springframework.stereotype.Repository;
import xyz.weechang.moreco.data.jpa.JpaBaseRepository;
import xyz.weechang.yanshop.ware.admin.domain.PropertyValue;

/**
 * @author zhangwei
 * date 2019/7/16
 * time 13:37
 */
@Repository
public interface PropertyValueDao extends JpaBaseRepository<PropertyValue> {
}
