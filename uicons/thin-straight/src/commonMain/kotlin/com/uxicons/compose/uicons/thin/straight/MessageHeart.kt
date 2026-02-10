package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageHeart: ImageVector? = null

val Icons.Ts.MessageHeart: ImageVector
    get() = _MessageHeart ?: UXIcon(name = "MessageHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(7.11f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.28f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(7.03f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.67f, -0.01f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(14.75f, 5f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.55f, -2.75f, 1.42f)
                curveToRelative(-0.56f, -0.88f, -1.55f, -1.42f, -2.75f, -1.42f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.56f, -3.25f, 3.47f)
                curveToRelative(0f, 3.33f, 5.48f, 7.18f, 5.71f, 7.34f)
                lineToRelative(0.28f, 0.2f)
                lineToRelative(0.28f, -0.2f)
                curveToRelative(0.23f, -0.16f, 5.71f, -4.01f, 5.71f, -7.34f)
                curveToRelative(0f, -1.91f, -1.46f, -3.47f, -3.25f, -3.47f)
                close()
                moveTo(12f, 14.79f)
                curveToRelative(-1.62f, -1.19f, -5f, -4.12f, -5f, -6.32f)
                curveToRelative(0f, -1.36f, 1.01f, -2.47f, 2.25f, -2.47f)
                curveToRelative(1.32f, 0f, 2.25f, 0.9f, 2.25f, 2.2f)
                verticalLineToRelative(0.8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -1.3f, 0.93f, -2.2f, 2.25f, -2.2f)
                curveToRelative(1.24f, 0f, 2.25f, 1.11f, 2.25f, 2.47f)
                curveToRelative(0f, 2.19f, -3.38f, 5.12f, -5f, 6.32f)
                close()
            }
        }.also { _MessageHeart = it}
