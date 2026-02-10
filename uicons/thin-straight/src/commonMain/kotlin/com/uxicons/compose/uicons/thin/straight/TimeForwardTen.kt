package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeForwardTen: ImageVector? = null

val Icons.Ts.TimeForwardTen: ImageVector
    get() = _TimeForwardTen ?: UXIcon(name = "TimeForwardTen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.24f)
                curveToRelative(-1.64f, -4.19f, -5.73f, -7f, -10.24f, -7f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                curveToRelative(0.68f, 0f, 1.35f, -0.07f, 2f, -0.19f)
                verticalLineToRelative(1.01f)
                curveToRelative(-0.65f, 0.11f, -1.32f, 0.18f, -2f, 0.18f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(4.77f, 0f, 9.11f, 2.88f, 11f, 7.22f)
                lineTo(23f, 3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(12f, 12f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(24f, 18.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 18.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.2f, 16f)
                lineToRelative(-2.56f, 2.65f)
                lineToRelative(0.72f, 0.69f)
                lineToRelative(1.64f, -1.7f)
                verticalLineToRelative(6.35f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-0.8f)
                close()
            }
        }.also { _TimeForwardTen = it}
