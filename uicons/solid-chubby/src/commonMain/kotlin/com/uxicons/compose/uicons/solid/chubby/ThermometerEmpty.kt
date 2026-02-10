package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerEmpty: ImageVector? = null

val Icons.Sc.ThermometerEmpty: ImageVector
    get() = _ThermometerEmpty ?: UXIcon(name = "ThermometerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 16.0f)
                curveToRelative(0f, 0.88f, -0.12f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0f, 4.84f, -2.16f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -2.16f, -7.0f, -7.0f)
                curveToRelative(0f, -1.91f, 0.27f, -4.53f, 2.5f, -5.96f)
                verticalLineToRelative(-4.54f)
                curveToRelative(0f, -3.07f, 1.43f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 1.43f, 4.5f, 4.5f)
                verticalLineToRelative(4.54f)
                curveToRelative(2.23f, 1.42f, 2.5f, 4.04f, 2.5f, 5.96f)
                close()
                moveTo(15.0f, 16.0f)
                curveToRelative(0f, -1.99f, -1.01f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.01f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.01f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.01f, 3.0f, -3.0f)
                close()
            }
        }.also { _ThermometerEmpty = it}
