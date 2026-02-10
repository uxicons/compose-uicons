package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Sc.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.39f, 16.25f)
                curveToRelative(-1.27f, 3.65f, -4.39f, 4.53f, -7.08f, 4.71f)
                curveToRelative(0.02f, 0.1f, 0.04f, 0.16f, 0.04f, 0.16f)
                curveToRelative(0.21f, 0.8f, -0.27f, 1.62f, -1.07f, 1.83f)
                curveToRelative(-0.78f, 0.21f, -1.62f, -0.26f, -1.83f, -1.07f)
                curveToRelative(-0.01f, -0.02f, -0.1f, -0.37f, -0.22f, -0.97f)
                curveToRelative(-4.98f, -0.51f, -7.23f, -3.31f, -7.23f, -8.91f)
                reflectiveCurveToRelative(2.25f, -8.4f, 7.23f, -8.91f)
                curveToRelative(0.12f, -0.61f, 0.21f, -0.95f, 0.22f, -0.97f)
                curveToRelative(0.21f, -0.8f, 1.04f, -1.27f, 1.83f, -1.07f)
                curveToRelative(0.8f, 0.21f, 1.28f, 1.03f, 1.07f, 1.83f)
                curveToRelative(0f, 0.0f, -0.02f, 0.06f, -0.04f, 0.16f)
                curveToRelative(2.69f, 0.18f, 5.8f, 1.07f, 7.08f, 4.71f)
                curveToRelative(0.27f, 0.78f, -0.14f, 1.64f, -0.92f, 1.91f)
                curveToRelative(-0.78f, 0.28f, -1.64f, -0.14f, -1.91f, -0.92f)
                curveToRelative(-0.5f, -1.43f, -1.52f, -2.75f, -5.56f, -2.75f)
                curveToRelative(-4.54f, 0f, -6f, 1.46f, -6f, 6f)
                reflectiveCurveToRelative(1.46f, 6f, 6f, 6f)
                curveToRelative(4.04f, 0f, 5.06f, -1.32f, 5.56f, -2.75f)
                curveToRelative(0.27f, -0.78f, 1.13f, -1.19f, 1.91f, -0.92f)
                curveToRelative(0.78f, 0.27f, 1.19f, 1.13f, 0.92f, 1.91f)
                close()
            }
        }.also { _CentSign = it}
