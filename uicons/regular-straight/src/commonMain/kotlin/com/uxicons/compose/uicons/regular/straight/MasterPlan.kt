package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MasterPlan: ImageVector? = null

val Icons.Rs.MasterPlan: ImageVector
    get() = _MasterPlan ?: UXIcon(name = "MasterPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 4f)
                lineTo(22f, 4f)
                lineTo(22f, 22f)
                lineTo(2f, 22f)
                close()
                moveTo(9f, 9f)
                lineTo(4f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 12f)
                lineTo(14f, 12f)
                verticalLineToRelative(2f)
                lineTo(6f, 14f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 17f)
                lineTo(14f, 17f)
                verticalLineToRelative(2f)
                lineTo(4f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.74f, 0.41f, -1.38f, 1f, -1.72f)
                verticalLineToRelative(-7.28f)
                horizontalLineToRelative(-2.28f)
                curveToRelative(-0.35f, 0.59f, -0.98f, 1f, -1.72f, 1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.74f, 0f, 1.38f, 0.41f, 1.72f, 1f)
                horizontalLineToRelative(4.28f)
                verticalLineToRelative(9.28f)
                curveToRelative(0.59f, 0.35f, 1f, 0.98f, 1f, 1.72f)
                close()
            }
        }.also { _MasterPlan = it}
