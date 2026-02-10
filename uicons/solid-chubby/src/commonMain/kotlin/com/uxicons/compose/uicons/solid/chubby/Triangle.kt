package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Triangle: ImageVector? = null

val Icons.Sc.Triangle: ImageVector
    get() = _Triangle ?: UXIcon(name = "Triangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.83f, 8.43f)
                curveTo(15.1f, 2.95f, 12.7f, 1.66f, 12.44f, 1.53f)
                curveToRelative(-0.28f, -0.14f, -0.61f, -0.14f, -0.89f, 0f)
                curveToRelative(-0.26f, 0.13f, -2.66f, 1.42f, -6.38f, 6.9f)
                curveTo(1.44f, 13.92f, 1.02f, 17.25f, 1.01f, 17.38f)
                curveToRelative(-0.03f, 0.23f, 0.03f, 0.47f, 0.16f, 0.67f)
                curveToRelative(0.12f, 0.18f, 3.11f, 4.52f, 10.83f, 4.52f)
                curveToRelative(7.87f, 0f, 10.73f, -4.36f, 10.85f, -4.54f)
                curveToRelative(0.12f, -0.19f, 0.17f, -0.42f, 0.15f, -0.65f)
                curveToRelative(-0.02f, -0.14f, -0.43f, -3.46f, -4.17f, -8.96f)
                close()
            }
        }.also { _Triangle = it}
