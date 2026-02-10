package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plus: ImageVector? = null

val Icons.Sc.Plus: ImageVector
    get() = _Plus ?: UXIcon(name = "Plus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.87f, 11.02f)
                curveToRelative(-0.15f, -0.04f, -3.52f, -0.87f, -8.8f, -0.98f)
                curveToRelative(0.17f, -4.33f, 0.86f, -7.06f, 0.86f, -7.09f)
                curveToRelative(0.2f, -0.8f, -0.28f, -1.62f, -1.08f, -1.82f)
                curveToRelative(-0.8f, -0.2f, -1.62f, 0.28f, -1.82f, 1.08f)
                curveToRelative(-0.04f, 0.14f, -0.79f, 3.12f, -0.96f, 7.86f)
                curveToRelative(-4.81f, 0.17f, -7.79f, 0.92f, -7.93f, 0.95f)
                curveToRelative(-0.8f, 0.2f, -1.29f, 1.02f, -1.08f, 1.82f)
                curveToRelative(0.2f, 0.8f, 1.02f, 1.29f, 1.82f, 1.08f)
                curveToRelative(0.03f, -0.01f, 2.77f, -0.69f, 7.17f, -0.86f)
                curveToRelative(0.1f, 5.27f, 0.94f, 8.59f, 0.99f, 8.73f)
                curveToRelative(0.32f, 1.08f, 1.37f, 1.21f, 1.83f, 1.07f)
                curveToRelative(0.8f, -0.23f, 1.28f, -1.02f, 1.08f, -1.83f)
                curveToRelative(-0.01f, -0.03f, -0.79f, -3.13f, -0.89f, -8.01f)
                curveToRelative(4.9f, 0.1f, 8.06f, 0.88f, 8.1f, 0.89f)
                curveToRelative(0.88f, 0.26f, 1.65f, -0.41f, 1.82f, -1.09f)
                curveToRelative(0.2f, -0.8f, -0.28f, -1.62f, -1.09f, -1.82f)
                close()
            }
        }.also { _Plus = it}
