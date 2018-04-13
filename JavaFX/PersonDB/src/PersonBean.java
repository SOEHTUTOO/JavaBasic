import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetWarning;

public class PersonBean {
   static final String JDBC_DRIVER =
      "com.mysql.jdbc.Driver";
   static final String DB_URL =
      "jdbc:mysql://localhost:3306/mydatabase";
   static final String DB_USER = "user1";
   static final String DB_PASS = "secret";
   private JdbcRowSet rowSet = null;
   public PersonBean() {
      try {
         Class.forName(JDBC_DRIVER);
         rowSet = new JdbcRowSet() {
			
			@Override
			public void unsetMatchColumn(String[] columnName) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void unsetMatchColumn(String columnName) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void unsetMatchColumn(int[] columnIdxes) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void unsetMatchColumn(int columnIdx) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMatchColumn(String[] columnNames) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMatchColumn(String columnName) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMatchColumn(int[] columnIdxes) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMatchColumn(int columnIdx) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String[] getMatchColumnNames() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int[] getMatchColumnIndexes() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T unwrap(Class<T> iface) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean wasNull() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateTime(String columnLabel, Time x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateTime(int columnIndex, Time x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateString(String columnLabel, String x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateString(int columnIndex, String x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateShort(String columnLabel, short x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateShort(int columnIndex, short x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateRowId(String columnLabel, RowId x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateRowId(int columnIndex, RowId x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateRow() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateRef(String columnLabel, Ref x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateRef(int columnIndex, Ref x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateObject(String columnLabel, Object x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateObject(int columnIndex, Object x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNull(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNull(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNString(String columnLabel, String nString) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNString(int columnIndex, String nString) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNClob(String columnLabel, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNClob(int columnIndex, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateLong(String columnLabel, long x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateLong(int columnIndex, long x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateInt(String columnLabel, int x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateInt(int columnIndex, int x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateFloat(String columnLabel, float x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateFloat(int columnIndex, float x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateDouble(String columnLabel, double x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateDouble(int columnIndex, double x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateDate(String columnLabel, Date x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateDate(int columnIndex, Date x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateClob(String columnLabel, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateClob(int columnIndex, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateClob(String columnLabel, Clob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateClob(int columnIndex, Clob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBytes(String columnLabel, byte[] x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBytes(int columnIndex, byte[] x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateByte(String columnLabel, byte x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateByte(int columnIndex, byte x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBoolean(String columnLabel, boolean x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBoolean(int columnIndex, boolean x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBlob(String columnLabel, Blob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBlob(int columnIndex, Blob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateArray(String columnLabel, Array x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateArray(int columnIndex, Array x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFetchSize(int rows) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFetchDirection(int direction) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean rowUpdated() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean rowInserted() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean rowDeleted() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean relative(int rows) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void refreshRow() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean previous() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean next() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void moveToInsertRow() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void moveToCurrentRow() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean last() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isLast() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFirst() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isClosed() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isBeforeFirst() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isAfterLast() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void insertRow() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public SQLWarning getWarnings() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getUnicodeStream(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getUnicodeStream(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URL getURL(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URL getURL(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getType() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Timestamp getTimestamp(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Timestamp getTimestamp(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Time getTime(String columnLabel, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Time getTime(int columnIndex, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Time getTime(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Time getTime(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getString(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getString(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Statement getStatement() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public short getShort(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public short getShort(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public SQLXML getSQLXML(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public SQLXML getSQLXML(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RowId getRowId(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RowId getRowId(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRow() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Ref getRef(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Ref getRef(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getObject(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getObject(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getNString(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getNString(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public NClob getNClob(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public NClob getNClob(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Reader getNCharacterStream(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Reader getNCharacterStream(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSetMetaData getMetaData() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getLong(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getLong(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getInt(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getInt(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getHoldability() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float getFloat(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float getFloat(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFetchSize() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getFetchDirection() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double getDouble(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double getDouble(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Date getDate(String columnLabel, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getDate(int columnIndex, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getDate(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Date getDate(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCursorName() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getConcurrency() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Clob getClob(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Clob getClob(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Reader getCharacterStream(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Reader getCharacterStream(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public byte[] getBytes(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public byte[] getBytes(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public byte getByte(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public byte getByte(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getBoolean(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getBoolean(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Blob getBlob(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Blob getBlob(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getBinaryStream(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getBinaryStream(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getAsciiStream(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public InputStream getAsciiStream(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Array getArray(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Array getArray(int columnIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean first() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int findColumn(String columnLabel) throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void deleteRow() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void close() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clearWarnings() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cancelRowUpdates() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeFirst() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterLast() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean absolute(int row) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void setUsername(String name) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUrl(String url) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setURL(int parameterIndex, URL x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setType(int type) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTransactionIsolation(int level) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTime(String parameterName, Time x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTime(int parameterIndex, Time x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setString(String parameterName, String x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setString(int parameterIndex, String x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setShort(String parameterName, short x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setShort(int parameterIndex, short x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRowId(String parameterName, RowId x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRowId(int parameterIndex, RowId x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRef(int i, Ref x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setReadOnly(boolean value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setQueryTimeout(int seconds) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPassword(String password) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObject(int parameterIndex, Object x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObject(String parameterName, Object x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNull(String parameterName, int sqlType) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNull(int parameterIndex, int sqlType) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNString(String parameterName, String value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNString(int parameterIndex, String value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNClob(int parameterIndex, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNClob(int parameterIndex, NClob value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNClob(String parameterName, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNClob(String parameterName, NClob value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNCharacterStream(String parameterName, Reader value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaxRows(int max) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaxFieldSize(int max) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLong(String parameterName, long x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLong(int parameterIndex, long x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setInt(String parameterName, int x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setInt(int parameterIndex, int x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFloat(String parameterName, float x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFloat(int parameterIndex, float x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEscapeProcessing(boolean enable) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDouble(String parameterName, double x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDouble(int parameterIndex, double x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDate(String parameterName, Date x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDate(int parameterIndex, Date x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDataSourceName(String name) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setConcurrency(int concurrency) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCommand(String cmd) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClob(String parameterName, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClob(String parameterName, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClob(String parameterName, Clob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClob(int parameterIndex, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClob(int i, Clob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBytes(String parameterName, byte[] x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBytes(int parameterIndex, byte[] x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setByte(String parameterName, byte x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setByte(int parameterIndex, byte x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBoolean(String parameterName, boolean x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBoolean(int parameterIndex, boolean x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlob(String parameterName, Blob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlob(int i, Blob x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setArray(int i, Array x) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeRowSetListener(RowSetListener listener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isReadOnly() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getUsername() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getUrl() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, Class<?>> getTypeMap() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getTransactionIsolation() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getQueryTimeout() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getPassword() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getMaxRows() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaxFieldSize() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getEscapeProcessing() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getDataSourceName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCommand() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void execute() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clearParameters() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addRowSetListener(RowSetListener listener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setShowDeleted(boolean b) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoCommit(boolean autoCommit) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void rollback(Savepoint s) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void rollback() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean getShowDeleted() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public RowSetWarning getRowSetWarnings() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getAutoCommit() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void commit() throws SQLException {
				// TODO Auto-generated method stub
				
			}
		};
         rowSet.setUrl(DB_URL);
         rowSet.setUsername(DB_USER);
         rowSet.setPassword(DB_PASS);
         rowSet.setCommand("SELECT * FROM Person");
         rowSet.execute(); }

      catch (SQLException | ClassNotFoundException ex) {
         ex.printStackTrace();
      }
   }
   public Person create(Person p) {
      try {
         rowSet.moveToInsertRow();
         rowSet.updateInt("personId", p.getPersonId());
         rowSet.updateString("firstName", p.getFirstName());
         rowSet.updateString("middleName", p.getMiddleName());
         rowSet.updateString("lastName", p.getLastName());
         rowSet.updateString("email", p.getEmail());
         rowSet.updateString("phone", p.getPhone());
         rowSet.insertRow();
         rowSet.moveToCurrentRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
            p = null;
         } catch (SQLException e) {

         }
         ex.printStackTrace();
      }
      return p;
   }

   public Person update(Person p) {
      try {
         rowSet.updateString("firstName", p.getFirstName());
         rowSet.updateString("middleName", p.getMiddleName());
         rowSet.updateString("lastName", p.getLastName());
         rowSet.updateString("email", p.getEmail());
         rowSet.updateString("phone", p.getPhone());
         rowSet.updateRow();
         rowSet.moveToCurrentRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
         } catch (SQLException e) {

         }
         ex.printStackTrace();
      }
      return p;
   }

   public void delete() {
      try {
         rowSet.moveToCurrentRow();
         rowSet.deleteRow();
      } catch (SQLException ex) {
         try {
            rowSet.rollback();
         } catch (SQLException e) { }
         ex.printStackTrace();
      }

   }

   public Person moveFirst() {
      Person p = new Person();
      try {
         rowSet.first();
         p.setPersonId(rowSet.getInt("personId"));
         p.setFirstName(rowSet.getString("firstName"));
         p.setMiddleName(rowSet.getString("middleName"));
         p.setLastName(rowSet.getString("lastName"));
         p.setEmail(rowSet.getString("email"));
         p.setPhone(rowSet.getString("phone"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public Person moveLast() {
      Person p = new Person();
      try {
         rowSet.last();
         p.setPersonId(rowSet.getInt("personId"));
         p.setFirstName(rowSet.getString("firstName"));
         p.setMiddleName(rowSet.getString("middleName"));
         p.setLastName(rowSet.getString("lastName"));
         p.setEmail(rowSet.getString("email"));
         p.setPhone(rowSet.getString("phone"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public Person moveNext() {
      Person p = new Person();
      try {
         if (rowSet.next() == false)
            rowSet.previous();
         p.setPersonId(rowSet.getInt("personId"));
         p.setFirstName(rowSet.getString("firstName"));
         p.setMiddleName(rowSet.getString("middleName"));
         p.setLastName(rowSet.getString("lastName"));
         p.setEmail(rowSet.getString("email"));
         p.setPhone(rowSet.getString("phone"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public Person movePrevious() {
      Person p = new Person();
      try {
         if (rowSet.previous() == false)
            rowSet.next();
         p.setPersonId(rowSet.getInt("personId"));
         p.setFirstName(rowSet.getString("firstName"));
         p.setMiddleName(rowSet.getString("middleName"));
         p.setLastName(rowSet.getString("lastName"));
         p.setEmail(rowSet.getString("email"));
         p.setPhone(rowSet.getString("phone"));

      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }

   public Person getCurrent() {
      Person p = new Person();
      try {
         rowSet.moveToCurrentRow();
         p.setPersonId(rowSet.getInt("personId"));
         p.setFirstName(rowSet.getString("firstName"));
         p.setMiddleName(rowSet.getString("middleName"));
         p.setLastName(rowSet.getString("lastName"));
         p.setEmail(rowSet.getString("email"));
         p.setPhone(rowSet.getString("phone"));
      } catch (SQLException ex) {
         ex.printStackTrace();
      }
      return p;
   }
}