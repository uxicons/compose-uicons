package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeDropper: ImageVector? = null

val Icons.Sc.EyeDropper: ImageVector
    get() = _EyeDropper ?: UXIcon(name = "EyeDropper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.67f, 9.73f)
                curveToRelative(-2.78f, 2.81f, -4.46f, 4.82f, -5.4f, 6.02f)
                curveToRelative(-0.81f, 1.03f, -1.0f, 2.37f, -0.59f, 3.52f)
                lineToRelative(-1.17f, 1.18f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0.01f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.44f, 1.06f, 0.44f)
                curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(1.19f, -1.19f)
                curveToRelative(0.36f, 0.12f, 0.74f, 0.18f, 1.13f, 0.18f)
                curveToRelative(0.8f, 0f, 1.6f, -0.26f, 2.27f, -0.78f)
                curveToRelative(1.21f, -0.94f, 3.21f, -2.63f, 6.04f, -5.42f)
                curveToRelative(-0.94f, -0.55f, -2.04f, -1.34f, -3.16f, -2.47f)
                curveToRelative(-1.1f, -1.11f, -1.89f, -2.21f, -2.43f, -3.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 2.48f)
                curveToRelative(-0.1f, -0.13f, -0.2f, -0.24f, -0.3f, -0.35f)
                curveToRelative(-0.1f, -0.1f, -0.22f, -0.21f, -0.35f, -0.31f)
                curveToRelative(-1.64f, -1.29f, -4.07f, -1.04f, -5.52f, 0.56f)
                lineToRelative(-1.38f, 1.47f)
                curveToRelative(-1.08f, -0.28f, -2.88f, -0.26f, -4.87f, 1.75f)
                curveToRelative(-0.24f, 0.24f, -0.34f, 0.58f, -0.26f, 0.91f)
                curveToRelative(0.02f, 0.1f, 0.6f, 2.44f, 3.08f, 4.95f)
                curveToRelative(2.49f, 2.51f, 4.82f, 3.09f, 4.92f, 3.11f)
                curveToRelative(0.07f, 0.02f, 0.15f, 0.03f, 0.23f, 0.03f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.69f, -0.29f)
                curveToRelative(2.02f, -2.03f, 2.03f, -3.84f, 1.75f, -4.91f)
                lineToRelative(1.44f, -1.37f)
                curveToRelative(1.6f, -1.47f, 1.85f, -3.91f, 0.57f, -5.56f)
                close()
            }
        }.also { _EyeDropper = it}
