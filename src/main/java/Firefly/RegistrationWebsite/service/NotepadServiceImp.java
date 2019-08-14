package Firefly.RegistrationWebsite.service;


import Firefly.RegistrationWebsite.dao.NotepadMapper;
import Firefly.RegistrationWebsite.entity.Notepad;
import Firefly.RegistrationWebsite.entity.NotepadExample;
import Firefly.RegistrationWebsite.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NotepadServiceImp implements NotepadService {

    @Autowired
    private NotepadMapper notepadMapper;

    @Override
    public void addOne(Notepad notepad) {
        //加入时间
        notepadMapper.insertSelective(notepad);

    }


    @Override
    public List<Notepad> getAllMsg() {
        NotepadExample notepadExample = new NotepadExample();
        notepadExample.createCriteria().andNameIsNotNull();
        return notepadMapper.selectByExample(notepadExample);
    }

    @Override
    public void setIsLike(int code, int id) {
        NotepadExample notepadExample = new NotepadExample();
        notepadExample.createCriteria().andCodeEqualTo(code);
        Notepad notepad = new Notepad();
        notepad.setCode(code);
        notepad.setIslike(id);
        notepadMapper.updateByExampleSelective(notepad, notepadExample);
    }

    @Override
    public void like(int code) {
        NotepadExample notepadExample = new NotepadExample();
        notepadExample.createCriteria().andCodeEqualTo(code);
        List<Notepad> old =   notepadMapper.selectByExample(notepadExample);
        Notepad notepad = new Notepad();
        notepad.setCode(code);
        notepad.setLikenum(old.get(0).getLikenum() + 1);
        notepadMapper.updateByExampleSelective(notepad,notepadExample);

    }

    public void disLike(int code) {
        NotepadExample notepadExample = new NotepadExample();
        notepadExample.createCriteria().andCodeEqualTo(code);
        List<Notepad> old =   notepadMapper.selectByExample(notepadExample);
        Notepad notepad = new Notepad();
        notepad.setCode(code);
        int newNum  = old.get(0).getLikenum() + 1;
        newNum = newNum < 0 ? 0:newNum;
        notepad.setDislikenum(newNum);
        notepadMapper.updateByExampleSelective(notepad,notepadExample);
    }

}
