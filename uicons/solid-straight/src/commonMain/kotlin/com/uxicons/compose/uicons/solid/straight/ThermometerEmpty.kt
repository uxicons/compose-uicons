package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerEmpty: ImageVector? = null

val Icons.Ss.ThermometerEmpty: ImageVector
    get() = _ThermometerEmpty ?: UXIcon(name = "ThermometerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12.11f)
                verticalLineToRelative(-7.11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(7.11f)
                curveToRelative(-1.28f, 1.3f, -2f, 3.06f, -2f, 4.89f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -1.83f, -0.72f, -3.58f, -2f, -4.89f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _ThermometerEmpty = it}
