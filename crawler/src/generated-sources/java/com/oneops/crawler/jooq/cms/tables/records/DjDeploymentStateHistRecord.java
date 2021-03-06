/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.DjDeploymentStateHist;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjDeploymentStateHistRecord extends UpdatableRecordImpl<DjDeploymentStateHistRecord> implements Record9<Long, Long, Integer, Integer, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = -255637984;

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.hist_id</code>.
     */
    public void setHistId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.hist_id</code>.
     */
    public Long getHistId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.deployment_id</code>.
     */
    public void setDeploymentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.deployment_id</code>.
     */
    public Long getDeploymentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.old_state_id</code>.
     */
    public void setOldStateId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.old_state_id</code>.
     */
    public Integer getOldStateId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.new_state_id</code>.
     */
    public void setNewStateId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.new_state_id</code>.
     */
    public Integer getNewStateId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.comments</code>.
     */
    public void setComments(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.comments</code>.
     */
    public String getComments() {
        return (String) get(5);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.ops</code>.
     */
    public void setOps(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.ops</code>.
     */
    public String getOps() {
        return (String) get(6);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>kloopzcm.dj_deployment_state_hist.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>kloopzcm.dj_deployment_state_hist.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, Integer, Integer, String, String, String, String, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, Integer, Integer, String, String, String, String, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.HIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.DEPLOYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.OLD_STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.NEW_STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getHistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDeploymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getOldStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getNewStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getHistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDeploymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOldStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getNewStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value1(Long value) {
        setHistId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value2(Long value) {
        setDeploymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value3(Integer value) {
        setOldStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value4(Integer value) {
        setNewStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value6(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value7(String value) {
        setOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value8(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord value9(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentStateHistRecord values(Long value1, Long value2, Integer value3, Integer value4, String value5, String value6, String value7, String value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjDeploymentStateHistRecord
     */
    public DjDeploymentStateHistRecord() {
        super(DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST);
    }

    /**
     * Create a detached, initialised DjDeploymentStateHistRecord
     */
    public DjDeploymentStateHistRecord(Long histId, Long deploymentId, Integer oldStateId, Integer newStateId, String description, String comments, String ops, String updatedBy, Timestamp updated) {
        super(DjDeploymentStateHist.DJ_DEPLOYMENT_STATE_HIST);

        set(0, histId);
        set(1, deploymentId);
        set(2, oldStateId);
        set(3, newStateId);
        set(4, description);
        set(5, comments);
        set(6, ops);
        set(7, updatedBy);
        set(8, updated);
    }
}
