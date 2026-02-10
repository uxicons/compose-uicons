package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Sc.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.72f, 12.22f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(-0.17f, 1.82f, -0.43f, 2.1f, -0.63f, 2.3f)
                curveToRelative(-3.32f, 3.19f, -7.24f, 3.38f, -8.87f, 3.14f)
                lineToRelative(4.22f, -4.22f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-4.22f, 4.22f)
                curveToRelative(-0.16f, -1.54f, -0.01f, -5.42f, 3.28f, -8.73f)
                curveToRelative(0.21f, -0.21f, 0.41f, -0.4f, 2.37f, -0.56f)
                close()
                moveTo(23.0f, 4.48f)
                curveToRelative(-0.03f, -0.13f, -0.33f, -1.33f, -1.25f, -2.24f)
                curveToRelative(-0.91f, -0.91f, -2.1f, -1.21f, -2.24f, -1.25f)
                curveToRelative(-0.27f, -0.06f, -0.55f, -0.01f, -0.78f, 0.14f)
                curveToRelative(-0.12f, 0.08f, -2.99f, 1.98f, -6.06f, 5.05f)
                curveToRelative(-1.6f, 1.6f, -3.13f, 3.48f, -4.26f, 4.91f)
                lineToRelative(4.61f, 4.61f)
                curveToRelative(1.4f, -1.17f, 3.18f, -2.79f, 4.78f, -4.38f)
                curveToRelative(3.07f, -3.07f, 4.97f, -5.94f, 5.05f, -6.06f)
                curveToRelative(0.15f, -0.23f, 0.2f, -0.51f, 0.14f, -0.78f)
                close()
            }
        }.also { _PenFancy = it}
