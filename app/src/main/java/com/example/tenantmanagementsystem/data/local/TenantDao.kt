package com.example.tenantmanagementsystem.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tenantmanagementsystem.data.model.Tenant

@Dao
interface TenantDao {
    @Query("SELECT * FROM tenants")
    fun getAllTenants(): LiveData<List<Tenant>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTenant(tenant: Tenant)
}
