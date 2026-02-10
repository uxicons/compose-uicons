package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextCheck: ImageVector? = null

val Icons.Sc.TextCheck: ImageVector
    get() = _TextCheck ?: UXIcon(name = "TextCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.21f, 12.17f)
                curveToRelative(-0.73f, -0.39f, -1.64f, -0.12f, -2.03f, 0.61f)
                curveToRelative(-0.01f, 0.02f, -1.01f, 1.85f, -2.9f, 3.72f)
                curveToRelative(-1.16f, 1.16f, -2.32f, 1.98f, -3.04f, 2.45f)
                curveToRelative(-0.74f, -0.48f, -1.94f, -1.34f, -3.06f, -2.45f)
                curveToRelative(-0.33f, -0.32f, -0.63f, -0.65f, -0.91f, -0.97f)
                curveToRelative(-0.54f, -0.63f, -1.49f, -0.7f, -2.12f, -0.16f)
                curveToRelative(-0.63f, 0.54f, -0.7f, 1.49f, -0.16f, 2.12f)
                curveToRelative(0.33f, 0.38f, 0.68f, 0.77f, 1.06f, 1.15f)
                curveToRelative(2.08f, 2.06f, 4.34f, 3.33f, 4.43f, 3.38f)
                curveToRelative(0.23f, 0.13f, 0.48f, 0.19f, 0.73f, 0.19f)
                curveToRelative(0.24f, 0f, 0.48f, -0.06f, 0.7f, -0.18f)
                curveToRelative(0.09f, -0.05f, 2.26f, -1.21f, 4.46f, -3.4f)
                curveToRelative(2.22f, -2.21f, 3.38f, -4.34f, 3.43f, -4.43f)
                curveToRelative(0.39f, -0.73f, 0.12f, -1.64f, -0.61f, -2.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.56f, 12.82f)
                curveToRelative(0.25f, 0.79f, 0.5f, 1.64f, 0.74f, 2.57f)
                curveToRelative(0.17f, 0.68f, 0.78f, 1.12f, 1.45f, 1.12f)
                curveToRelative(0.12f, 0f, 0.25f, -0.02f, 0.38f, -0.05f)
                curveToRelative(0.8f, -0.21f, 1.28f, -1.03f, 1.07f, -1.83f)
                curveTo(12.75f, 5.19f, 9.42f, 2.4f, 9.05f, 2.11f)
                curveToRelative(-0.53f, -0.41f, -1.27f, -0.42f, -1.81f, -0.02f)
                curveToRelative(-0.37f, 0.28f, -3.7f, 2.97f, -6.19f, 12.54f)
                curveToRelative(-0.21f, 0.8f, 0.27f, 1.62f, 1.07f, 1.83f)
                curveToRelative(0.8f, 0.2f, 1.62f, -0.27f, 1.83f, -1.07f)
                curveToRelative(0.24f, -0.93f, 0.49f, -1.78f, 0.74f, -2.57f)
                horizontalLineToRelative(6.87f)
                close()
                moveTo(8.13f, 5.53f)
                curveToRelative(0.61f, 0.82f, 1.45f, 2.17f, 2.34f, 4.29f)
                lineTo(5.79f, 9.82f)
                curveToRelative(0.89f, -2.12f, 1.73f, -3.48f, 2.34f, -4.29f)
                close()
            }
        }.also { _TextCheck = it}
