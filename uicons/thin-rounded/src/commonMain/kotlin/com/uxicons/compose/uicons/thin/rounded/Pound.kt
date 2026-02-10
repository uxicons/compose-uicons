package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pound: ImageVector? = null

val Icons.Tr.Pound: ImageVector
    get() = _Pound ?: UXIcon(name = "Pound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 23f)
                horizontalLineTo(5.33f)
                curveToRelative(1.07f, -0.94f, 1.67f, -2.49f, 1.67f, -4.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(7f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                reflectiveCurveToRelative(-7.5f, 3.36f, -7.5f, 7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.06f, -0.25f, 4.5f, -3.5f, 4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(18f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Pound = it}
