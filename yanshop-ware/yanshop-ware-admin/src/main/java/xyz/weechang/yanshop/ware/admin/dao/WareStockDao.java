package xyz.weechang.yanshop.ware.admin.dao;

import org.springframework.stereotype.Repository;
import xyz.weechang.moreco.data.jpa.JpaBaseRepository;
import xyz.weechang.yanshop.ware.admin.domain.WareStock;

/**
 * @author zhangwei
 * date 2019/7/16
 * time 13:40
 */
@Repository
public interface WareStockDao extends JpaBaseRepository<WareStock> {
}
