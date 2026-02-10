package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _N: ImageVector? = null

val Icons.Br.N: ImageVector
    get() = _N ?: UXIcon(name = "N") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineTo(3.92f)
            curveTo(2f, 2.01f, 3.26f, 0.47f, 5.13f, 0.09f)
            curveToRelative(1.87f, -0.38f, 3.63f, 0.54f, 4.38f, 2.29f)
            lineToRelative(7.74f, 18.06f)
            curveToRelative(0.27f, 0.62f, 0.81f, 0.58f, 1.02f, 0.53f)
            curveToRelative(0.22f, -0.04f, 0.73f, -0.22f, 0.73f, -0.89f)
            verticalLineTo(1.5f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineTo(20.08f)
            curveToRelative(0f, 1.91f, -1.26f, 3.45f, -3.13f, 3.83f)
            curveToRelative(-1.86f, 0.39f, -3.63f, -0.54f, -4.38f, -2.29f)
            lineTo(6.75f, 3.56f)
            curveToRelative(-0.27f, -0.62f, -0.8f, -0.58f, -1.02f, -0.53f)
            curveToRelative(-0.22f, 0.04f, -0.73f, 0.22f, -0.73f, 0.89f)
            verticalLineTo(22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _N = it }
