package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MasterPlan: ImageVector? = null

val Icons.Sr.MasterPlan: ImageVector
    get() = _MasterPlan ?: UXIcon(name = "MasterPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.1f, 4f)
                curveTo(0.57f, 1.72f, 2.59f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                lineTo(0.1f, 4f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 6f)
                lineTo(24f, 6f)
                close()
                moveTo(3f, 10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(4f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(15f, 20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(4f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(14f, 21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(15f, 15f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(7f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-6.28f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.28f)
                curveToRelative(-0.35f, -0.59f, -0.98f, -1f, -1.72f, -1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
                horizontalLineToRelative(1.28f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _MasterPlan = it}
