package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartWatchNotifications: ImageVector? = null

val Icons.Sr.SmartWatchNotifications: ImageVector
    get() = _SmartWatchNotifications ?: UXIcon(name = "SmartWatchNotifications") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(9f, 2f)
                curveToRelative(-1.07f, 0f, -2.09f, 0.25f, -3f, 0.69f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.54f)
                curveToRelative(-0.52f, 0.58f, -0.92f, 1.25f, -1.19f, 2f)
                close()
                moveTo(15f, 22f)
                curveToRelative(1.07f, 0f, 2.09f, -0.25f, 3f, -0.69f)
                verticalLineToRelative(1.69f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0.91f, 0.43f, 1.93f, 0.69f, 3f, 0.69f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
                moveTo(9.5f, 9f)
                horizontalLineToRelative(5f)
                curveToRelative(0.26f, 0f, 0.51f, 0.07f, 0.72f, 0.19f)
                lineToRelative(-2.52f, 2.52f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineToRelative(-2.52f, -2.52f)
                curveToRelative(0.21f, -0.12f, 0.46f, -0.19f, 0.72f, -0.19f)
                close()
                moveTo(16f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.26f)
                lineToRelative(1.88f, 1.88f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(1.88f, -1.88f)
                close()
            }
        }.also { _SmartWatchNotifications = it}
