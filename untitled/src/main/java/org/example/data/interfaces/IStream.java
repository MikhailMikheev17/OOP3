package org.example.data.interfaces;


import org.example.data.classes.Stream;
import org.example.services.classes.StreamComparator;

import java.util.List;

/**
 * Интерфейс академического потока
 */
public interface IStream {
    /**
     * Получить список групп
     * @return
     */
    List<IGroup> getGroups();

    /**
     * добавить группу в поток
     * @param group - добавляемая группа
     */
    void addGroup(IGroup group);

    /**
     * получить количество групп в потоке
     * @return
     */
    int getCountGroups();

    /**
     * Получить группу по индексу
     * @param index - индекс нужной группы
     * @return      - если групппы с нужным индексом нет вернет null
     */
    IGroup getGroup(int index);

    void setName(String name);
    String getName();
}
