package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sr8: ImageVector? = null

val Icons.Sr.Sr8: ImageVector
    get() = _Sr8 ?: UXIcon(name = "Sr8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.3f, 8.72f)
                curveToRelative(1.03f, -0.92f, 1.7f, -2.24f, 1.7f, -3.72f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 2.24f, 7f, 5f)
                curveToRelative(0f, 1.49f, 0.66f, 2.81f, 1.7f, 3.72f)
                curveToRelative(-2.77f, 1.26f, -4.7f, 4.04f, -4.7f, 7.28f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.23f, -1.93f, -6.02f, -4.7f, -7.28f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _Sr8 = it}
