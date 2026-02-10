package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Olive: ImageVector? = null

val Icons.Sr.Olive: ImageVector
    get() = _Olive ?: UXIcon(name = "Olive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.02f, 2.97f)
                curveTo(16.66f, -1.39f, 9.06f, -0.9f, 4.09f, 4.08f)
                curveTo(1.7f, 6.47f, 0.26f, 9.53f, 0.03f, 12.7f)
                curveToRelative(-0.23f, 3.23f, 0.82f, 6.17f, 2.95f, 8.31f)
                curveToRelative(2.0f, 2.0f, 4.66f, 2.97f, 7.45f, 2.97f)
                curveToRelative(3.31f, 0f, 6.78f, -1.38f, 9.48f, -4.08f)
                curveToRelative(2.39f, -2.39f, 3.83f, -5.45f, 4.06f, -8.62f)
                curveToRelative(0.23f, -3.23f, -0.82f, -6.17f, -2.95f, -8.31f)
                close()
                moveTo(19.46f, 9.46f)
                curveToRelative(-0.94f, 0.94f, -2.81f, 0.61f, -4.17f, -0.76f)
                reflectiveCurveToRelative(-1.7f, -3.23f, -0.76f, -4.17f)
                reflectiveCurveToRelative(2.81f, -0.61f, 4.17f, 0.76f)
                curveToRelative(1.36f, 1.36f, 1.7f, 3.23f, 0.76f, 4.17f)
                close()
            }
        }.also { _Olive = it}
