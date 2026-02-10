package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MasterPlan: ImageVector? = null

val Icons.Ss.MasterPlan: ImageVector
    get() = _MasterPlan ?: UXIcon(name = "MasterPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 4f)
                verticalLineToRelative(-1f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 4f)
                close()
                moveTo(24f, 6f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                lineTo(24f, 6f)
                close()
                moveTo(3f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                lineTo(3f, 9f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 19f)
                lineTo(3f, 19f)
                verticalLineToRelative(2f)
                lineTo(15f, 21f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 14f)
                lineTo(6f, 14f)
                verticalLineToRelative(2f)
                lineTo(15f, 16f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                lineTo(20f, 9f)
                horizontalLineToRelative(-4.28f)
                curveToRelative(-0.35f, -0.59f, -0.98f, -1f, -1.72f, -1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(7.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _MasterPlan = it}
