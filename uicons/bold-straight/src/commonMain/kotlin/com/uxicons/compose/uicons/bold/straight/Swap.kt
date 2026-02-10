package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swap: ImageVector? = null

val Icons.Bs.Swap: ImageVector
    get() = _Swap ?: UXIcon(name = "Swap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.57f, 19f)
                lineToRelative(-4.24f, 4.63f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0f)
                lineToRelative(-4.24f, -4.63f)
                horizontalLineToRelative(3.57f)
                verticalLineToRelative(-10.25f)
                curveToRelative(0f, -0.96f, -0.79f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.79f, -1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 2.62f, -2.13f, 4.75f, -4.75f, 4.75f)
                reflectiveCurveToRelative(-4.75f, -2.13f, -4.75f, -4.75f)
                verticalLineTo(5f)
                horizontalLineTo(0.43f)
                lineTo(4.67f, 0.37f)
                curveToRelative(0.44f, -0.49f, 1.22f, -0.49f, 1.66f, 0f)
                lineToRelative(4.24f, 4.63f)
                horizontalLineToRelative(-3.57f)
                verticalLineToRelative(10.25f)
                curveToRelative(0f, 0.96f, 0.79f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.79f, 1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -2.62f, 2.13f, -4.75f, 4.75f, -4.75f)
                reflectiveCurveToRelative(4.75f, 2.13f, 4.75f, 4.75f)
                verticalLineToRelative(10.25f)
                horizontalLineToRelative(3.57f)
                close()
            }
        }.also { _Swap = it}
