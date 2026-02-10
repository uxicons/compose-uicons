package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Sc.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.66f, 17.35f)
                curveToRelative(0.17f, -1.43f, 0.46f, -5.06f, 0.31f, -7.17f)
                curveToRelative(-0.18f, -4.69f, -1.02f, -7.12f, -1.06f, -7.24f)
                curveToRelative(-0.16f, -0.44f, -0.51f, -0.79f, -0.96f, -0.93f)
                curveToRelative(-0.13f, -0.04f, -3.27f, -1.02f, -7.49f, -1.02f)
                curveToRelative(-1.43f, 0f, -3.19f, 0.11f, -4.29f, 0.28f)
                curveToRelative(-0.46f, 0.07f, -0.85f, 0.34f, -1.08f, 0.74f)
                curveToRelative(-1.07f, 1.86f, -2.44f, 4.47f, -3.6f, 8.12f)
                curveToRelative(-2.44f, 7.67f, -2.47f, 11.16f, -2.47f, 11.31f)
                curveToRelative(0f, 0.82f, 0.67f, 1.49f, 1.49f, 1.5f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.82f, 0f, 1.49f, -0.67f, 1.5f, -1.49f)
                curveToRelative(0f, -0.03f, 0.06f, -2.99f, 2.03f, -9.46f)
                horizontalLineToRelative(12.97f)
                curveToRelative(-0.0f, 1.89f, -0.26f, 4.39f, -0.35f, 5.21f)
                curveToRelative(-1.09f, 0.39f, -1.65f, 1.32f, -1.65f, 2.79f)
                curveToRelative(0f, 1.99f, 1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                curveToRelative(0f, -1.33f, -0.46f, -2.21f, -1.34f, -2.65f)
                close()
                moveTo(9.31f, 4.16f)
                curveToRelative(0.94f, -0.1f, 2.14f, -0.16f, 3.14f, -0.16f)
                curveToRelative(2.59f, 0f, 4.74f, 0.42f, 5.83f, 0.68f)
                curveToRelative(0.19f, 0.8f, 0.47f, 2.25f, 0.62f, 4.32f)
                horizontalLineToRelative(-11.85f)
                curveToRelative(0.75f, -1.97f, 1.54f, -3.53f, 2.27f, -4.84f)
                close()
            }
        }.also { _Walker = it}
