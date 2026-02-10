package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHome: ImageVector? = null

val Icons.Ts.SmartHome: ImageVector
    get() = _SmartHome ?: UXIcon(name = "SmartHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 7.87f)
                lineTo(13.66f, 0.57f)
                curveToRelative(-0.98f, -0.77f, -2.34f, -0.77f, -3.32f, 0f)
                lineTo(1.03f, 7.87f)
                curveToRelative(-0.65f, 0.51f, -1.03f, 1.3f, -1.03f, 2.12f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.82f, -0.39f, -1.61f, -1.03f, -2.12f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-13.01f)
                curveToRelative(0f, -0.52f, 0.24f, -1.01f, 0.65f, -1.33f)
                lineTo(10.96f, 1.36f)
                curveToRelative(0.61f, -0.48f, 1.47f, -0.48f, 2.08f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.41f, 0.32f, 0.65f, 0.82f, 0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(14.83f, 16.17f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.56f, -1.56f, 4.1f, -1.56f, 5.66f, 0f)
                close()
                moveTo(19.07f, 11.93f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(3.9f, -3.9f, 10.24f, -3.9f, 14.14f, 0f)
                close()
                moveTo(16.95f, 14.05f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-2.34f, -2.34f, -6.15f, -2.34f, -8.48f, 0f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                close()
            }
        }.also { _SmartHome = it}
