package ru.job4j.sort;

import java.util.*;

/**
 * Класс соритровки департаментов
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class DepartamentSort {

    /**
     * Возвращает отсортированную в натуральном порядке коллекцию
     * @param list коллкция
     * @return отсортированная коллекция
     */
    public Set<Departament> sortAsc(List<Departament> list) {
        return new TreeSet<Departament>(list);
    }

    /**
     * Возвращает отсортированную в обратном порядке коллекцию
     * @param list коллкция
     * @return отсортированная коллекция
     */
    public List<Departament> sortDesc(List<Departament> list) {
        Collections.sort(list, new Comparator<Departament>() {
            @Override
            public int compare(Departament o1, Departament o2) {
                int result = o2.getCode().compareTo(o1.getCode());
                if (result == 0 && !Objects.isNull(o1.getSurveys()) && !Objects.isNull(o2.getSurveys())) {
                    result = o2.getSurveys().compareTo(o1.getSurveys());
                    if (result == 0 && !Objects.isNull(o1.getDepartament()) && !Objects.isNull(o2.getDepartament())) {
                        result = o2.getName().compareTo(o1.getName());
                    } else {
                        return result != 0 ? result : Integer.compare(o1.getName().length(), o2.getName().length());
                    }
                } else {
                    return result != 0 ? result : Integer.compare(o1.getName().length(), o2.getName().length());
                }
                return result;
            }
        });
        return list;
    }

    /**
     * Дрбавляет недостающие департаменты
     * @param list список департаментов
     * @return дополненый список
     */
    public List<Departament> addDepartament(List<Departament> list) {
        Set<Departament> result = new TreeSet<>();
            for (Departament dep : list) {
                int count1 = 0;
                int count2 = 0;
                String code = dep.getCode();
                String surveys = dep.getSurveys();
                String cs = new StringJoiner("\\").add(code).add(surveys).toString();
                for (Departament depart : list) {
                    if (code.equals(depart.getName())) {
                        count1 = 1;
                    }
                    if (cs.equals(depart.getName())) {
                        count2 = 1;
                    }
                }
                if (count1 == 0) {
                    result.add(new Departament(code));
                }
                if (surveys != null && count2 == 0) {
                    result.add(new Departament(code, surveys));
                }
            }
        list.addAll(result);
        return list;
    }
}
