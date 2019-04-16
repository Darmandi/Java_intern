package ru.job4j.generic;

/**
 * Базовый класс для хранилища данных
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class AbstractStore<T extends Base> implements Store<T> {
    private SimpleArray<T> arr;

    /**
     * Конструктор использует SimpleArray для хранения данных
     * @param arr массив данных
     */
    public AbstractStore(SimpleArray<T> arr) {
        this.arr = arr;
    }

    /**
     * Добавляет элемент в хранилище
     * @param model элемент
     */
    @Override
    public void add(T model) {
        arr.add(model);
    }

    /**
     * Заменяет указанным элементом элемент, находящийся по индексу
     * @param id индекс
     * @param model указанный элемент
     * @return успешность операции
     */
    @Override
    public boolean replace(String id, T model) {
        int index = findIndexById(id);
        boolean result = false;
        if (findById(id) != null) {
            arr.set(index, model);
            result = true;
        }
        return result;
    }

    /**
     * Удаляет элемент по указанному индексу
     * @param id индекс
     * @return успешность операции
     */
    @Override
    public boolean delete(String id) {
        int index = findIndexById(id);
        boolean result = false;
        if (findById(id) != null) {
            arr.remove(index);
            result = true;
        }
        return result;
    }

    /**
     * Находит элемент по указанному индексу
     * @param id индекс
     * @return успешность операции
     */
    @Override
    public T findById(String id) {
        T elem = null;
        for (int i = 0; i < arr.getCount(); i++) {
            if (id.equals(arr.get(i).getId())) {
                elem = arr.get(i);
                break;
            }
        }
        return elem;
    }

    /**
     * Находит индекс элемента в массиве SimpleArray по указанному id
     * @param id id
     * @return индекс
     */
    public int findIndexById(String id) {
        int result = -1;
        for (int i = 0; i < arr.getCount(); i++) {
            if (arr.get(i).getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
