package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handshake: ImageVector? = null

val Icons.Ss.Handshake: ImageVector
    get() = _Handshake ?: UXIcon(name = "Handshake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 2.52f)
                lineToRelative(3.05f, 1.52f)
                lineToRelative(1f, -0.05f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-1.9f)
                lineToRelative(-8.59f, -7.18f)
                lineToRelative(1.74f, -1.66f)
                lineToRelative(-1.38f, -1.45f)
                lineToRelative(-4.17f, 4.0f)
                curveToRelative(-0.21f, 0.21f, -0.49f, 0.32f, -0.79f, 0.29f)
                curveToRelative(-0.3f, -0.02f, -0.56f, -0.17f, -0.74f, -0.42f)
                curveToRelative(-0.27f, -0.38f, -0.19f, -0.97f, 0.18f, -1.35f)
                lineTo(14.65f, 3.07f)
                curveToRelative(1.51f, -1.17f, 3.62f, -1.39f, 5.31f, -0.55f)
                close()
                moveTo(12.06f, 11.21f)
                lineToRelative(-0.97f, 0.93f)
                curveToRelative(-0.55f, 0.55f, -1.31f, 0.86f, -2.1f, 0.86f)
                curveToRelative(-0.98f, 0f, -1.93f, -0.54f, -2.44f, -1.26f)
                curveToRelative(-0.85f, -1.17f, -0.68f, -2.87f, 0.4f, -3.94f)
                lineToRelative(4.01f, -3.91f)
                lineToRelative(-0.62f, -0.59f)
                curveToRelative(-0.92f, -0.84f, -2.11f, -1.3f, -3.39f, -1.3f)
                curveToRelative(-0.77f, 0f, -1.54f, 0.18f, -2.23f, 0.53f)
                lineToRelative(-1.95f, 1.48f)
                lineTo(0f, 4f)
                verticalLineToRelative(13f)
                lineTo(2.67f, 17f)
                lineToRelative(9.33f, 7f)
                lineToRelative(8.09f, -6.07f)
                lineToRelative(-8.04f, -6.72f)
                close()
            }
        }.also { _Handshake = it}
