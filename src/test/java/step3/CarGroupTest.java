package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import step3.model.CarGroup;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGroupTest {

    @ParameterizedTest(name = "{displayName} / value = {0}")
    @CsvSource(value = {"1:1", "2:2", "3:3", "4:4", "5:5"}, delimiter = ':')
    @DisplayName("CarGroup 사이즈 테스트")
    public void CarGroupSize(int num, int expected) {
        //given
        CarGroup carGroup = new CarGroup(num);

        //when, then
        assertThat(carGroup.countOfCars()).isEqualTo(expected);
    }
}
