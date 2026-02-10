package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneSlash: ImageVector? = null

val Icons.Sc.PlaneSlash: ImageVector
    get() = _PlaneSlash ?: UXIcon(name = "PlaneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.4f, 7.31f)
                lineToRelative(11.42f, 11.42f)
                curveToRelative(-1.43f, 1.23f, -3.18f, 2.27f, -5.02f, 2.27f)
                curveToRelative(-0.49f, 0f, -0.93f, -0.25f, -1.16f, -0.67f)
                curveToRelative(-0.56f, -1.0f, 0.35f, -3.33f, 1.2f, -4.95f)
                curveToRelative(-0.83f, -0.09f, -1.64f, -0.21f, -2.14f, -0.29f)
                curveToRelative(-1.18f, 1.02f, -3.12f, 1.85f, -4.38f, 1.59f)
                curveToRelative(-0.6f, -0.13f, -1.05f, -0.51f, -1.23f, -1.04f)
                curveToRelative(-0.09f, -0.26f, -0.32f, -0.93f, 0.91f, -3.64f)
                curveToRelative(-1.23f, -2.72f, -1.0f, -3.39f, -0.91f, -3.65f)
                curveToRelative(0.19f, -0.55f, 0.69f, -0.97f, 1.32f, -1.04f)
                close()
                moveTo(17.74f, 15.62f)
                curveToRelative(4.29f, -0.65f, 5.26f, -2.29f, 5.26f, -3.62f)
                curveToRelative(0f, -1.45f, -1.12f, -3.25f, -6.4f, -3.77f)
                verticalLineToRelative(0.0f)
                curveToRelative(-1.39f, -1.76f, -4.44f, -5.24f, -7.81f, -5.24f)
                curveToRelative(-0.49f, 0f, -0.93f, 0.25f, -1.16f, 0.67f)
                curveToRelative(-0.24f, 0.42f, -0.2f, 1.07f, -0.04f, 1.81f)
                lineToRelative(-4.04f, -4.04f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, 1.53f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                reflectiveCurveToRelative(0.59f, -1.53f, 0f, -2.12f)
                lineToRelative(-4.82f, -4.82f)
                close()
            }
        }.also { _PlaneSlash = it}
