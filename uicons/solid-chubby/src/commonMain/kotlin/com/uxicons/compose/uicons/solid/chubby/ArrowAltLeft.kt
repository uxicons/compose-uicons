package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltLeft: ImageVector? = null

val Icons.Sc.ArrowAltLeft: ImageVector
    get() = _ArrowAltLeft ?: UXIcon(name = "ArrowAltLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10.5f)
                horizontalLineTo(10.61f)
                curveToRelative(-0.33f, -1.87f, -1.12f, -3.39f, -1.16f, -3.47f)
                curveToRelative(-0.22f, -0.41f, -0.68f, -0.61f, -1.13f, -0.5f)
                curveTo(3.92f, 7.67f, 1.29f, 11.26f, 1.19f, 11.42f)
                curveToRelative(-0.44f, 0.68f, 0.03f, 1.2f, 0.03f, 1.21f)
                curveToRelative(0.47f, 0.61f, 3.05f, 3.73f, 7.17f, 4.84f)
                curveToRelative(0.09f, 0.02f, 0.76f, 0.19f, 1.15f, -0.52f)
                curveToRelative(0.04f, -0.08f, 0.78f, -1.59f, 1.08f, -3.45f)
                horizontalLineToRelative(10.88f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowAltLeft = it}
