package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spa: ImageVector? = null

val Icons.Ss.Spa: ImageVector
    get() = _Spa ?: UXIcon(name = "Spa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19.5f)
                curveToRelative(0f, 2.48f, -5.37f, 4.5f, -12f, 4.5f)
                reflectiveCurveToRelative(-12f, -2.02f, -12f, -4.5f)
                reflectiveCurveToRelative(5.37f, -4.5f, 12f, -4.5f)
                reflectiveCurveToRelative(12f, 2.02f, 12f, 4.5f)
                close()
                moveTo(12.5f, 7f)
                curveToRelative(-5.25f, 0f, -9.5f, 1.57f, -9.5f, 3.5f)
                reflectiveCurveToRelative(4.25f, 3.5f, 9.5f, 3.5f)
                reflectiveCurveToRelative(9.5f, -1.57f, 9.5f, -3.5f)
                reflectiveCurveToRelative(-4.25f, -3.5f, -9.5f, -3.5f)
                close()
                moveTo(10.5f, 0f)
                curveToRelative(-3.04f, 0f, -5.5f, 1.34f, -5.5f, 3f)
                reflectiveCurveToRelative(2.46f, 3f, 5.5f, 3f)
                reflectiveCurveToRelative(5.5f, -1.34f, 5.5f, -3f)
                reflectiveCurveToRelative(-2.46f, -3f, -5.5f, -3f)
                close()
            }
        }.also { _Spa = it}
