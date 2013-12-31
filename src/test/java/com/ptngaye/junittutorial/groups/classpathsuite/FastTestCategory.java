package com.ptngaye.junittutorial.groups.classpathsuite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(FastTestCategory.class)
@Suite.SuiteClasses({
        AllTestSuite.class,
})
public class FastTestCategory {
}
