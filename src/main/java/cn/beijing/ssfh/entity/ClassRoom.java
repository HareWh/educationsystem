package cn.beijing.ssfh.entity;

public class ClassRoom {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class_room.classroom_id
     *
     * @mbggenerated
     */
    private Integer classroomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class_room.state_id
     *
     * @mbggenerated
     */
    private Integer stateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class_room.classroom_name
     *
     * @mbggenerated
     */
    private String classroomName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class_room.max_num
     *
     * @mbggenerated
     */
    private Integer maxNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column class_room.classroom_use
     *
     * @mbggenerated
     */
    private String classroomUse;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class_room.classroom_id
     *
     * @return the value of class_room.classroom_id
     *
     * @mbggenerated
     */
    public Integer getClassroomId() {
        return classroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class_room.classroom_id
     *
     * @param classroomId the value for class_room.classroom_id
     *
     * @mbggenerated
     */
    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class_room.state_id
     *
     * @return the value of class_room.state_id
     *
     * @mbggenerated
     */
    public Integer getStateId() {
        return stateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class_room.state_id
     *
     * @param stateId the value for class_room.state_id
     *
     * @mbggenerated
     */
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class_room.classroom_name
     *
     * @return the value of class_room.classroom_name
     *
     * @mbggenerated
     */
    public String getClassroomName() {
        return classroomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class_room.classroom_name
     *
     * @param classroomName the value for class_room.classroom_name
     *
     * @mbggenerated
     */
    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class_room.max_num
     *
     * @return the value of class_room.max_num
     *
     * @mbggenerated
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class_room.max_num
     *
     * @param maxNum the value for class_room.max_num
     *
     * @mbggenerated
     */
    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column class_room.classroom_use
     *
     * @return the value of class_room.classroom_use
     *
     * @mbggenerated
     */
    public String getClassroomUse() {
        return classroomUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column class_room.classroom_use
     *
     * @param classroomUse the value for class_room.classroom_use
     *
     * @mbggenerated
     */
    public void setClassroomUse(String classroomUse) {
        this.classroomUse = classroomUse == null ? null : classroomUse.trim();
    }
}