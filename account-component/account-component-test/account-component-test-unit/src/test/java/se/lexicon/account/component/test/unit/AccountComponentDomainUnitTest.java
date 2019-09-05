package se.lexicon.account.component.test.unit;

import com.so4it.serialization.jackson.ObjectMapperFactory;
import com.so4it.test.builder.domain.DomainMatchers;
import com.so4it.test.category.UnitTest;
import com.so4it.test.domain.TestBuilderExecutor;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class AccountComponentDomainUnitTest {

    private static final String PACKAGE_NAME = "com.lexicon.account.component.test.common.domain";

    @Test
    public void testDomainCompliance() {
        TestBuilderExecutor.execute(PACKAGE_NAME, DomainMatchers.builder().withObjectMapper(ObjectMapperFactory.instance()).build());
    }
}
