package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BulbSpeechBubble: ImageVector? = null

val Icons.Ss.BulbSpeechBubble: ImageVector
    get() = _BulbSpeechBubble ?: UXIcon(name = "BulbSpeechBubble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.46f, 1.23f)
                curveTo(14.17f, 0.18f, 12.47f, -0.23f, 10.81f, 0.12f)
                curveToRelative(-2.2f, 0.46f, -3.91f, 2.28f, -4.25f, 4.52f)
                curveToRelative(-0.33f, 2.19f, 0.66f, 4.35f, 2.53f, 5.51f)
                curveToRelative(0.25f, 0.15f, 0.4f, 0.46f, 0.4f, 0.8f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.05f)
                curveToRelative(0f, -0.34f, 0.16f, -0.65f, 0.41f, -0.81f)
                curveToRelative(1.62f, -1.01f, 2.59f, -2.75f, 2.59f, -4.65f)
                curveToRelative(0f, -1.67f, -0.74f, -3.22f, -2.04f, -4.27f)
                close()
                moveTo(13f, 5.72f)
                verticalLineToRelative(4.28f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 5.72f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(23f, 5f)
                lineTo(23f, 21f)
                lineTo(8.78f, 21f)
                lineToRelative(-4.48f, 2.67f)
                curveToRelative(-0.33f, 0.22f, -0.73f, 0.34f, -1.14f, 0.34f)
                curveToRelative(-0.35f, 0f, -0.7f, -0.08f, -1.03f, -0.26f)
                curveToRelative(-0.7f, -0.37f, -1.13f, -1.1f, -1.13f, -1.89f)
                lineTo(1f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.37f)
                curveToRelative(-0.38f, 0.72f, -0.66f, 1.51f, -0.79f, 2.34f)
                curveToRelative(-0.42f, 2.76f, 0.71f, 5.49f, 2.91f, 7.14f)
                verticalLineToRelative(3.52f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3.52f)
                curveToRelative(1.89f, -1.41f, 3f, -3.6f, 3f, -5.98f)
                curveToRelative(0f, -1.24f, -0.31f, -2.44f, -0.88f, -3.5f)
                horizontalLineToRelative(1.38f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _BulbSpeechBubble = it}
