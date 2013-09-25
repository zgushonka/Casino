package talk;

public abstract class Request {

    private String command;
    /**
     * @return the command
     */
    public String getCommand() {
        return command;
    }
    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
        this.command = command;
    }
    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }
    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }
    /**
     * @param playerName the playerName to set
     */
    protected void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    /**
     * @return the playerPassword
     */
    public String getPlayerPassword() {
        return playerPassword;
    }
    /**
     * @param playerPassword the playerPassword to set
     */
    protected void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }
    /**
     * @return the tableType
     */
    public String getTableType() {
        return tableType;
    }
    /**
     * @param tableType the tableType to set
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
    /**
     * @return the betType
     */
    public String getBetType() {
        return betType;
    }
    /**
     * @param betType the betType to set
     */
    public void setBetType(String betType) {
        this.betType = betType;
    }
    /**
     * @return the stake
     */
    public int getStake() {
        return stake;
    }
    /**
     * @param stake the stake to set
     */
    public void setStake(int stake) {
        this.stake = stake;
    }
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    // can be register, all bets done, perform spin (test table), make bet, deleteAllPlayers(admin)
    // Main table register, makeBet
    private String userid; //for bet
    private String playerName; //optional - not for bet
    private String playerPassword; // mandatory
    private String tableType; // for bet
    private String betType; // for bet
    private int stake; // for bet
    private int number; // for bet
    
}




