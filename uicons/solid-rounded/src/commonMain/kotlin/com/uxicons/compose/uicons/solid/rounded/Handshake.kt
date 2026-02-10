package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handshake: ImageVector? = null

val Icons.Sr.Handshake: ImageVector
    get() = _Handshake ?: UXIcon(name = "Handshake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.06f, 11.21f)
                lineToRelative(8.04f, 6.72f)
                lineToRelative(-5.69f, 4.27f)
                curveToRelative(-1.42f, 1.07f, -3.38f, 1.07f, -4.8f, 0f)
                lineToRelative(-6.13f, -4.6f)
                curveToRelative(-0.52f, -0.39f, -1.15f, -0.6f, -1.8f, -0.6f)
                horizontalLineToRelative(-0.67f)
                curveTo(0.45f, 17f, 0f, 16.55f, 0f, 16f)
                verticalLineTo(4.94f)
                curveToRelative(0f, -0.51f, 0.38f, -0.93f, 0.88f, -0.99f)
                curveToRelative(1.36f, -0.15f, 2.58f, -0.7f, 3.83f, -1.42f)
                curveToRelative(1.8f, -0.93f, 4.16f, -0.59f, 5.62f, 0.77f)
                lineToRelative(0.62f, 0.59f)
                lineToRelative(-4.01f, 3.91f)
                curveToRelative(-1.07f, 1.07f, -1.24f, 2.77f, -0.4f, 3.94f)
                curveToRelative(0.52f, 0.72f, 1.46f, 1.26f, 2.44f, 1.26f)
                curveToRelative(0.79f, 0f, 1.55f, -0.31f, 2.1f, -0.86f)
                lineToRelative(0.97f, -0.93f)
                close()
                moveTo(19.95f, 2.52f)
                curveToRelative(-1.69f, -0.84f, -3.8f, -0.62f, -5.31f, 0.55f)
                lineToRelative(-6.3f, 6.15f)
                curveToRelative(-0.37f, 0.37f, -0.46f, 0.97f, -0.18f, 1.35f)
                curveToRelative(0.18f, 0.25f, 0.44f, 0.4f, 0.74f, 0.42f)
                curveToRelative(0.29f, 0.03f, 0.58f, -0.08f, 0.79f, -0.29f)
                lineToRelative(3.62f, -3.43f)
                curveToRelative(0.95f, -0.9f, 2.32f, 0.54f, 1.38f, 1.45f)
                lineToRelative(-1.18f, 1.1f)
                lineToRelative(8.59f, 7.18f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(4.9f)
                curveToRelative(0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f)
                curveToRelative(-1.69f, -0.31f, -3.21f, -1.4f, -3.21f, -1.4f)
                close()
            }
        }.also { _Handshake = it}
