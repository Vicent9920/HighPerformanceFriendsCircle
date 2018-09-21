package com.kcrason.highperformancefriendscircle.beans;

import java.util.List;

/**
 * 创建日期：2018/9/21 0021on 上午 9:14
 * 描述：
 *
 * @author：Vincent QQ：3332168769
 * 备注：
 */
public class ResultFriendCircle {

    /**
     * uuid : 497116a51daf4e74a17796db828079fe
     * username : 1526283387722650
     * avatar : http://192.168.20.72:8088/2018/09/21/e129e3bf17d64affabc67c629cddf34f.png
     * nickName : 幕后煮屎人2号
     * createTime : 1537432763000
     * picList : ["http://192.168.20.72:8088/2018/09/20/e16c2c8401b94843a5e83cc2f9125f60.jpg"]
     * content : 这壁纸很好看
     * likeNamesList : null
     * commentList : [{"content":"好看个球","comUuid":"effa87bb8773439297bc08057584d4ab","comment":"ajaq454","repliedName":null,"commentNick":"光头强","repliedNick":null},{"content":"就是好看","comUuid":"3eed477e7ee04f03b33ac6f2855ea812","comment":"1526283387722650","repliedName":"ajaq454","commentNick":"幕后煮屎人2号","repliedNick":"光头强"}]
     */

    private String uuid;
    private String username;
    private String avatar;
    private String nickName;
    private long createTime;
    private String content;
    private List<LikeBean> likeNamesList;
    private List<String> picList;
    private List<CommentListBean> commentList;
    private boolean selfAdmiration;

    public boolean isSelfAdmiration() {
        return selfAdmiration;
    }

    public void setSelfAdmiration(boolean selfAdmiration) {
        this.selfAdmiration = selfAdmiration;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<LikeBean> getLikeNamesList() {
        return likeNamesList;
    }

    public void setLikeNamesList(List<LikeBean> likeNamesList) {
        this.likeNamesList = likeNamesList;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public List<CommentListBean> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentListBean> commentList) {
        this.commentList = commentList;
    }
    public static class LikeBean{
        String username;
        String nickname;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
    }
    public static class CommentListBean {
        /**
         * content : 好看个球
         * comUuid : effa87bb8773439297bc08057584d4ab
         * comment : ajaq454
         * repliedName : null
         * commentNick : 光头强
         * repliedNick : null
         */

        private String content;
        private String comUuid;
        private String comment;
        private String repliedName;
        private String commentNick;
        private String repliedNick;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getComUuid() {
            return comUuid;
        }

        public void setComUuid(String comUuid) {
            this.comUuid = comUuid;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getRepliedName() {
            return repliedName;
        }

        public void setRepliedName(String repliedName) {
            this.repliedName = repliedName;
        }

        public String getCommentNick() {
            return commentNick;
        }

        public void setCommentNick(String commentNick) {
            this.commentNick = commentNick;
        }

        public String getRepliedNick() {
            return repliedNick;
        }

        public void setRepliedNick(String repliedNick) {
            this.repliedNick = repliedNick;
        }
    }
}
