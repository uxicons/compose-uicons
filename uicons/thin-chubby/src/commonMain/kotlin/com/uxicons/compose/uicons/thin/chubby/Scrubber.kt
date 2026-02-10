package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scrubber: ImageVector? = null

val Icons.Tc.Scrubber: ImageVector
    get() = _Scrubber ?: UXIcon(name = "Scrubber") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(-2.77f, 0f, -4f, 1.23f, -4f, 4f)
                reflectiveCurveToRelative(1.23f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.23f, 4f, -4f)
                reflectiveCurveToRelative(-1.23f, -4f, -4f, -4f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.21f, 0f, -3f, -0.79f, -3f, -3f)
                reflectiveCurveToRelative(0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                reflectiveCurveToRelative(-0.79f, 3f, -3f, 3f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
            }
        }.also { _Scrubber = it}
