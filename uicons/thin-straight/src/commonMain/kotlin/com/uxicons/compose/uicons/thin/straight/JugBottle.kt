package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Ts.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 5.89f)
                lineToRelative(-5.8f, -0.95f)
                lineTo(12f, 1f)
                horizontalLineToRelative(1f)
                lineTo(13f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.02f)
                lineToRelative(-2.38f, 0.89f)
                curveToRelative(-0.97f, 0.36f, -1.62f, 1.3f, -1.62f, 2.34f)
                verticalLineToRelative(15.74f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-13.17f)
                curveToRelative(0f, -2.46f, -1.76f, -4.54f, -4.2f, -4.93f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                lineTo(3f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                lineTo(3f, 15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                lineTo(3f, 11f)
                verticalLineToRelative(-2.74f)
                curveToRelative(0f, -0.62f, 0.39f, -1.19f, 0.97f, -1.4f)
                lineToRelative(3.03f, -1.14f)
                lineTo(7f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.8f)
                lineToRelative(6.64f, 1.08f)
                curveToRelative(1.95f, 0.32f, 3.36f, 1.98f, 3.36f, 3.95f)
                verticalLineToRelative(12.17f)
                close()
                moveTo(17f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 17f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _JugBottle = it}
