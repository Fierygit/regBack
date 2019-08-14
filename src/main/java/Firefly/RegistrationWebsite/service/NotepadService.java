package Firefly.RegistrationWebsite.service;


import Firefly.RegistrationWebsite.entity.Notepad;

import java.util.List;

public interface NotepadService {

    void addOne(Notepad notepad);

    List<Notepad> getAllMsg();

    void setIsLike(int code, int id);

    void like(int code);

    void disLike(int code);

    }
