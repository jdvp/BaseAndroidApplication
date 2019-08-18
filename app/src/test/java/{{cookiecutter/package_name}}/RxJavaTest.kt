package`{{cookiecutter`.`package_name}}`

{{cookiecutter.package_name}}

import org.junit.Rule

/**
 * Class that can be extended by classes that want to test items involving RxJava
 * and thread scheduling. Makes the RxJava bits run synchronously which is necessary
 * for reliable test execution
 */
open class BaseObservableTest {
    @Rule @JvmField
    val rxJavaImmediateReturnRule = RxJavaImmediateReturnRule()
}