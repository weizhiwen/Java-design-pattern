package simpleFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA.
 * User: wzw
 * Date: 2018/9/24
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 * Description: 简单工厂模式测试类
 */
class SimpleFactoryTest {
    private String operator = "";
    private AbstractOperation operation;

    @Test
    @DisplayName("Test 5 = 3 + 2")
    void testAddOperation() {
        operator = "加";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 3;
        operation.numberB = 2;
        Assertions.assertEquals(5, operation.getResult());
    }

    @Test
    @DisplayName("Test 1 = 2 - 1")
    void testSubOperation() {
        operator = "减";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 2;
        operation.numberB = 1;
        Assertions.assertEquals(1, operation.getResult());
    }

    @Test
    @DisplayName("Test 6 = 2 * 3")
    void testMulOperation() {
        operator = "乘";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 2;
        operation.numberB = 3;
        Assertions.assertEquals(6, operation.getResult());
    }

    @Test
    @DisplayName("Test 0.5 = 1 / 2")
    void testDivOperation1() {
        operator = "除";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 1;
        operation.numberB = 2;
        Assertions.assertEquals(0.5, operation.getResult());
    }

    @Test
    @DisplayName("Test 1 / 0 throw RuntimeException")
    void testDivOperation2() {
        operator = "除";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 1;
        operation.numberB = 0;
        Assertions.assertThrows(RuntimeException.class, () -> operation.getResult());
    }


    @Test
    @DisplayName("Test 4 = sqrt(16)")
    void testSquOperation1() {
        operator = "求方";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 16;
        operation.numberB = 1.0/2;
        Assertions.assertEquals(4, operation.getResult());
    }

    @Test
    @DisplayName("Test 64 = cube(4) ")
    void testSquOperation2() {
        operator = "求方";
        operation = OperationFactory.createOperation(operator);
        operation.numberA = 4;
        operation.numberB = 3;
        Assertions.assertEquals(64, operation.getResult());
    }

    @Test
    @DisplayName("Test no operation throw RuntimeException")
    void testNoOperation() {
        operator = "不支持的运算";
        Assertions.assertThrows(RuntimeException.class, () -> OperationFactory.createOperation(operator));
    }
}
