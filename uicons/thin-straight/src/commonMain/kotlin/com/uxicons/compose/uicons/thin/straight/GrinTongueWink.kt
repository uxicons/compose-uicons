package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueWink: ImageVector? = null

val Icons.Ts.GrinTongueWink: ImageVector
    get() = _GrinTongueWink ?: UXIcon(name = "GrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.68f, 1.15f, 3.5f, 3f, 3.5f)
                reflectiveCurveToRelative(3f, -1.82f, 3f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 15f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 16.5f)
                curveToRelative(0f, 1.2f, -0.77f, 2.5f, -2f, 2.5f)
                reflectiveCurveToRelative(-2f, -1.3f, -2f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(10f, 11f)
                lineTo(5f, 11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _GrinTongueWink = it}
