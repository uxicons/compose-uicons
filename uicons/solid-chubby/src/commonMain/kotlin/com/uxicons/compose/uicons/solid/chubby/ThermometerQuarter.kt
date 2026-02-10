package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerQuarter: ImageVector? = null

val Icons.Sc.ThermometerQuarter: ImageVector
    get() = _ThermometerQuarter ?: UXIcon(name = "ThermometerQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.53f, 10.02f)
                verticalLineToRelative(-4.54f)
                curveToRelative(0f, -3.07f, -1.43f, -4.49f, -4.49f, -4.49f)
                reflectiveCurveToRelative(-4.49f, 1.43f, -4.49f, 4.49f)
                verticalLineToRelative(4.54f)
                curveToRelative(-2.22f, 1.42f, -2.5f, 4.04f, -2.5f, 5.95f)
                curveToRelative(0f, 4.83f, 2.16f, 6.99f, 6.99f, 6.99f)
                reflectiveCurveToRelative(6.99f, -2.16f, 6.99f, -6.99f)
                curveToRelative(0f, -1.91f, -0.27f, -4.53f, -2.5f, -5.95f)
                close()
                moveTo(12.04f, 18.96f)
                curveToRelative(-1.99f, 0f, -3.0f, -1.01f, -3.0f, -3.0f)
                curveToRelative(0f, -1.62f, 0.68f, -2.57f, 2.0f, -2.88f)
                verticalLineToRelative(-2.11f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.11f)
                curveToRelative(1.32f, 0.3f, 2.0f, 1.26f, 2.0f, 2.88f)
                curveToRelative(0f, 1.99f, -1.01f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(13.04f, 15.96f)
                curveToRelative(0f, 0.88f, -0.12f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.12f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.12f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.12f, 1.0f, 1.0f)
                close()
            }
        }.also { _ThermometerQuarter = it}
