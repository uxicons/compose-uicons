package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Tc.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22.58f)
                curveToRelative(-7.82f, 0f, -10.79f, -4.33f, -10.92f, -4.51f)
                curveToRelative(-0.07f, -0.1f, -0.09f, -0.22f, -0.08f, -0.33f)
                curveToRelative(0.02f, -0.14f, 0.43f, -3.51f, 4.28f, -9.18f)
                curveTo(9.19f, 2.8f, 11.67f, 1.52f, 11.78f, 1.47f)
                curveToRelative(0.14f, -0.07f, 0.3f, -0.07f, 0.44f, 0f)
                curveToRelative(0.1f, 0.05f, 2.59f, 1.33f, 6.49f, 7.08f)
                horizontalLineToRelative(0f)
                curveToRelative(3.85f, 5.67f, 4.26f, 9.04f, 4.28f, 9.18f)
                curveToRelative(0.01f, 0.11f, -0.01f, 0.23f, -0.07f, 0.32f)
                curveToRelative(-0.12f, 0.18f, -2.95f, 4.53f, -10.92f, 4.53f)
                close()
                moveTo(2.03f, 17.66f)
                curveToRelative(0.59f, 0.73f, 3.52f, 3.92f, 9.97f, 3.92f)
                curveToRelative(6.58f, 0f, 9.41f, -3.19f, 9.97f, -3.92f)
                curveToRelative(-0.14f, -0.76f, -0.89f, -3.84f, -4.08f, -8.55f)
                curveToRelative(-3.06f, -4.52f, -5.21f, -6.16f, -5.89f, -6.61f)
                curveToRelative(-0.67f, 0.44f, -2.82f, 2.09f, -5.89f, 6.61f)
                curveToRelative(-3.19f, 4.7f, -3.94f, 7.78f, -4.08f, 8.54f)
                close()
            }
        }.also { _Triangle = it}
