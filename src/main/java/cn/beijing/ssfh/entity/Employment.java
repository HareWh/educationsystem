package cn.beijing.ssfh.entity;

import java.util.Date;

public class Employment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.employment_id
     *
     * @mbggenerated
     */
    private Integer employmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.student_id
     *
     * @mbggenerated
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.date_employment
     *
     * @mbggenerated
     */
    private Date dateEmployment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.employment_enterprise
     *
     * @mbggenerated
     */
    private String employmentEnterprise;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.jobs
     *
     * @mbggenerated
     */
    private String jobs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.salary
     *
     * @mbggenerated
     */
    private String salary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employment.work_address
     *
     * @mbggenerated
     */
    private String workAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.employment_id
     *
     * @return the value of employment.employment_id
     *
     * @mbggenerated
     */
    public Integer getEmploymentId() {
        return employmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.employment_id
     *
     * @param employmentId the value for employment.employment_id
     *
     * @mbggenerated
     */
    public void setEmploymentId(Integer employmentId) {
        this.employmentId = employmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.student_id
     *
     * @return the value of employment.student_id
     *
     * @mbggenerated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.student_id
     *
     * @param studentId the value for employment.student_id
     *
     * @mbggenerated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.date_employment
     *
     * @return the value of employment.date_employment
     *
     * @mbggenerated
     */
    public Date getDateEmployment() {
        return dateEmployment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.date_employment
     *
     * @param dateEmployment the value for employment.date_employment
     *
     * @mbggenerated
     */
    public void setDateEmployment(Date dateEmployment) {
        this.dateEmployment = dateEmployment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.employment_enterprise
     *
     * @return the value of employment.employment_enterprise
     *
     * @mbggenerated
     */
    public String getEmploymentEnterprise() {
        return employmentEnterprise;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.employment_enterprise
     *
     * @param employmentEnterprise the value for employment.employment_enterprise
     *
     * @mbggenerated
     */
    public void setEmploymentEnterprise(String employmentEnterprise) {
        this.employmentEnterprise = employmentEnterprise == null ? null : employmentEnterprise.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.jobs
     *
     * @return the value of employment.jobs
     *
     * @mbggenerated
     */
    public String getJobs() {
        return jobs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.jobs
     *
     * @param jobs the value for employment.jobs
     *
     * @mbggenerated
     */
    public void setJobs(String jobs) {
        this.jobs = jobs == null ? null : jobs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.salary
     *
     * @return the value of employment.salary
     *
     * @mbggenerated
     */
    public String getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.salary
     *
     * @param salary the value for employment.salary
     *
     * @mbggenerated
     */
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employment.work_address
     *
     * @return the value of employment.work_address
     *
     * @mbggenerated
     */
    public String getWorkAddress() {
        return workAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employment.work_address
     *
     * @param workAddress the value for employment.work_address
     *
     * @mbggenerated
     */
    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }
}