package com.wulee.administrator.zuji.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.wulee.administrator.zuji.database.bean.NewFriendInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NewFriend_TABLE".
*/
public class NewFriendInfoDao extends AbstractDao<NewFriendInfo, Void> {

    public static final String TABLENAME = "NewFriend_TABLE";

    /**
     * Properties of entity NewFriendInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", false, "ID");
        public final static Property Uid = new Property(1, String.class, "uid", false, "UID");
        public final static Property Msg = new Property(2, String.class, "msg", false, "MSG");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Address = new Property(4, String.class, "address", false, "ADDRESS");
        public final static Property Avatar = new Property(5, String.class, "avatar", false, "AVATAR");
        public final static Property Status = new Property(6, Integer.class, "status", false, "STATUS");
        public final static Property Time = new Property(7, Long.class, "time", false, "TIME");
    };


    public NewFriendInfoDao(DaoConfig config) {
        super(config);
    }
    
    public NewFriendInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NewFriend_TABLE\" (" + //
                "\"ID\" INTEGER," + // 0: id
                "\"UID\" TEXT," + // 1: uid
                "\"MSG\" TEXT," + // 2: msg
                "\"NAME\" TEXT," + // 3: name
                "\"ADDRESS\" TEXT," + // 4: address
                "\"AVATAR\" TEXT," + // 5: avatar
                "\"STATUS\" INTEGER," + // 6: status
                "\"TIME\" INTEGER);"); // 7: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NewFriend_TABLE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, NewFriendInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String msg = entity.getMsg();
        if (msg != null) {
            stmt.bindString(3, msg);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(6, avatar);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(7, status);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(8, time);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public NewFriendInfo readEntity(Cursor cursor, int offset) {
        NewFriendInfo entity = new NewFriendInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // msg
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // avatar
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // status
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7) // time
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, NewFriendInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMsg(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAddress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAvatar(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStatus(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setTime(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(NewFriendInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(NewFriendInfo entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
