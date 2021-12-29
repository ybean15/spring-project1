package mc.sn.KEPL.VO;

import java.sql.Date;


public class ReplyVO {

    private Integer reply_no;
    private Integer article_no;
    private String reply_text;
    private String reply_writer;
    private Date reg_date;
    private Date update_date;
    private ArticleVO articleVO;
    private UserVO userVO;
    
	
	public ArticleVO getArticleVO() {
		return articleVO;
	}
	public void setArticleVO(ArticleVO articleVO) {
		this.articleVO = articleVO;
	}
	public Integer getReply_no() {
		return reply_no;
	}
	public void setReply_no(Integer reply_no) {
		this.reply_no = reply_no;
	}
	public Integer getArticle_no() {
		return article_no;
	}
	public void setArticle_no(Integer article_no) {
		this.article_no = article_no;
	}
	
	public String getReply_text() {
		return reply_text;
	}
	public void setReply_text(String reply_text) {
		this.reply_text = reply_text;
	}
	public String getReply_writer() {
		return reply_writer;
	}
	public void setReply_writer(String reply_writer) {
		this.reply_writer = reply_writer;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
	
	public UserVO getUserVO() {
		return userVO;
	}
	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	@Override
	public String toString() {
		return "ReplyVO [reply_no=" + reply_no + ", article_no=" + article_no + ", reply_text=" + reply_text
				+ ", reply_writer=" + reply_writer + ", reg_date=" + reg_date + ", update_date=" + update_date
				+ ", articleVO=" + articleVO + ", userVO=" + userVO + "]";
	}
	

}