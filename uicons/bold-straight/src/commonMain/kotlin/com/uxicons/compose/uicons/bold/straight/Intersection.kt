package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Intersection: ImageVector? = null

val Icons.Bs.Intersection: ImageVector
    get() = _Intersection ?: UXIcon(name = "Intersection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-14f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
            }
        }.also { _Intersection = it}
