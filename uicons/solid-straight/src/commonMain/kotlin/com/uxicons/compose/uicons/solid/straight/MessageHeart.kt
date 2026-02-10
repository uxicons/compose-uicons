package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageHeart: ImageVector? = null

val Icons.Ss.MessageHeart: ImageVector
    get() = _MessageHeart ?: UXIcon(name = "MessageHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8.7f)
                curveToRelative(0f, 1.5f, -2.26f, 3.73f, -4f, 5.06f)
                curveToRelative(-1.74f, -1.33f, -4f, -3.56f, -4f, -5.06f)
                curveToRelative(0f, -0.94f, 0.67f, -1.7f, 1.5f, -1.7f)
                curveToRelative(0.75f, 0f, 1.5f, 0.45f, 1.5f, 1.45f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -1.0f, 0.75f, -1.45f, 1.5f, -1.45f)
                curveToRelative(0.83f, 0f, 1.5f, 0.76f, 1.5f, 1.7f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(18f, 8.7f)
                curveToRelative(0f, -2.04f, -1.57f, -3.7f, -3.5f, -3.7f)
                curveToRelative(-1.0f, 0f, -1.87f, 0.37f, -2.5f, 0.99f)
                curveToRelative(-0.63f, -0.62f, -1.5f, -0.99f, -2.5f, -0.99f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.66f, -3.5f, 3.7f)
                curveToRelative(0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.56f, -0.39f, 5.43f, -3.87f, 5.43f, -7.12f)
                close()
            }
        }.also { _MessageHeart = it}
