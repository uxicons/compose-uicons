package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Intersection: ImageVector? = null

val Icons.Br.Intersection: ImageVector
    get() = _Intersection ?: UXIcon(name = "Intersection") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-12.5f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-12.5f)
            curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
            reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Intersection = it }
