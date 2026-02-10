package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellNotificationSocialMedia: ImageVector? = null

val Icons.Br.BellNotificationSocialMedia: ImageVector
    get() = _BellNotificationSocialMedia ?: UXIcon(name = "BellNotificationSocialMedia") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 3.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            close()
            moveTo(21.86f, 10.16f)
            curveToRelative(-0.19f, -0.81f, -1.0f, -1.31f, -1.8f, -1.12f)
            curveToRelative(-0.81f, 0.19f, -1.31f, 1.0f, -1.12f, 1.8f)
            lineToRelative(1.0f, 4.26f)
            curveToRelative(0.13f, 0.46f, 0.04f, 0.92f, -0.25f, 1.3f)
            curveToRelative(-0.29f, 0.38f, -0.72f, 0.59f, -1.21f, 0.59f)
            lineTo(5.52f, 17.0f)
            curveToRelative(-0.46f, 0f, -0.9f, -0.2f, -1.19f, -0.56f)
            curveToRelative(-0.29f, -0.35f, -0.39f, -0.81f, -0.31f, -1.19f)
            lineToRelative(1.98f, -7.37f)
            curveToRelative(0.64f, -2.87f, 3.16f, -4.88f, 6.12f, -4.88f)
            curveToRelative(0.37f, 0f, 0.74f, 0.03f, 1.11f, 0.1f)
            curveToRelative(0.81f, 0.15f, 1.59f, -0.4f, 1.74f, -1.21f)
            curveToRelative(0.15f, -0.81f, -0.4f, -1.59f, -1.21f, -1.74f)
            curveToRelative(-0.54f, -0.1f, -1.09f, -0.15f, -1.64f, -0.15f)
            curveTo(7.75f, 0f, 4.03f, 2.97f, 3.09f, 7.16f)
            lineToRelative(-1.98f, 7.37f)
            curveToRelative(-0.3f, 1.34f, 0.02f, 2.72f, 0.89f, 3.79f)
            curveToRelative(0.86f, 1.07f, 2.14f, 1.68f, 3.52f, 1.68f)
            horizontalLineToRelative(1.4f)
            curveToRelative(0.56f, 2.29f, 2.62f, 4f, 5.08f, 4f)
            reflectiveCurveToRelative(4.52f, -1.71f, 5.08f, -4f)
            horizontalLineToRelative(1.4f)
            curveToRelative(1.42f, 0f, 2.73f, -0.65f, 3.59f, -1.77f)
            curveToRelative(0.86f, -1.13f, 1.14f, -2.56f, 0.77f, -3.87f)
            lineToRelative(-0.99f, -4.2f)
            close()
        }
    }.also { _BellNotificationSocialMedia = it }
