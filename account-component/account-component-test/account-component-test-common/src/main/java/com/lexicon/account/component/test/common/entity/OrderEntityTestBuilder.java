package com.lexicon.account.component.test.common.entity;

import com.lexicon.account.component.entity.OrderEntity;
import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;

import java.math.BigDecimal;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class OrderEntityTestBuilder extends AbstractTestBuilder<OrderEntity> {

    private OrderEntity.Builder builder;


    public OrderEntityTestBuilder(OrderEntity.Builder builder) {
        this.builder = Required.notNull(builder, "builder");
        this.builder
                .withId("1111111111")
                .withSsn("1111111111")
                .withAmount(BigDecimal.TEN);

    }

    public static OrderEntityTestBuilder builder() {
        return new OrderEntityTestBuilder(OrderEntity.builder());
    }

    @Override
    public OrderEntity build() {
        return builder.build();
    }
}
