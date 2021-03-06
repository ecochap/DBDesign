package com.xie.dbdesign.service;

import com.xie.dbdesign.entity.Grade;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeService {

    // 增加成绩
    int addGrade(Grade grade);

    // 修改成绩
    int updateGrade(Grade grade);

    // 删除指定学号课程号的选课记录
    int deleteGradeBySnoCno(String Sno, String cNo);

    // 按学号查询学生成绩
    List<Grade> queryGradeBySno(String Sno);

    // 按学生姓名查询成绩
    List<Grade> queryGradeBySname(String sName);

    // 按课程号查询学生成绩
    List<Grade> queryGradeByCno(String cNo);

    // 按课程名查询学生成绩
    List<Grade> queryGradeByCname(String cName);

    // 按上课教师姓名查询学生成绩
    List<Grade> queryGradeByTname(String tName);

    // 按系号查询学生成绩
    List<Grade> queryGradeByDno(String dNo);

    // 根据学号查所获学分
    Double queryGottenCredits(String Sno);

    // 根据学号和课程号查询成绩
    Grade queryGradeBySnoCno(String sNo, String cNo);
}
