package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Play: ImageVector? = null

val Icons.Tc.Play: ImageVector
    get() = _Play ?: UXIcon(name = "Play") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.45f, 10.36f)
                curveToRelative(-1.27f, -1.49f, -3.53f, -3.73f, -7.07f, -5.96f)
                curveToRelative(-2.9f, -1.83f, -5.49f, -2.8f, -7.14f, -3.29f)
                curveToRelative(-0.78f, -0.23f, -1.61f, -0.09f, -2.27f, 0.4f)
                curveToRelative(-0.66f, 0.49f, -1.03f, 1.24f, -1.03f, 2.05f)
                lineTo(2.94f, 20.44f)
                curveToRelative(0f, 0.81f, 0.38f, 1.56f, 1.03f, 2.05f)
                curveToRelative(0.45f, 0.34f, 0.98f, 0.51f, 1.53f, 0.51f)
                curveToRelative(0.25f, 0f, 0.49f, -0.04f, 0.74f, -0.11f)
                curveToRelative(1.65f, -0.49f, 4.24f, -1.46f, 7.14f, -3.29f)
                curveToRelative(3.54f, -2.23f, 5.8f, -4.47f, 7.07f, -5.96f)
                curveToRelative(0.81f, -0.95f, 0.81f, -2.33f, 0f, -3.28f)
                close()
                moveTo(19.69f, 12.99f)
                curveToRelative(-1.23f, 1.44f, -3.41f, 3.6f, -6.84f, 5.76f)
                curveToRelative(-2.81f, 1.77f, -5.3f, 2.71f, -6.89f, 3.18f)
                curveToRelative(-0.48f, 0.14f, -0.98f, 0.05f, -1.38f, -0.25f)
                curveToRelative(-0.4f, -0.3f, -0.63f, -0.75f, -0.63f, -1.25f)
                lineTo(3.94f, 3.56f)
                curveToRelative(0f, -0.5f, 0.23f, -0.95f, 0.63f, -1.25f)
                curveToRelative(0.28f, -0.21f, 0.6f, -0.31f, 0.93f, -0.31f)
                curveToRelative(0.15f, 0f, 0.3f, 0.02f, 0.45f, 0.07f)
                curveToRelative(1.59f, 0.47f, 4.09f, 1.41f, 6.89f, 3.18f)
                curveToRelative(3.43f, 2.16f, 5.61f, 4.33f, 6.84f, 5.76f)
                curveToRelative(0.49f, 0.58f, 0.49f, 1.41f, 0f, 1.99f)
                close()
            }
        }.also { _Play = it}
