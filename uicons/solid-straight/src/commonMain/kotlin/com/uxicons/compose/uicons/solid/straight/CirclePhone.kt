package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Ss.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                close()
                moveTo(5f, 8.89f)
                curveToRelative(0f, -0.83f, 0.3f, -1.65f, 0.93f, -2.28f)
                lineToRelative(1.61f, -1.61f)
                lineToRelative(3.16f, 3.16f)
                lineToRelative(-2.07f, 2.07f)
                curveToRelative(1.03f, 2.56f, 2.77f, 4.23f, 5.14f, 5.14f)
                lineToRelative(2.07f, -2.07f)
                lineToRelative(3.16f, 3.16f)
                lineToRelative(-1.61f, 1.61f)
                curveToRelative(-0.63f, 0.63f, -1.46f, 0.93f, -2.28f, 0.93f)
                curveToRelative(-4.24f, 0f, -10.11f, -5.54f, -10.11f, -10.11f)
                close()
            }
        }.also { _CirclePhone = it}
