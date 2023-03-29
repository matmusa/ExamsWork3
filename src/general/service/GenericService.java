package general.service;

import general.model.Group;

import java.util.List;

public interface GenericService <T>{
    String addNewGroup(List<T>tList);

    // with stream
    List<Group> getGroupById(int id);

    //with stream
    List<T> getAllGroups();

    //with stream
    String updateGroupName(int id, String groupName);

    //with stream (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<T>filterByYear();

    //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<T>sortGroupByYear();

    //with stream
    void deleteGroupById(int id);
}
