package com.example.cubesolve_v2

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "cubesolve.db"
        private const val DATABASE_VERSION = 1
        const val TABLE_NAME = "Record2x2"
        const val COLUMN_ID = "id"
        const val COLUMN_RECORD = "record2x2"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTable = ("CREATE TABLE " + TABLE_NAME + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_RECORD + " TEXT" + ")")
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun addRecord(record: String) {
        val values = ContentValues()
        values.put(COLUMN_RECORD, record)
        val db = this.writableDatabase
        db.insert(TABLE_NAME, null, values)
        db.close()
    }

    fun updateRecord(id: Int, record: String) {
        val values = ContentValues()
        values.put(COLUMN_RECORD, record)
        val db = this.writableDatabase
        db.update(TABLE_NAME, values, "$COLUMN_ID=?", arrayOf(id.toString()))
        db.close()
    }

    fun deleteRecord(id: Int) {
        val db = this.writableDatabase
        db.delete(TABLE_NAME, "$COLUMN_ID=?", arrayOf(id.toString()))
        db.close()
    }

    fun getRecord(): String? {
        val db = this.readableDatabase
        val cursor = db.query(TABLE_NAME, arrayOf(COLUMN_ID, COLUMN_RECORD),
            null, null, null, null, null)
        var record: String? = null
        if (cursor.moveToFirst()) {
            record = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_RECORD))
        }
        cursor.close()
        return record
    }
    fun getLastRecordId(): Int? {
        val db = this.readableDatabase
        val cursor = db.rawQuery("SELECT MAX($COLUMN_ID) FROM $TABLE_NAME", null)
        var id: Int? = null
        if (cursor.moveToFirst()) {
            id = cursor.getInt(0)
        }
        cursor.close()
        return id
    }

}
