package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeDelete: ImageVector? = null

val Icons.Ts.TimeDelete: ImageVector
    get() = _TimeDelete ?: UXIcon(name = "TimeDelete") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 15.73f)
                lineToRelative(-3.77f, 3.77f)
                lineToRelative(3.77f, 3.77f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.77f, -3.77f)
                lineToRelative(-3.77f, 3.77f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.77f, -3.77f)
                lineToRelative(-3.77f, -3.77f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.77f, 3.77f)
                lineToRelative(3.77f, -3.77f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 0.34f, -0.02f, 0.67f, -0.05f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.03f, -0.33f, 0.05f, -0.66f, 0.05f, -1f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.05f, -1f, 0.05f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(12f, 11.72f)
                lineToRelative(-4.76f, 2.85f)
                lineToRelative(0.52f, 0.86f)
                lineToRelative(5.24f, -3.15f)
                verticalLineToRelative(-7.28f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.72f)
                close()
            }
        }.also { _TimeDelete = it}
