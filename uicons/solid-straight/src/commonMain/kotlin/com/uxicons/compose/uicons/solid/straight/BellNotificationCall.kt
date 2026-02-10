package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellNotificationCall: ImageVector? = null

val Icons.Ss.BellNotificationCall: ImageVector
    get() = _BellNotificationCall ?: UXIcon(name = "BellNotificationCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 7.43f)
                lineToRelative(-0.8f, -3.79f)
                curveToRelative(-0.48f, -2.28f, -2.04f, -3.65f, -4.18f, -3.65f)
                curveToRelative(-2.16f, 0f, -3.68f, 1.33f, -4.17f, 3.64f)
                curveToRelative(-0.29f, 1.36f, -0.65f, 3.07f, -0.8f, 3.8f)
                curveToRelative(-0.08f, 0.38f, 0.02f, 0.78f, 0.26f, 1.08f)
                curveToRelative(0.25f, 0.3f, 0.62f, 0.48f, 1.01f, 0.48f)
                horizontalLineToRelative(1.97f)
                curveToRelative(0.12f, 0.84f, 0.84f, 1.49f, 1.72f, 1.49f)
                reflectiveCurveToRelative(1.6f, -0.65f, 1.72f, -1.49f)
                horizontalLineToRelative(1.98f)
                curveToRelative(0.4f, 0f, 0.77f, -0.17f, 1.01f, -0.48f)
                curveToRelative(0.25f, -0.3f, 0.34f, -0.7f, 0.26f, -1.08f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.61f, 12.85f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-3.17f, 3.17f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                curveToRelative(0f, -1.61f, 0.61f, -3.1f, 1.72f, -4.21f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-4.12f, 4.12f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(4.13f, -4.13f)
                close()
            }
        }.also { _BellNotificationCall = it}
