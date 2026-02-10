package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Integral: ImageVector? = null

val Icons.Tr.Integral: ImageVector
    get() = _Integral ?: UXIcon(name = "Integral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.75f, 24f)
                curveToRelative(-1.52f, 0f, -2.75f, -1.23f, -2.75f, -2.75f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.96f, 0.79f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.79f, 1.75f, -1.75f)
                verticalLineTo(2.75f)
                curveToRelative(0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.23f, 2.75f, 2.75f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0f, -0.96f, -0.79f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.75f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
                close()
            }
        }.also { _Integral = it}
