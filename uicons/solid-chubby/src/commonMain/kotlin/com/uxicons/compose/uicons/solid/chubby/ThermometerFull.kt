package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerFull: ImageVector? = null

val Icons.Sc.ThermometerFull: ImageVector
    get() = _ThermometerFull ?: UXIcon(name = "ThermometerFull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.0f, 15.95f)
                curveToRelative(0f, 0.88f, -0.12f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.12f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.12f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.12f, 1.0f, 1.0f)
                close()
                moveTo(18.98f, 15.95f)
                curveToRelative(0f, 4.83f, -2.15f, 6.98f, -6.98f, 6.98f)
                reflectiveCurveToRelative(-6.98f, -2.15f, -6.98f, -6.98f)
                curveToRelative(0f, -1.91f, 0.27f, -4.53f, 2.49f, -5.94f)
                verticalLineToRelative(-4.53f)
                curveToRelative(0f, -3.06f, 1.43f, -4.49f, 4.49f, -4.49f)
                reflectiveCurveToRelative(4.49f, 1.43f, 4.49f, 4.49f)
                verticalLineToRelative(4.53f)
                curveToRelative(2.22f, 1.42f, 2.49f, 4.04f, 2.49f, 5.94f)
                close()
                moveTo(14.99f, 15.95f)
                curveToRelative(0f, -1.61f, -0.68f, -2.57f, -2.0f, -2.88f)
                verticalLineToRelative(-7.6f)
                curveToRelative(0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(7.6f)
                curveToRelative(-1.32f, 0.3f, -2.0f, 1.26f, -2.0f, 2.88f)
                curveToRelative(0f, 1.99f, 1.01f, 2.99f, 2.99f, 2.99f)
                reflectiveCurveToRelative(2.99f, -1.01f, 2.99f, -2.99f)
                close()
            }
        }.also { _ThermometerFull = it}
