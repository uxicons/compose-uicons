package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MasterPlan: ImageVector? = null

val Icons.Bs.MasterPlan: ImageVector
    get() = _MasterPlan ?: UXIcon(name = "MasterPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 4f)
                lineTo(21f, 4f)
                lineTo(21f, 21f)
                lineTo(3f, 21f)
                close()
                moveTo(9f, 9f)
                lineTo(5f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(7f, 14f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 16f)
                lineTo(14f, 16f)
                verticalLineToRelative(3f)
                lineTo(5f, 19f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19.5f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.74f, 0.41f, -1.38f, 1f, -1.72f)
                verticalLineToRelative(-7.78f)
                horizontalLineToRelative(-1.78f)
                curveToRelative(-0.35f, 0.59f, -0.98f, 1f, -1.72f, 1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.74f, 0f, 1.38f, 0.41f, 1.72f, 1f)
                horizontalLineToRelative(3.78f)
                verticalLineToRelative(9.78f)
                curveToRelative(0.59f, 0.35f, 1f, 0.98f, 1f, 1.72f)
                close()
            }
        }.also { _MasterPlan = it}
