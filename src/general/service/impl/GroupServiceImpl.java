package general.service.impl;

import general.db.DataBase;
import general.model.Group;
import general.service.GenericService;

import java.util.*;

public class GroupServiceImpl implements GenericService {

    DataBase dataBase = new DataBase();

    @Override
    public String addNewGroup(List list) {
        dataBase.setGroups(list);
        return list.toString();
    }

    @Override
    public List<Group> getGroupById(int id) {
        List<Group> groups = dataBase.getGroups().stream().filter(x -> x.getId() == id).toList();
        return groups;
    }

    @Override
    public List getAllGroups() {
        return dataBase.getGroups();
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        List<Group> groups = dataBase.getGroups().stream().filter(x -> x.getId() == id).toList();
        for (Group g : groups
        ) {
            g.setName(groupName);
            return g.toString();
        }
        return null;
    }

    @Override
    public List filterByYear() {
        System.out.println("1-asc and 2-desc");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            List<Group> groups = dataBase.getGroups().stream().sorted(Comparator.comparing(Group::getYear)).toList();
            return groups;
        } else if (a == 2) {
            List<Group> groupList = dataBase.getGroups().stream().sorted(Comparator.comparing(Group::getYear).reversed()).toList();
            return groupList;
        }
        return null;
    }


    @Override
    public List sortGroupByYear() {
        System.out.println("1-asc and 2-desc");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            List<Group> groups = dataBase.getGroups().stream().sorted(Comparator.comparing(Group::getYear)).toList();
            return groups;
        } else if (a == 2) {
            List<Group> groupList = dataBase.getGroups().stream().sorted(Comparator.comparing(Group::getYear).reversed()).toList();
            return groupList;
        }
        return null;
    }

    @Override
    public void deleteGroupById(int id) {
        dataBase.getGroups().removeIf(group -> group.getId() == id);
        System.out.println("Succesfully removed!");

    }
}
