package com.wisnu.chellenge4

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Pengguna (
    var username: String? = null,
    var password: String? = null
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}