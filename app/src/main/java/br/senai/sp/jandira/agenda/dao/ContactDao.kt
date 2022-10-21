package br.senai.sp.jandira.agenda.dao

import androidx.room.*
import br.senai.sp.jandira.agenda.model.Contact

@Dao
interface ContactDao {

    @Insert                    //Long é um int de 64 digit
    fun save(contact: Contact): Long

    @Delete
    fun delete(contact: Contact): Int

    @Update
    fun update(contact: Contact): Int

    @Query("SELECT * from tbl_contact ORDER BY nome ASC")
    fun getAll(): List<Contact>
                                               //:id é para dar select em um id
    @Query("SELECT * from tbl_contact WHERE ID = :id")
    fun getContactById(id: Int): Contact
}