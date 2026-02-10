package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchNotifications: ImageVector? = null

val Icons.Bs.SmartWatchNotifications: ImageVector
    get() = _SmartWatchNotifications ?: UXIcon(name = "SmartWatchNotifications") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(11.29f, 10.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                lineToRelative(2.71f, -2.71f)
                horizontalLineToRelative(-6.83f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.77f, 0f, -1.54f, -0.29f, -2.12f, -0.88f)
                lineToRelative(-1.88f, -1.88f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.76f)
                lineToRelative(-1.88f, 1.88f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                close()
                moveTo(18f, 8.39f)
                verticalLineToRelative(10.11f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.71f)
                curveToRelative(-0.14f, -0.48f, -0.21f, -0.98f, -0.21f, -1.5f)
                reflectiveCurveToRelative(0.08f, -1.02f, 0.21f, -1.5f)
                horizontalLineToRelative(-7.21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.35f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.39f, 0.82f, 2.58f, 2f, 3.15f)
                verticalLineToRelative(2.35f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.35f)
                curveToRelative(1.18f, -0.56f, 2f, -1.76f, 2f, -3.15f)
                verticalLineToRelative(-9.53f)
                curveToRelative(-0.17f, 0.01f, -0.33f, 0.03f, -0.5f, 0.03f)
                curveToRelative(-0.9f, 0f, -1.75f, -0.22f, -2.5f, -0.6f)
                close()
            }
        }.also { _SmartWatchNotifications = it}
