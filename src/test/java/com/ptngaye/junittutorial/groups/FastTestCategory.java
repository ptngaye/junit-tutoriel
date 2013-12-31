package com.ptngaye.junittutorial.groups;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(FastTestCategory.class)
@Suite.SuiteClasses({
        ProductDaoTest.class, CustomerDaoTest.class
})
public class FastTestCategory {
}
