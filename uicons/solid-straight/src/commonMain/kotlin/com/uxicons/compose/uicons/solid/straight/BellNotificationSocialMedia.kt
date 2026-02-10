package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellNotificationSocialMedia: ImageVector? = null

val Icons.Ss.BellNotificationSocialMedia: ImageVector
    get() = _BellNotificationSocialMedia ?: UXIcon(name = "BellNotificationSocialMedia") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.9f, 20f)
                curveToRelative(-0.47f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                reflectiveCurveToRelative(-4.43f, -1.72f, -4.9f, -4f)
                horizontalLineToRelative(9.8f)
                close()
                moveTo(20.5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(20.74f, 8.99f)
                curveToRelative(-0.08f, 0.0f, -0.16f, 0.01f, -0.24f, 0.01f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -0.9f, 0.22f, -1.76f, 0.61f, -2.51f)
                curveToRelative(-1.18f, -0.64f, -2.53f, -0.99f, -3.94f, -0.99f)
                curveTo(7.78f, 0f, 4.4f, 2.71f, 3.55f, 6.52f)
                lineToRelative(-2.35f, 7.6f)
                curveToRelative(-0.6f, 1.93f, 0.85f, 3.89f, 2.87f, 3.89f)
                horizontalLineToRelative(15.66f)
                curveToRelative(2.08f, 0f, 3.53f, -2.06f, 2.82f, -4.02f)
                lineToRelative(-1.81f, -4.99f)
                close()
            }
        }.also { _BellNotificationSocialMedia = it}
