package se.lexicon.account.component.dao;

import com.j_spaces.core.client.SQLQuery;
import com.lexicon.account.component.entity.OrderEntity;
import org.openspaces.extensions.QueryExtension;
import se.lexicon.account.componment.dao.OrderDao;
import com.so4it.component.dao.gs.AbstractSpaceDao;
import org.openspaces.core.GigaSpace;

import java.math.BigDecimal;




/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class OrderDaoImpl extends AbstractSpaceDao<OrderEntity, String> implements OrderDao {

    public OrderDaoImpl(GigaSpace gigaSpace) {
        super(gigaSpace);
    }


    @Override
    public BigDecimal sum() {
        return QueryExtension.sum(getGigaSpace(),new SQLQuery<>(OrderEntity.class,""),"amount");
    }
}



