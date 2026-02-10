package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffin: ImageVector? = null

val Icons.Sc.Coffin: ImageVector
    get() = _Coffin ?: UXIcon(name = "Coffin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-3.06f, 0f, -5.59f, -0.5f, -5.7f, -0.52f)
                curveToRelative(-0.36f, -0.07f, -0.65f, -0.34f, -0.76f, -0.69f)
                curveToRelative(-1.16f, -3.77f, -2.01f, -8.03f, -2.54f, -12.68f)
                curveToRelative(-0.01f, -0.11f, -0.01f, -0.21f, 0.01f, -0.32f)
                curveToRelative(0.57f, -2.76f, 1.44f, -5.0f, 2.64f, -6.84f)
                curveToRelative(0.15f, -0.23f, 0.4f, -0.4f, 0.67f, -0.44f)
                curveToRelative(0.13f, -0.02f, 3.11f, -0.51f, 5.67f, -0.51f)
                reflectiveCurveToRelative(5.54f, 0.49f, 5.67f, 0.51f)
                curveToRelative(0.28f, 0.05f, 0.52f, 0.21f, 0.67f, 0.44f)
                curveToRelative(1.2f, 1.85f, 2.07f, 4.08f, 2.64f, 6.84f)
                curveToRelative(0.02f, 0.1f, 0.03f, 0.21f, 0.01f, 0.32f)
                curveToRelative(-0.53f, 4.65f, -1.38f, 8.92f, -2.54f, 12.68f)
                curveToRelative(-0.11f, 0.35f, -0.4f, 0.61f, -0.76f, 0.69f)
                curveToRelative(-0.11f, 0.02f, -2.63f, 0.52f, -5.7f, 0.52f)
                close()
            }
        }.also { _Coffin = it}
