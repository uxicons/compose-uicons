package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleD: ImageVector? = null

val Icons.Bs.CircleD: ImageVector
    get() = _CircleD ?: UXIcon(name = "CircleD") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(11.75f, 5.75f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                reflectiveCurveToRelative(-2.8f, -6.25f, -6.25f, -6.25f)
                close()
                moveTo(11.75f, 15.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(1.75f)
                curveToRelative(1.79f, 0f, 3.25f, 1.46f, 3.25f, 3.25f)
                reflectiveCurveToRelative(-1.46f, 3.25f, -3.25f, 3.25f)
                close()
            }
        }.also { _CircleD = it}
