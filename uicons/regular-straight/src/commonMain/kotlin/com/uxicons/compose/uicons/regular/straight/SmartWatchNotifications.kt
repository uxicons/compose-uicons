package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchNotifications: ImageVector? = null

val Icons.Rs.SmartWatchNotifications: ImageVector
    get() = _SmartWatchNotifications ?: UXIcon(name = "SmartWatchNotifications") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(20f, 6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(8.58f, 8f)
                horizontalLineToRelative(6.83f)
                lineToRelative(-2.71f, 2.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                close()
                moveTo(14.12f, 12.12f)
                lineTo(16f, 10.24f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4.76f)
                lineToRelative(1.88f, 1.88f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                close()
                moveTo(18f, 9.65f)
                curveToRelative(0.63f, 0.22f, 1.3f, 0.35f, 2f, 0.35f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(3.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.18f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(-3.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.09f)
                curveToRelative(-0.06f, 0.33f, -0.09f, 0.66f, -0.09f, 1f)
                reflectiveCurveToRelative(0.04f, 0.67f, 0.09f, 1f)
                horizontalLineToRelative(-7.09f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _SmartWatchNotifications = it}
