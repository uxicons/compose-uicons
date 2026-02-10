package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Waffle: ImageVector? = null

val Icons.Rs.Waffle: ImageVector
    get() = _Waffle ?: UXIcon(name = "Waffle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 3.52f)
                curveTo(18.22f, 1.25f, 15.21f, 0f, 12f, 0f)
                reflectiveCurveTo(5.78f, 1.25f, 3.52f, 3.52f)
                reflectiveCurveTo(0f, 8.79f, 0f, 12f)
                reflectiveCurveToRelative(1.25f, 6.22f, 3.52f, 8.48f)
                curveToRelative(2.27f, 2.27f, 5.28f, 3.52f, 8.48f, 3.52f)
                reflectiveCurveToRelative(6.22f, -1.25f, 8.48f, -3.52f)
                curveToRelative(2.27f, -2.27f, 3.52f, -5.28f, 3.52f, -8.48f)
                reflectiveCurveToRelative(-1.25f, -6.22f, -3.52f, -8.48f)
                close()
                moveTo(19.07f, 19.07f)
                curveToRelative(-1.89f, 1.89f, -4.4f, 2.93f, -7.07f, 2.93f)
                reflectiveCurveToRelative(-5.18f, -1.04f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-2.93f, -4.4f, -2.93f, -7.07f)
                reflectiveCurveToRelative(1.04f, -5.18f, 2.93f, -7.07f)
                reflectiveCurveToRelative(4.4f, -2.93f, 7.07f, -2.93f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                reflectiveCurveToRelative(2.93f, 4.4f, 2.93f, 7.07f)
                reflectiveCurveToRelative(-1.04f, 5.18f, -2.93f, 7.07f)
                close()
                moveTo(16f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Waffle = it}
