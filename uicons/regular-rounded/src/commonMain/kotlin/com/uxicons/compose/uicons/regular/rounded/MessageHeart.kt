package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageHeart: ImageVector? = null

val Icons.Rr.MessageHeart: ImageVector
    get() = _MessageHeart ?: UXIcon(name = "MessageHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 5f)
                curveToRelative(-1.0f, 0f, -1.87f, 0.37f, -2.5f, 0.99f)
                curveToRelative(-0.63f, -0.62f, -1.5f, -0.99f, -2.5f, -0.99f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.66f, -3.5f, 3.7f)
                curveToRelative(0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                curveToRelative(0.17f, 0.12f, 0.37f, 0.18f, 0.57f, 0.18f)
                reflectiveCurveToRelative(0.4f, -0.06f, 0.57f, -0.18f)
                curveToRelative(0.56f, -0.39f, 5.43f, -3.87f, 5.43f, -7.12f)
                curveToRelative(0f, -2.04f, -1.57f, -3.7f, -3.5f, -3.7f)
                close()
                moveTo(12f, 13.76f)
                curveToRelative(-1.74f, -1.33f, -4f, -3.56f, -4f, -5.06f)
                curveToRelative(0f, -0.94f, 0.67f, -1.7f, 1.5f, -1.7f)
                curveToRelative(0.75f, 0f, 1.5f, 0.45f, 1.5f, 1.45f)
                verticalLineToRelative(0.55f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -1.0f, 0.75f, -1.45f, 1.5f, -1.45f)
                curveToRelative(0.83f, 0f, 1.5f, 0.76f, 1.5f, 1.7f)
                curveToRelative(0f, 1.5f, -2.26f, 3.73f, -4f, 5.06f)
                close()
                moveTo(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(2.85f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24.0f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3.21f)
                curveToRelative(-0.23f, 0f, -0.46f, 0.08f, -0.64f, 0.23f)
                lineToRelative(-4.17f, 3.42f)
                lineToRelative(-4.05f, -3.41f)
                curveToRelative(-0.18f, -0.15f, -0.41f, -0.23f, -0.65f, -0.23f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(2.0f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _MessageHeart = it}
