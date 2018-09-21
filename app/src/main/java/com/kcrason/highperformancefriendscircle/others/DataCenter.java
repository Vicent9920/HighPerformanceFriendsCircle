package com.kcrason.highperformancefriendscircle.others;

import android.annotation.SuppressLint;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kcrason.highperformancefriendscircle.Constants;
import com.kcrason.highperformancefriendscircle.beans.CommentBean;
import com.kcrason.highperformancefriendscircle.beans.FriendCircleBean;
import com.kcrason.highperformancefriendscircle.beans.OtherInfoBean;
import com.kcrason.highperformancefriendscircle.beans.PraiseBean;
import com.kcrason.highperformancefriendscircle.beans.ResultFriendCircle;
import com.kcrason.highperformancefriendscircle.beans.UserBean;
import com.kcrason.highperformancefriendscircle.beans.emoji.EmojiBean;
import com.kcrason.highperformancefriendscircle.beans.emoji.EmojiDataSource;
import com.kcrason.highperformancefriendscircle.utils.SpanUtils;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * @author KCrason
 * @date 2018/5/2
 */
public class DataCenter {

    public static void init() {
        new Thread(DataCenter::loadEmojis).start();
    }

    public static final List<EmojiDataSource> emojiDataSources = new ArrayList<>();

    private static String value = "[\n" +
            "      {\n" +
            "        \"uuid\": \"4aecd566684f429a80ec60adb4328a6a\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537495223000,\n" +
            "        \"picList\": [\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/b020b23c0df34d82bb981dc0634186a0.png\",\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/c7413440a2234bb9abc9f3a1ee502517.png\",\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/8bfa3c32b5f84e399c83c81111c64d8d.png\"\n" +
            "        ],\n" +
            "        \"content\": \"各位，中秋节快乐哈！\",\n" +
            "        \"likeNamesList\": null,\n" +
            "        \"commentList\": null,\n" +
            "        \"like\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"uuid\": \"a6fc050b73d94628b0f2e2c2ba18a076\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537495176000,\n" +
            "        \"picList\": [\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/446ec634c7104de996063e51e3222598.png\",\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/d6691f825fb9456e8c3d1c9822efa158.png\"\n" +
            "        ],\n" +
            "        \"content\": \"各位，上午好！~!@#$%^&*()_+\\\\]';-*/+[emoji_02_tongue_2]\",\n" +
            "        \"likeNamesList\": null,\n" +
            "        \"commentList\": null,\n" +
            "        \"like\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"uuid\": \"f62f024e3fb64ecfbabe3eec3ad55c09\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537493448000,\n" +
            "        \"picList\": [\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/9948b3ee7c7e489e8b39ca43a4feb703.png\"\n" +
            "        ],\n" +
            "        \"content\": \"各位，上午好！~!@#$%^&*()_+\\\\]';-*/+[emoji_02_tongue_2]\",\n" +
            "        \"likeNamesList\": null,\n" +
            "        \"commentList\": null,\n" +
            "        \"like\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"uuid\": \"2708d2d77d42439ead49f9c9098b1db3\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537493353000,\n" +
            "        \"picList\": [\n" +
            "          \"http://192.168.20.72:8088/2018/09/21/b7372246588e445f87f8e0d3464813aa.png\"\n" +
            "        ],\n" +
            "        \"content\": \"各位，上午好！~!@#$%^&*()_+\\\\]';-*/+\",\n" +
            "        \"likeNamesList\": null,\n" +
            "        \"commentList\": null,\n" +
            "        \"like\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"uuid\": \"f1df1237bb9b48709c77a05888740282\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537493307000,\n" +
            "        \"picList\": null,\n" +
            "        \"content\": \"各位，上午好！\",\n" +
            "        \"likeNamesList\": null,\n" +
            "        \"commentList\": null,\n" +
            "        \"like\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"uuid\": \"497116a51daf4e74a17796db828079fe\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537432763000,\n" +
            "        \"picList\": [\n" +
            "          \"http://192.168.20.72:8088/2018/09/20/e16c2c8401b94843a5e83cc2f9125f60.jpg\"\n" +
            "        ],\n" +
            "        \"content\": \"这壁纸很好看\",\n" +
            "        \"likeNamesList\": [\n" +
            "          {\n" +
            "            \"username\": \"1526283387722650\",\n" +
            "            \"nickname\": \"幕后煮屎人2号\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"commentList\": [\n" +
            "          {\n" +
            "            \"content\": \"好看个球\",\n" +
            "            \"comUuid\": \"effa87bb8773439297bc08057584d4ab\",\n" +
            "            \"comment\": \"ajaq454\",\n" +
            "            \"repliedName\": null,\n" +
            "            \"commentNick\": \"光头强\",\n" +
            "            \"repliedNick\": null\n" +
            "          },\n" +
            "          {\n" +
            "            \"content\": \"就是好看\",\n" +
            "            \"comUuid\": \"3eed477e7ee04f03b33ac6f2855ea812\",\n" +
            "            \"comment\": \"1526283387722650\",\n" +
            "            \"repliedName\": \"ajaq454\",\n" +
            "            \"commentNick\": \"幕后煮屎人2号\",\n" +
            "            \"repliedNick\": \"光头强\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"like\": true\n" +
            "      },\n" +
            "      {\n" +
            "        \"uuid\": \"72d7d1c87f8d4e62b24ae0970421d514\",\n" +
            "        \"username\": \"1526283387722650\",\n" +
            "        \"avatar\": \"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a\",\n" +
            "        \"nickName\": \"幕后煮屎人2号\",\n" +
            "        \"createTime\": 1537426780000,\n" +
            "        \"picList\": [\n" +
            "          \"http://192.168.20.72:8088/2018/09/20/b2f0463349ba464399a2d652225c5cf5.jpg\"\n" +
            "        ],\n" +
            "        \"content\": \"这壁纸很好看\",\n" +
            "        \"likeNamesList\": [\n" +
            "          {\n" +
            "            \"username\": \"juzhili\",\n" +
            "            \"nickname\": \"白纸一样的纯......\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"username\": \"1526283387722650\",\n" +
            "            \"nickname\": \"幕后煮屎人2号\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"commentList\": null,\n" +
            "        \"like\": true\n" +
            "      }\n" +
            "    ]";

