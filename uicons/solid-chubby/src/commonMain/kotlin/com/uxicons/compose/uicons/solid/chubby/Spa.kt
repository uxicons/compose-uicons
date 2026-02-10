package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spa: ImageVector? = null

val Icons.Sc.Spa: ImageVector
    get() = _Spa ?: UXIcon(name = "Spa") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.73f, 18.94f)
                arcToRelative(8.02f, 4.06f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.04f, 0f)
                arcToRelative(8.02f, 4.06f, 0f, isMoreThanHalf = true, isPositiveArc = false, -16.04f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.96f, 10.52f)
                arcToRelative(6.66f, 3.37f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.32f, 0f)
                arcToRelative(6.66f, 3.37f, 0f, isMoreThanHalf = true, isPositiveArc = false, -13.32f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 6.16f)
                curveToRelative(1.93f, 0f, 3.23f, -0.93f, 3.23f, -2.58f)
                reflectiveCurveToRelative(-1.29f, -2.58f, -3.23f, -2.58f)
                reflectiveCurveToRelative(-3.23f, 0.93f, -3.23f, 2.58f)
                reflectiveCurveToRelative(1.29f, 2.58f, 3.23f, 2.58f)
                close()
            }
        }.also { _Spa = it}
