package org.example.services.interfaces;

import org.example.data.classes.EducationGroup;

public interface IGroupService {
    String saveGroupToTxt(String fileName, EducationGroup group);

    EducationGroup loadGroupFromTxt(String fileName);
}
