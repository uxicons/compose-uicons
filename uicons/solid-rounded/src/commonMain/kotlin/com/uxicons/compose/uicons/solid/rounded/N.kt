package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _N: ImageVector? = null

val Icons.Sr.N: ImageVector
    get() = _N ?: UXIcon(name = "N") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.37f, 24.01f)
                curveToRelative(-1.41f, 0f, -2.66f, -0.81f, -3.25f, -2.18f)
                lineTo(7.04f, 2.96f)
                curveToRelative(-0.38f, -0.88f, -1.16f, -1.05f, -1.77f, -0.93f)
                curveToRelative(-0.61f, 0.12f, -1.26f, 0.6f, -1.26f, 1.55f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(3.58f)
                curveTo(2f, 1.83f, 3.15f, 0.42f, 4.86f, 0.07f)
                curveToRelative(1.71f, -0.35f, 3.33f, 0.49f, 4.01f, 2.1f)
                lineToRelative(8.09f, 18.87f)
                curveToRelative(0.38f, 0.87f, 1.16f, 1.05f, 1.77f, 0.93f)
                curveToRelative(0.61f, -0.13f, 1.26f, -0.6f, 1.26f, -1.55f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(20.42f)
                curveToRelative(0f, 1.75f, -1.15f, 3.16f, -2.86f, 3.51f)
                curveToRelative(-0.26f, 0.05f, -0.52f, 0.08f, -0.77f, 0.08f)
                close()
            }
        }.also { _N = it}
