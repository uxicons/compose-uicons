package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendMoney: ImageVector? = null

val Icons.Ts.SendMoney: ImageVector
    get() = _SendMoney ?: UXIcon(name = "SendMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 1.71f)
                lineToRelative(-5.65f, 5.65f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.65f, -5.65f)
                horizontalLineToRelative(-5.29f)
                lineTo(17f, 0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                lineTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                close()
                moveTo(11.5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.11f, 0.74f, 2.1f, 1.81f, 2.4f)
                lineToRelative(4.11f, 1.17f)
                curveToRelative(0.64f, 0.18f, 1.08f, 0.77f, 1.08f, 1.44f)
                curveToRelative(0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.01f)
                curveToRelative(-0.82f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.51f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.51f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.11f, -0.74f, -2.1f, -1.81f, -2.4f)
                lineToRelative(-4.11f, -1.17f)
                curveToRelative(-0.64f, -0.18f, -1.08f, -0.77f, -1.08f, -1.44f)
                curveToRelative(0f, -0.82f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.01f)
                curveToRelative(0.82f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.51f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.51f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _SendMoney = it}
