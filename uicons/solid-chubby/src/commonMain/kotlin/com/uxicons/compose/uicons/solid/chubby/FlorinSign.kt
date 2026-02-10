package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Sc.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-2.94f, 0f, -3.73f, 0.88f, -4.13f, 1.84f)
                lineToRelative(-1.25f, 4.27f)
                curveToRelative(0.91f, 0.09f, 1.58f, 0.19f, 1.62f, 0.2f)
                curveToRelative(0.82f, 0.13f, 1.37f, 0.9f, 1.24f, 1.72f)
                curveToRelative(-0.13f, 0.82f, -0.91f, 1.37f, -1.72f, 1.24f)
                curveToRelative(-0.01f, -0.0f, -0.9f, -0.14f, -2.0f, -0.22f)
                curveToRelative(-0.06f, 0.18f, -1.74f, 5.97f, -1.81f, 6.15f)
                curveToRelative(-1.49f, 3.8f, -5.59f, 3.8f, -6.94f, 3.8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(2.94f, 0f, 3.73f, -0.88f, 4.13f, -1.84f)
                lineToRelative(1.49f, -5.06f)
                curveToRelative(-1.08f, 0.1f, -1.21f, 0.17f, -1.62f, 0.19f)
                curveToRelative(-0.72f, 0f, -1.36f, -0.52f, -1.48f, -1.26f)
                curveToRelative(-0.13f, -0.82f, 0.42f, -1.59f, 1.24f, -1.72f)
                curveToRelative(0.06f, -0.01f, 1.3f, -0.21f, 2.76f, -0.28f)
                curveToRelative(0.05f, -0.16f, 1.48f, -5.07f, 1.54f, -5.22f)
                curveToRelative(1.49f, -3.8f, 5.59f, -3.8f, 6.94f, -3.8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _FlorinSign = it}
