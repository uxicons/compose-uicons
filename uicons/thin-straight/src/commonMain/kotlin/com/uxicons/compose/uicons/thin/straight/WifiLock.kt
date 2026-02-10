package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiLock: ImageVector? = null

val Icons.Ts.WifiLock: ImageVector
    get() = _WifiLock ?: UXIcon(name = "WifiLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 15f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(16f, 13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(9f)
                close()
                moveTo(19f, 20.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(12f, 3f)
                curveToRelative(-4.01f, 0f, -7.77f, 1.56f, -10.61f, 4.39f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(3.02f, -3.02f, 7.04f, -4.69f, 11.31f, -4.69f)
                reflectiveCurveToRelative(8.29f, 1.67f, 11.31f, 4.69f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-2.83f, -2.83f, -6.6f, -4.39f, -10.61f, -4.39f)
                close()
                moveTo(14.05f, 10.27f)
                curveToRelative(-0.66f, -0.17f, -1.35f, -0.27f, -2.05f, -0.27f)
                curveToRelative(-2.14f, 0f, -4.15f, 0.83f, -5.66f, 2.34f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                curveToRelative(0.96f, 0f, 1.9f, 0.16f, 2.79f, 0.45f)
                curveToRelative(-0.27f, 0.25f, -0.52f, 0.53f, -0.74f, 0.83f)
                close()
                moveTo(11f, 16.28f)
                verticalLineToRelative(3.44f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                reflectiveCurveToRelative(0.41f, -1.38f, 1f, -1.72f)
                close()
            }
        }.also { _WifiLock = it}
