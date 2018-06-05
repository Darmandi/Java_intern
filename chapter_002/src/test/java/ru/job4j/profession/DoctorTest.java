package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DoctorTest {
    @Test
    public void whenCaugh() {
        Patient john = new Patient("Джон", "Кашель");
        Doctor doctor = new Doctor();
        Diagnose result = doctor.heal(john);
        assertThat(result.getDiagnose(), is("Лечить кашель"));
    }
    @Test
    public void whenNotCaugh() {
        Patient john = new Patient("Джон", "Озноб");
        Doctor doctor = new Doctor("Шепард", "Терапевт");
        System.out.print("Доктор " + doctor.getName() + " ставит пациенту " + john.name + " диагноз ");
        Diagnose result = doctor.heal(john);
        System.out.print(result.getDiagnose());
        assertThat(result.getDiagnose(), is("Неизвестная болезнь"));
        assertThat(doctor.getProfession(), is("Терапевт"));
    }
}
