package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchNotifications: ImageVector? = null

val Icons.Ss.SmartWatchNotifications: ImageVector
    get() = _SmartWatchNotifications ?: UXIcon(name = "SmartWatchNotifications") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 22f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                close()
                moveTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(14.35f, 2f)
                curveToRelative(0.27f, -0.75f, 0.67f, -1.42f, 1.19f, -2f)
                horizontalLineToRelative(-9.54f)
                verticalLineToRelative(2.1f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.1f, 1f, -0.1f)
                close()
                moveTo(20f, 10f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(8.58f, 9f)
                lineTo(11.29f, 11.71f)
                curveToRelative(0.38f, 0.38f, 1.04f, 0.38f, 1.41f, 0f)
                lineToRelative(2.71f, -2.71f)
                close()
                moveTo(16f, 11.24f)
                lineTo(14.12f, 13.12f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
                lineToRelative(-1.88f, -1.88f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _SmartWatchNotifications = it}
