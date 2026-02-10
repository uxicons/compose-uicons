package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Sc.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.35f, 19.44f)
                curveToRelative(1.25f, -1.33f, 3.33f, -3.17f, 4.81f, -4.63f)
                curveToRelative(3.8f, -3.71f, 7.1f, -5.92f, 10.09f, -6.77f)
                curveToRelative(0.25f, -0.07f, 0.51f, -0.04f, 0.74f, 0.08f)
                curveToRelative(1.82f, 0.96f, 3.5f, 2.12f, 5.01f, 3.47f)
                curveToRelative(0.01f, -0.21f, 0.01f, -0.42f, 0.01f, -0.64f)
                curveToRelative(0f, -4.64f, -1.15f, -8.09f, -1.2f, -8.23f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.57f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.29f, -1.06f, -9.09f, -1.06f)
                reflectiveCurveToRelative(-8.92f, 1.01f, -9.09f, 1.06f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.14f, -1.2f, 3.6f, -1.2f, 8.23f)
                curveToRelative(0.06f, 5.13f, 1.08f, 7.98f, 1.35f, 8.5f)
                close()
                moveTo(7.5f, 6f)
                curveToRelative(1.07f, 0f, 1.5f, 0.43f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.43f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.43f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.43f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(22.82f, 14.16f)
                curveToRelative(-0.33f, 2.97f, -0.99f, 4.92f, -1.03f, 5.02f)
                curveToRelative(-0.11f, 0.33f, -0.39f, 0.57f, -0.72f, 0.65f)
                curveToRelative(-0.13f, 0.03f, -3.13f, 0.71f, -5.96f, 0.93f)
                curveToRelative(-0.86f, 0.97f, -2.42f, 2.2f, -3.03f, 2.25f)
                curveToRelative(-0.76f, 0.01f, -2.28f, -1.25f, -3.19f, -2.25f)
                curveToRelative(-1.61f, -0.12f, -3.27f, -0.4f, -4.43f, -0.61f)
                curveToRelative(1.24f, -1.22f, 2.79f, -2.62f, 4.1f, -3.9f)
                curveToRelative(3.39f, -3.31f, 6.29f, -5.33f, 8.86f, -6.16f)
                curveToRelative(2.0f, 1.09f, 3.81f, 2.46f, 5.37f, 4.06f)
                curveToRelative(0.01f, 0.01f, 0.03f, 0.01f, 0.04f, 0.03f)
                close()
            }
        }.also { _MessageImage = it}
