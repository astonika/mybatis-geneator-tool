# mybatis-geneator-tool
## ����
- ��ͨ���˹����Զ�����Mybatis XML�ļ���dao��class��
- �ɽ��BaseDao��ɻ���������BaseDao֧�ֵķ�������
<pre>
/**
 * ���ݷ��ʲ����֧�Žӿ�
 * @author shiyu
 *
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * ����ʵ�����������¼.
	 * 
	 * @param entity
	 *            .
	 * @return id ���ز������ݵ�ID
	 */
	long insert(T entity);

	/**
	 * �����������.
	 * 
	 * @param entity
	 *            .
	 * @return id ���ز��������
	 */
	long insert(List<T> list);

	/**
	 * ����ʵ���Ӧ�ļ�¼.
	 * 
	 * @param entity
	 *            .
	 * @return
	 */
	long update(T entity);

	/**
	 * ����ID���Ҽ�¼.
	 * 
	 * @param id
	 *            .
	 * @return entity .
	 */
	T getById(long id);

	/**
	 * ����IDɾ����¼.
	 * 
	 * @param id
	 *            .
	 * @return
	 */
	int deleteById(long id);

	/**
	 * ��ҳ��ѯ .
	 * 
	 * @param pageParam
	 *            ��ҳ����.
	 * @param paramMap
	 *            ҵ��������ѯ����.
	 * @return
	 */
	PageBean<T> listPage(PageParam pageParam, Map<String, Object> paramMap);

	PageBean<T> listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId);

	/**
	 * ����������ѯ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return ���ؼ���
	 */
	List<T> listBy(Map<String, Object> paramMap);

	List<T> listBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * ����������ѯ listBy: <br/>
	 * 
	 * @param paramMap
	 * @return ����ʵ��
	 */
	T getBy(Map<String, Object> paramMap);

	T getBy(Map<String, Object> paramMap, String sqlId);

	SqlSessionTemplate getSessionTemplate();

	SqlSession getSqlSession();
}
</pre>
