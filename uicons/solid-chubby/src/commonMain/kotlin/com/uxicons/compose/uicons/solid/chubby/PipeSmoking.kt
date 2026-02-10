package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PipeSmoking: ImageVector? = null

val Icons.Sc.PipeSmoking: ImageVector
    get() = _PipeSmoking ?: UXIcon(name = "PipeSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.32f, 0f, -0.56f, 0.04f, -0.74f, 0.08f)
                curveToRelative(-1.02f, 4.63f, -4.85f, 18.92f, -12.76f, 18.92f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.15f, 0f, -6f, -1.85f, -6f, -6f)
                curveToRelative(0f, -1.72f, 0.31f, -3.66f, 0.93f, -5.78f)
                curveToRelative(0.09f, -0.3f, 0.3f, -0.54f, 0.59f, -0.65f)
                curveToRelative(0.15f, -0.06f, 1.51f, -0.57f, 4.13f, -0.57f)
                curveToRelative(2.65f, 0f, 4.13f, 0.54f, 4.19f, 0.56f)
                curveToRelative(0.3f, 0.11f, 0.52f, 0.35f, 0.61f, 0.66f)
                curveToRelative(0.23f, 0.77f, 0.42f, 1.81f, 0.56f, 2.68f)
                curveToRelative(2.77f, -2.88f, 5.79f, -8.86f, 6.52f, -11.55f)
                lineToRelative(0.01f, 0.0f)
                curveToRelative(0.12f, -0.45f, 0.45f, -0.83f, 0.92f, -1.01f)
                curveToRelative(0.6f, -0.23f, 1.29f, -0.34f, 2.03f, -0.34f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _PipeSmoking = it}
