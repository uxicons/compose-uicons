package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MasterPlan: ImageVector? = null

val Icons.Ts.MasterPlan: ImageVector
    get() = _MasterPlan ?: UXIcon(name = "MasterPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 1f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                lineTo(1f, 5f)
                lineTo(23f, 5f)
                lineTo(23f, 23f)
                lineTo(1f, 23f)
                close()
                moveTo(9f, 9f)
                lineTo(4f, 9f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                lineTo(7f, 14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4f, 18f)
                lineTo(14f, 18f)
                verticalLineToRelative(1f)
                lineTo(4f, 19f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 16.57f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-4.07f)
                curveToRelative(-0.22f, -0.86f, -1f, -1.5f, -1.93f, -1.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.93f, 0f, 1.71f, -0.64f, 1.93f, -1.5f)
                horizontalLineToRelative(3.07f)
                verticalLineToRelative(7.57f)
                curveToRelative(-0.86f, 0.22f, -1.5f, 1f, -1.5f, 1.93f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.93f, -0.64f, -1.71f, -1.5f, -1.93f)
                close()
                moveTo(13f, 9.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(18.5f, 19.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MasterPlan = it}
