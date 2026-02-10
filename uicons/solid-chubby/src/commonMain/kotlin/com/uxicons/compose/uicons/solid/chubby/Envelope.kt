package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Envelope: ImageVector? = null

val Icons.Sc.Envelope: ImageVector
    get() = _Envelope ?: UXIcon(name = "Envelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.9f, 7.37f)
                curveToRelative(-0.56f, 0.6f, -2.09f, 2.18f, -4.32f, 3.9f)
                curveToRelative(-2.34f, 1.8f, -4.99f, 3.26f, -5.1f, 3.32f)
                curveToRelative(-0.15f, 0.08f, -0.31f, 0.12f, -0.48f, 0.12f)
                reflectiveCurveToRelative(-0.33f, -0.04f, -0.48f, -0.12f)
                curveToRelative(-0.11f, -0.06f, -2.76f, -1.51f, -5.1f, -3.32f)
                curveToRelative(-2.23f, -1.72f, -3.76f, -3.3f, -4.32f, -3.9f)
                lineToRelative(-0.59f, -0.63f)
                curveToRelative(-0.27f, 1.39f, -0.51f, 3.21f, -0.51f, 5.26f)
                curveToRelative(0f, 4.46f, 1.16f, 7.85f, 1.21f, 7.99f)
                curveToRelative(0.11f, 0.32f, 0.38f, 0.57f, 0.72f, 0.65f)
                curveToRelative(0.18f, 0.04f, 4.42f, 1.02f, 9.08f, 1.02f)
                curveToRelative(4.82f, 0f, 8.91f, -0.98f, 9.09f, -1.02f)
                curveToRelative(0.33f, -0.08f, 0.6f, -0.32f, 0.71f, -0.64f)
                curveToRelative(0.05f, -0.14f, 1.21f, -3.51f, 1.21f, -8.0f)
                curveToRelative(0f, -2.07f, -0.24f, -3.89f, -0.51f, -5.26f)
                lineToRelative(-0.59f, 0.64f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.57f, 6.01f)
                curveToRelative(0.41f, 0.44f, 1.91f, 2.0f, 4.08f, 3.68f)
                curveToRelative(1.65f, 1.27f, 3.5f, 2.38f, 4.36f, 2.88f)
                curveToRelative(0.86f, -0.49f, 2.71f, -1.61f, 4.36f, -2.88f)
                curveToRelative(2.17f, -1.67f, 3.67f, -3.24f, 4.08f, -3.67f)
                lineToRelative(1.49f, -1.6f)
                curveToRelative(-0.07f, -0.24f, -0.12f, -0.39f, -0.13f, -0.41f)
                curveToRelative(-0.11f, -0.32f, -0.38f, -0.56f, -0.71f, -0.64f)
                curveToRelative(-0.17f, -0.04f, -4.26f, -1.02f, -9.09f, -1.02f)
                curveToRelative(-4.74f, 0f, -8.91f, 0.98f, -9.08f, 1.02f)
                curveToRelative(-0.33f, 0.08f, -0.6f, 0.32f, -0.71f, 0.65f)
                curveToRelative(-0.01f, 0.03f, -0.06f, 0.17f, -0.13f, 0.41f)
                lineToRelative(1.49f, 1.59f)
                close()
            }
        }.also { _Envelope = it}