    public static void loadEmojis() {
        for (int i = 0; i < 2; i++) {
            EmojiDataSource emojiDataSource = new EmojiDataSource();
            List<EmojiBean> typeEmojiBeans = new ArrayList<>();
            if (i == 0) {
                for (int j = 0; j < Constants.TYPE01_EMOJI_NAME.length; j++) {
                    EmojiBean emojiBean = new EmojiBean();
                    emojiBean.setEmojiName(Constants.TYPE01_EMOJI_NAME[j]);
                    emojiBean.setEmojiResource(Constants.TYPE01_EMOJI_DREWABLES[j]);
                    typeEmojiBeans.add(emojiBean);
                }
                emojiDataSource.setEmojiType(Constants.EmojiType.EMOJI_TYPE_01);
            } else {
                for (int j = 0; j < Constants.TYPE02_EMOJI_NAME.length; j++) {
                    EmojiBean emojiBean = new EmojiBean();
                    emojiBean.setEmojiName(Constants.TYPE02_EMOJI_NAME[j]);
                    emojiBean.setEmojiResource(Constants.TYPE02_EMOJI_DREWABLES[j]);
                    typeEmojiBeans.add(emojiBean);
                }
                emojiDataSource.setEmojiType(Constants.EmojiType.EMOJI_TYPE_02);
            }
            emojiDataSource.setEmojiList(typeEmojiBeans);
            emojiDataSources.add(emojiDataSource);
        }
    }


    public static List<FriendCircleBean> makeFriendCircleBeans(Context context) {
        List<FriendCircleBean> friendCircleBeans = new ArrayList<>();

        Type type = new TypeToken<List<ResultFriendCircle>>(){}.getType();
        List<ResultFriendCircle> data = new Gson().fromJson(value,type);
        for (int i = 0; i < data.size(); i++) {
            FriendCircleBean friendCircleBean = new FriendCircleBean();
            ResultFriendCircle bean = data.get(i);
            if(bean.getPicList() == null || bean.getPicList().size() == 0){
                friendCircleBean.setViewType(Constants.FriendCircleType.FRIEND_CIRCLE_TYPE_ONLY_WORD);
            }else {
                friendCircleBean.setViewType(Constants.FriendCircleType.FRIEND_CIRCLE_TYPE_WORD_AND_IMAGES);
            }

            friendCircleBean.setCommentBeans(makeCommentBeans(context,bean));
            friendCircleBean.setImageUrls(makeImages(bean));
            List<PraiseBean> praiseBeans = makePraiseBeans(bean);
            friendCircleBean.setPraiseSpan(SpanUtils.makePraiseSpan(context, praiseBeans));
            friendCircleBean.setPraiseBeans(praiseBeans);
            friendCircleBean.setContent(bean.getContent());

            UserBean userBean = new UserBean();
            userBean.setUserName(bean.getNickName()==null?bean.getUsername():bean.getNickName());
            userBean.setUserAvatarUrl(bean.getAvatar()==null?"http://192.168.20.72:8088/2018/03/26/94cb5008692544b79def5aeeb126e44a":bean.getAvatar());
            friendCircleBean.setUserBean(userBean);


            OtherInfoBean otherInfoBean = new OtherInfoBean();
            otherInfoBean.setTime(makeTimes(bean.getCreateTime()));
            otherInfoBean.setSource("  ");
            friendCircleBean.setOtherInfoBean(otherInfoBean);
            friendCircleBeans.add(friendCircleBean);
        }
        return friendCircleBeans;
    }

