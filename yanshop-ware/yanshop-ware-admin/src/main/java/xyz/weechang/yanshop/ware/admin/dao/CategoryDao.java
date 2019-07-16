package xyz.weechang.yanshop.ware.admin.dao;

import org.springframework.stereotype.Repository;
import xyz.weechang.moreco.data.jpa.JpaBaseRepository;
import xyz.weechang.yanshop.ware.admin.domain.Category;

/**
 * @author zhangwei
 * date 2019/7/16
 * time 13:36
 */
@Repository
public interface CategoryDao extends JpaBaseRepository<Category> {
}
