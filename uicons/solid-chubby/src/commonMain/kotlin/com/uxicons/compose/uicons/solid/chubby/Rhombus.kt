package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Sc.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.27f, 10.08f)
                curveToRelative(-2.21f, -3.4f, -5.02f, -6.25f, -8.36f, -8.5f)
                curveToRelative(-1.16f, -0.78f, -2.66f, -0.78f, -3.82f, 0f)
                curveTo(6.75f, 3.83f, 3.94f, 6.69f, 1.73f, 10.08f)
                curveToRelative(-0.76f, 1.17f, -0.76f, 2.67f, 0f, 3.84f)
                curveToRelative(2.21f, 3.4f, 5.02f, 6.25f, 8.36f, 8.5f)
                curveToRelative(0.58f, 0.39f, 1.24f, 0.58f, 1.91f, 0.58f)
                reflectiveCurveToRelative(1.33f, -0.2f, 1.91f, -0.58f)
                curveToRelative(3.34f, -2.25f, 6.15f, -5.1f, 8.36f, -8.5f)
                curveToRelative(0.76f, -1.17f, 0.76f, -2.67f, 0f, -3.84f)
                close()
            }
        }.also { _Rhombus = it}
