package com.lexicon.account.component.test.common.domain;

import se.lexicon.account.component.domain.Order;
import com.so4it.common.util.object.Required;
import com.so4it.test.domain.AbstractTestBuilder;

import java.math.BigDecimal;

/**
 * @author Magnus Poromaa {@literal <mailto:magnus.poromaa@so4it.com/>}
 */
public class OrderTestBuilder extends AbstractTestBuilder<Order> {

    private Order.Builder builder;


    public OrderTestBuilder(Order.Builder builder) {
        this.builder = Required.notNull(builder, "builder");
        this.builder
                .withSsn("1111111111")
                .withAmount(BigDecimal.TEN)
                .withOrderBookId("test");

    }

    public static OrderTestBuilder builder() {
        return new OrderTestBuilder(Order.builder());
    }


    public OrderTestBuilder withSsn(String ssn){
        builder.withSsn(ssn);
        return this;
    }


    public OrderTestBuilder withAmount(BigDecimal amount){
        builder.withAmount(amount);
        return this;
    }



    @Override
    public Order build() {
        return builder.build();
    }
}
