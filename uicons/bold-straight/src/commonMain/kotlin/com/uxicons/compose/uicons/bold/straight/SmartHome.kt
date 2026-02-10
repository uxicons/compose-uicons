package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHome: ImageVector? = null

val Icons.Bs.SmartHome: ImageVector
    get() = _SmartHome ?: UXIcon(name = "SmartHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23.99f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(-2.56f)
                curveToRelative(0.65f, -0.64f, 1.06f, -1.52f, 1.06f, -2.5f)
                curveToRelative(0f, -0.17f, -0.03f, -0.34f, -0.05f, -0.5f)
                horizontalLineToRelative(0.55f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-10.82f)
                curveToRelative(0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.39f)
                lineTo(12.31f, 3.12f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0f)
                lineTo(3.19f, 9.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(10.82f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(0.55f)
                curveToRelative(-0.02f, 0.17f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 0.98f, 0.41f, 1.86f, 1.06f, 2.5f)
                horizontalLineToRelative(-2.56f)
                verticalLineToRelative(-0.01f)
                lineTo(0f, 23.99f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.76f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(8.5f, 6.65f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.67f, 1.34f, 2.76f)
                verticalLineToRelative(13.82f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.47f, 19.02f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.23f, -1.23f, -2.86f, -1.9f, -4.6f, -1.9f)
                reflectiveCurveToRelative(-3.37f, 0.68f, -4.6f, 1.9f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
                close()
                moveTo(18.01f, 15.49f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-4.48f, -4.48f, -11.78f, -4.48f, -16.26f, 0f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(3.31f, -3.31f, 8.71f, -3.31f, 12.02f, 0f)
                close()
            }
        }.also { _SmartHome = it}
