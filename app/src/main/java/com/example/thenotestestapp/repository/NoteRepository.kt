package com.example.thenotestestapp.repository

import com.example.thenotestestapp.database.NoteDatabase
import com.example.thenotestestapp.model.Note


class NoteRepository(private val db: NoteDatabase) {

    suspend fun  insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun  deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun  updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNoted() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)
}