    private static String makeTimes(long createTime) {
        long numberTime = System.currentTimeMillis()-createTime;

        for (int i = Constants.MILLISECONDS.length-1;i>-1;i--) {
            long time = Constants.MILLISECONDS[i];
            if(numberTime>time){
                if(i == Constants.MILLISECONDS.length-1){
                    Calendar calendar = Calendar.getInstance();
                    List<Long> months = getTime(calendar);
                    for (int j = 0; j < months.size(); j++) {
                        if(createTime>calendar.getTime().getTime()){
                            if(j == 0){
                                return Constants.TIMES[Constants.MILLISECONDS.length-1];
                            }else {
                                return Constants.TIMES[21+j];
                            }

                        }
                    }


                }else {
                    return Constants.TIMES[i+1];
                }
            }
        }
        @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(createTime);

    }

    private static List<Long> getTime(Calendar calendar) {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            switch (i){
                case 0:
                    calendar.setTime(new Date());
                    calendar.add(Calendar.MONTH, -1);
                    result.add(calendar.getTimeInMillis());
                    break;
                case 1:
                    calendar.setTime(new Date());
                    calendar.add(Calendar.MONTH, -2);
                    result.add(calendar.getTimeInMillis());
                    break;
                case 2:
                    calendar.setTime(new Date());
                    calendar.add(Calendar.MONTH, -3);
                    result.add(calendar.getTimeInMillis());
                    break;
                case 3:
                    calendar.setTime(new Date());
                    calendar.add(Calendar.MONTH, -6);
                    result.add(calendar.getTimeInMillis());
                    break;
                case 4:
                    calendar.setTime(new Date());
                    calendar.add(Calendar.YEAR, -1);
                    result.add(calendar.getTimeInMillis());
                    break;
                    default:
            }

        }

        return result;
    }

    /**
     * 图片
     * @param bean
     * @return
     */
    private static List<String> makeImages(ResultFriendCircle bean) {
        List<String> imageBeans = new ArrayList<>();
        if(bean.getPicList()!=null){
            imageBeans.addAll(bean.getPicList());
        }
        return imageBeans;
    }

    /**
     * 点赞
     * @return
     */
    private static List<PraiseBean> makePraiseBeans(ResultFriendCircle bean) {
        List<PraiseBean> praiseBeans = new ArrayList<>();
        if(bean.getLikeNamesList()!= null){
            for (int i = 0; i < bean.getLikeNamesList().size(); i++) {
                ResultFriendCircle.LikeBean likeBean = bean.getLikeNamesList().get(i);
                PraiseBean praiseBean = new PraiseBean();
                praiseBean.setPraiseUserName(likeBean.getNickname() == null?likeBean.getUsername():likeBean.getNickname());
                praiseBeans.add(praiseBean);
            }
        }
        return praiseBeans;
    }

    /**
     * 评论
     * @param context
     * @param bean
     * @return
     */
    private static List<CommentBean> makeCommentBeans(Context context,ResultFriendCircle bean) {
        List<CommentBean> commentBeans = new ArrayList<>();
        List<ResultFriendCircle.CommentListBean> data = bean.getCommentList();
        if(data == null){
            return commentBeans;
        }

        for (int i = 0; i < data.size(); i++) {
            CommentBean commentBean = new CommentBean();
            ResultFriendCircle.CommentListBean commentListBean = data.get(i);
            if (commentListBean.getRepliedNick() == null) {
                commentBean.setCommentType(Constants.CommentType.COMMENT_TYPE_SINGLE);
                commentBean.setChildUserName(commentListBean.getCommentNick() == null?commentListBean.getComment():commentListBean.getCommentNick());
            } else {
                commentBean.setCommentType(Constants.CommentType.COMMENT_TYPE_REPLY);
                commentBean.setParentUserName(commentListBean.getCommentNick() == null?commentListBean.getComment():commentListBean.getCommentNick());
                commentBean.setChildUserName(commentListBean.getRepliedNick());
            }

            commentBean.setCommentContent(commentListBean.getContent());
            commentBean.build(context);
            commentBeans.add(commentBean);
        }
        return commentBeans;
    }
}
