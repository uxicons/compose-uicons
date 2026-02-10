package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Intersection: ImageVector? = null

val Icons.Ts.Intersection: ImageVector
    get() = _Intersection ?: UXIcon(name = "Intersection") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 4.59f, 4f, 9f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-15f)
                curveTo(3f, 4.04f, 7.04f, 0f, 12f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _Intersection = it}
