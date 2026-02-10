package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellNotificationSocialMedia: ImageVector? = null

val Icons.Sr.BellNotificationSocialMedia: ImageVector
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
                moveTo(20.92f, 8.99f)
                curveToRelative(-0.08f, 0.0f, -0.16f, 0.01f, -0.25f, 0.01f)
                curveToRelative(-3.13f, 0f, -5.68f, -2.47f, -5.68f, -5.5f)
                curveToRelative(0f, -0.9f, 0.23f, -1.76f, 0.63f, -2.51f)
                curveToRelative(-1.22f, -0.64f, -2.61f, -0.99f, -4.07f, -0.99f)
                curveTo(7.53f, 0f, 4.04f, 2.71f, 3.17f, 6.52f)
                lineToRelative(-1.98f, 6.19f)
                curveToRelative(-0.84f, 2.63f, 1.19f, 5.29f, 4.03f, 5.29f)
                horizontalLineToRelative(13.05f)
                curveToRelative(2.93f, 0f, 4.96f, -2.81f, 3.97f, -5.47f)
                lineToRelative(-1.32f, -3.54f)
                close()
            }
        }.also { _BellNotificationSocialMedia = it}
