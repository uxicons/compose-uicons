package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MicrophoneSlash: ImageVector? = null

val Icons.Ss.MicrophoneSlash: ImageVector
    get() = _MicrophoneSlash ?: UXIcon(name = "MicrophoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.88f, 21.12f)
                lineToRelative(1.48f, 1.48f)
                curveToRelative(-1.62f, 0.91f, -3.45f, 1.39f, -5.37f, 1.39f)
                horizontalLineToRelative(-2f)
                curveTo(4.93f, 24f, 0f, 19.07f, 0f, 13f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(1.37f, 0f, 2.69f, -0.3f, 3.88f, -0.88f)
                close()
                moveTo(24f, 13f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.08f, -0.7f, 4.05f, -1.99f, 5.64f)
                lineToRelative(-1.74f, -1.74f)
                curveToRelative(0.89f, -1.14f, 1.44f, -2.48f, 1.62f, -3.91f)
                horizontalLineToRelative(-5.89f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.96f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.96f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.89f)
                curveToRelative(-0.49f, -3.94f, -3.87f, -7f, -7.94f, -7f)
                curveToRelative(-2.82f, 0f, -5.36f, 1.45f, -6.8f, 3.78f)
                lineTo(1.41f, 0.04f)
                lineTo(0f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.48f, -2.48f)
                curveToRelative(1.66f, -1.98f, 2.57f, -4.45f, 2.57f, -7.06f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(2.76f)
                lineToRelative(-2.76f, -2.76f)
                verticalLineToRelative(2.76f)
                close()
                moveTo(12f, 20f)
                curveToRelative(1.09f, 0f, 2.15f, -0.22f, 3.13f, -0.63f)
                lineToRelative(-6.37f, -6.37f)
                horizontalLineToRelative(-4.7f)
                curveToRelative(0.49f, 3.94f, 3.87f, 7f, 7.94f, 7f)
                close()
            }
        }.also { _MicrophoneSlash = it}
