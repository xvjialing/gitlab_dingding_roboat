package com.example.test.DingdingRobaot.common;

import java.util.List;

public class DingDingMsg {

    private String msgtype;
    private ActionCardBean actionCard;

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public ActionCardBean getActionCard() {
        return actionCard;
    }

    public void setActionCard(ActionCardBean actionCard) {
        this.actionCard = actionCard;
    }

    public static class ActionCardBean {

        private String title;
        private String text;
        private String hideAvatar;
        private String btnOrientation;
        private List<BtnsBean> btns;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getHideAvatar() {
            return hideAvatar;
        }

        public void setHideAvatar(String hideAvatar) {
            this.hideAvatar = hideAvatar;
        }

        public String getBtnOrientation() {
            return btnOrientation;
        }

        public void setBtnOrientation(String btnOrientation) {
            this.btnOrientation = btnOrientation;
        }

        public List<BtnsBean> getBtns() {
            return btns;
        }

        public void setBtns(List<BtnsBean> btns) {
            this.btns = btns;
        }

        public static class BtnsBean {

            private String title;
            private String actionURL;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getActionURL() {
                return actionURL;
            }

            public void setActionURL(String actionURL) {
                this.actionURL = actionURL;
            }
        }
    }
}
