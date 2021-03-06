package wang.xiaohui.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import wang.xiaohui.exam.pojo.Question;
import wang.xiaohui.exam.pojo.Squestion;

public interface SquestionDao extends JpaRepository<Squestion,Integer>, JpaSpecificationExecutor<Squestion>,
        CrudRepository<Squestion,Integer>{
}
