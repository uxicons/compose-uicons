package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MicrophoneSlash: ImageVector? = null

val Icons.Bs.MicrophoneSlash: ImageVector
    get() = _MicrophoneSlash ?: UXIcon(name = "MicrophoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 12f)
                verticalLineToRelative(-2.05f)
                lineToRelative(3.18f, 3.18f)
                curveToRelative(0.39f, 1.29f, 1.39f, 2.3f, 2.68f, 2.68f)
                lineToRelative(2.94f, 2.94f)
                curveToRelative(-0.58f, 0.16f, -1.19f, 0.25f, -1.8f, 0.25f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                close()
                moveTo(13.5f, 21f)
                horizontalLineToRelative(-3f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-0.5f)
                lineTo(0f, 13f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.6f, 0f, 3.13f, -0.36f, 4.52f, -1.03f)
                lineToRelative(-2.3f, -2.3f)
                curveToRelative(-0.71f, 0.22f, -1.45f, 0.33f, -2.22f, 0.33f)
                close()
                moveTo(24f, 13.5f)
                curveToRelative(0f, 2.29f, -0.73f, 4.48f, -2.09f, 6.29f)
                lineToRelative(2.05f, 2.05f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(1.19f, -2.23f, 3.54f, -3.7f, 6.18f, -3.7f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.35f, -0.39f, 2.66f, -1.1f, 3.77f)
                lineToRelative(1.86f, 1.86f)
                curveToRelative(0.81f, -1.22f, 1.24f, -2.65f, 1.24f, -4.14f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(16f, 12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(2.56f, 2.56f)
                curveToRelative(0.21f, -0.49f, 0.32f, -1.02f, 0.32f, -1.56f)
                close()
                moveTo(8.12f, 6.0f)
                lineToRelative(4.88f, 4.88f)
                verticalLineToRelative(-2.88f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.84f, 0f, -3.43f, 1.25f, -3.88f, 3.0f)
                close()
            }
        }.also { _MicrophoneSlash = it}
