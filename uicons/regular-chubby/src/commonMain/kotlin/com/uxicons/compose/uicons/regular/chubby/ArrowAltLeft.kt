package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltLeft: ImageVector? = null

val Icons.Rc.ArrowAltLeft: ImageVector
    get() = _ArrowAltLeft ?: UXIcon(name = "ArrowAltLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineTo(10.89f)
                curveToRelative(-0.27f, -2.1f, -1.24f, -3.89f, -1.28f, -3.98f)
                curveToRelative(-0.22f, -0.4f, -0.68f, -0.6f, -1.12f, -0.49f)
                curveTo(4.0f, 7.66f, 1.3f, 11.25f, 1.2f, 11.41f)
                curveToRelative(-0.46f, 0.68f, 0.02f, 1.22f, 0.04f, 1.23f)
                curveToRelative(0.48f, 0.61f, 3.12f, 3.73f, 7.33f, 4.83f)
                curveToRelative(0.09f, 0.02f, 0.77f, 0.16f, 1.14f, -0.51f)
                curveToRelative(0.05f, -0.09f, 0.95f, -1.87f, 1.19f, -3.96f)
                horizontalLineToRelative(11.1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltLeft = it}
