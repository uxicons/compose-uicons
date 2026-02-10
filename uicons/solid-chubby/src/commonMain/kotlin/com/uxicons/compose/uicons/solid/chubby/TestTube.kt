package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TestTube: ImageVector? = null

val Icons.Sc.TestTube: ImageVector
    get() = _TestTube ?: UXIcon(name = "TestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.89f, 2.21f)
                curveToRelative(-0.13f, -0.05f, -3.23f, -1.21f, -6.89f, -1.21f)
                reflectiveCurveToRelative(-6.76f, 1.16f, -6.89f, 1.21f)
                curveToRelative(-0.77f, 0.29f, -1.16f, 1.16f, -0.87f, 1.93f)
                curveToRelative(0.28f, 0.75f, 1.1f, 1.14f, 1.84f, 0.91f)
                curveToRelative(-0.07f, 0.62f, -0.16f, 1.42f, -0.23f, 2.36f)
                curveToRelative(1.29f, -0.37f, 3.59f, -0.91f, 6.14f, -0.91f)
                reflectiveCurveToRelative(4.86f, 0.54f, 6.14f, 0.91f)
                curveToRelative(-0.07f, -0.94f, -0.15f, -1.74f, -0.23f, -2.36f)
                curveToRelative(0.87f, 0.26f, 1.62f, -0.3f, 1.84f, -0.9f)
                curveToRelative(0.29f, -0.77f, -0.1f, -1.64f, -0.87f, -1.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.56f)
                curveToRelative(-2.88f, 0f, -5.45f, 0.77f, -6.26f, 1.04f)
                curveToRelative(-0.04f, 0.83f, -0.06f, 1.72f, -0.06f, 2.65f)
                curveToRelative(0f, 1.6f, 0.06f, 3.22f, 0.18f, 4.83f)
                curveToRelative(0.25f, 3.29f, 2.92f, 5.92f, 6.14f, 5.92f)
                curveToRelative(3.24f, 0f, 5.88f, -2.62f, 6.13f, -5.91f)
                curveToRelative(0.12f, -1.62f, 0.19f, -3.25f, 0.19f, -4.83f)
                curveToRelative(0f, -0.93f, -0.02f, -1.82f, -0.06f, -2.65f)
                curveToRelative(-0.82f, -0.27f, -3.39f, -1.04f, -6.26f, -1.04f)
                close()
            }
        }.also { _TestTube = it}
