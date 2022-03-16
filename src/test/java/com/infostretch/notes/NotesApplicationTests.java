package com.infostretch.notes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.infostretch.notes.model.Note;
import com.infostretch.notes.controller.IndexController;
import com.infostretch.notes.controller.NoteController;
import java.util.Date;
import java.util.List;

public class NotesApplicationTests {

    private Note note;
    private IndexController indexController;
    private NoteController noteController;

	@Test
	public void testTitle() {
        note = new Note();
        note.setTitle("New title");
        assertEquals("New title", note.getTitle());
	}

    @Test
	public void testContent() {
        note = new Note();
        note.setContent("New content");
        assertEquals("New content", note.getContent());
	}

    @Test
	public void testId() {
        note = new Note();
        note.setId(new Long(1));
        assertEquals(new Long(1), note.getId());
	}

    @Test
	public void testCreatedDate() {
        note = new Note();
        Date date = new Date();
        note.setCreatedAt(date);
        assertEquals(date, note.getCreatedAt());
	}

    @Test
	public void testUpdateDate() {
        note = new Note();
        Date date = new Date();
        note.setUpdatedAt(date);
        assertEquals(date, note.getUpdatedAt());
	}

    @Test
	public void testIndexController() {
        indexController = new IndexController();
        assertEquals("Hello and Welcome to the EasyNotes application. You can create a new Note by making a POST request to /api/notes endpoint.", indexController.sayHello());
	}
}
