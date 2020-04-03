package com.znmq.point.mybatis.entity;

import java.util.Date;

    /**
     * @author: Sofiya
     * @desc：积分记录表
     * @date: 2020-03-12 08:46:41
     * @Email：wangjie@znjs.com
     * @url：
     */

    public class PointRecord{
        /**
         * 用户Id
         */
        private String id;
        /**
         * 增加积分数
         */
        private Long point;
        /**
         * 操作日期
         */
        private Date date;
        /**
         * 规则名称
         */
        private String rule;
        /**
         * 描述
         */
        private String desc;

        public String getId() {
            return id;
        }

        public void setUser(String id) {
            this.id = id;
        }

        public Long getPoint() {
            return point;
        }

        public void setPoint(Long point) {
            this.point = point;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getRule() {
            return rule;
        }

        public void setRule(String rule) {
            this.rule = rule;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "PointRecord{" +
                    "id='" + id + '\'' +
                    ", point=" + point +
                    ", date=" + date +
                    ", rule='" + rule + '\'' +
                    ", desc='" + desc + '\'' +
                    '}';
        }

}
