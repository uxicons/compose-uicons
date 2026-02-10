package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageQuestion: ImageVector? = null

val Icons.Ss.MessageQuestion: ImageVector
    get() = _MessageQuestion ?: UXIcon(name = "MessageQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                lineTo(24.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13.93f, 11.51f)
                curveToRelative(-0.47f, 0.26f, -0.93f, 1.13f, -0.93f, 1.75f)
                verticalLineToRelative(0.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0f, -1.19f, 0.73f, -2.83f, 1.96f, -3.5f)
                curveToRelative(0.76f, -0.42f, 1.16f, -1.25f, 1.0f, -2.12f)
                curveToRelative(-0.14f, -0.79f, -0.81f, -1.46f, -1.6f, -1.6f)
                curveToRelative(-0.61f, -0.11f, -1.2f, 0.05f, -1.66f, 0.43f)
                curveToRelative(-0.45f, 0.38f, -0.71f, 0.94f, -0.71f, 1.53f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.1f, -1.08f, 3.29f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.94f, 1.61f, 3.22f, 3.22f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.4f, -2.01f, 4.22f)
                close()
            }
        }.also { _MessageQuestion = it}
