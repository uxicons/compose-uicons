package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellNotificationCall: ImageVector? = null

val Icons.Sr.BellNotificationCall: ImageVector
    get() = _BellNotificationCall ?: UXIcon(name = "BellNotificationCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.43f, 8.29f)
                curveToRelative(-0.36f, 0.45f, -0.91f, 0.71f, -1.48f, 0.71f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-0.12f, 0.84f, -0.84f, 1.49f, -1.72f, 1.49f)
                reflectiveCurveToRelative(-1.6f, -0.65f, -1.72f, -1.49f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(-0.58f, 0f, -1.12f, -0.26f, -1.48f, -0.7f)
                curveToRelative(-0.36f, -0.45f, -0.51f, -1.03f, -0.39f, -1.59f)
                curveToRelative(0.18f, -0.85f, 0.43f, -2.05f, 0.65f, -3.06f)
                curveToRelative(0.5f, -2.31f, 2.02f, -3.64f, 4.17f, -3.64f)
                curveToRelative(2.14f, 0f, 3.7f, 1.36f, 4.18f, 3.65f)
                lineToRelative(0.64f, 3.05f)
                curveToRelative(0.12f, 0.56f, -0.02f, 1.15f, -0.39f, 1.59f)
                close()
                moveTo(23.09f, 16.74f)
                curveToRelative(1.21f, 1.21f, 1.21f, 3.17f, 0f, 4.38f)
                lineToRelative(-0.91f, 1.05f)
                curveToRelative(-1.19f, 1.2f, -2.75f, 1.83f, -4.42f, 1.83f)
                curveTo(10.13f, 24f, 0f, 13.87f, 0f, 6.24f)
                curveToRelative(0f, -1.67f, 0.63f, -3.23f, 1.78f, -4.38f)
                lineToRelative(1.15f, -1.0f)
                curveToRelative(1.16f, -1.16f, 3.12f, -1.16f, 4.33f, 0.05f)
                curveToRelative(0.03f, 0.03f, 1.88f, 2.44f, 1.88f, 2.44f)
                curveToRelative(0.55f, 0.58f, 0.86f, 1.33f, 0.86f, 2.14f)
                reflectiveCurveToRelative(-0.31f, 1.56f, -0.86f, 2.15f)
                lineToRelative(-1.6f, 1.9f)
                curveToRelative(1.46f, 3.31f, 3.73f, 5.59f, 6.93f, 6.95f)
                lineToRelative(1.91f, -1.61f)
                curveToRelative(1.19f, -1.14f, 3.09f, -1.15f, 4.28f, -0.01f)
                curveToRelative(0f, 0f, 2.41f, 1.85f, 2.44f, 1.88f)
                close()
            }
        }.also { _BellNotificationCall = it}
