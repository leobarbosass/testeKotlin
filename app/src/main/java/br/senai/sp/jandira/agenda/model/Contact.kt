package br.senai.sp.jandira.agenda.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

//CRIAR UMA TABELA NO BANCO DE DADOS
@Entity(tableName = "tbl_contact")
class Contact {

    @PrimaryKey(autoGenerate = true)
    var id = 0

    var nome = ""
    var telefoje = ""
    var email = ""

    @ColumnInfo(name = "data_nascimento")
    var dataNascimento: LocalDate? = null

    var foto: Drawable? = null
}