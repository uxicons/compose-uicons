package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerThreeQuarters: ImageVector? = null

val Icons.Sc.ThermometerThreeQuarters: ImageVector
    get() = _ThermometerThreeQuarters ?: UXIcon(name = "ThermometerThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.02f, 15.98f)
                curveToRelative(0f, 0.88f, -0.12f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.12f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.12f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.12f, 1.0f, 1.0f)
                close()
                moveTo(19.01f, 15.98f)
                curveToRelative(0f, 4.84f, -2.16f, 6.99f, -6.99f, 6.99f)
                reflectiveCurveToRelative(-6.99f, -2.16f, -6.99f, -6.99f)
                curveToRelative(0f, -1.91f, 0.27f, -4.53f, 2.5f, -5.95f)
                verticalLineToRelative(-4.54f)
                curveToRelative(0f, -3.07f, 1.43f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 1.43f, 4.5f, 4.5f)
                verticalLineToRelative(4.54f)
                curveToRelative(2.23f, 1.42f, 2.5f, 4.04f, 2.5f, 5.95f)
                close()
                moveTo(15.02f, 15.98f)
                curveToRelative(0f, -1.62f, -0.68f, -2.58f, -2.0f, -2.88f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(6.11f)
                curveToRelative(-1.32f, 0.3f, -2.0f, 1.26f, -2.0f, 2.88f)
                curveToRelative(0f, 1.99f, 1.01f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.01f, 3.0f, -3.0f)
                close()
            }
        }.also { _ThermometerThreeQuarters = it}
