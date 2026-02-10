package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HospitalSymbol: ImageVector? = null

val Icons.Tc.HospitalSymbol: ImageVector
    get() = _HospitalSymbol ?: UXIcon(name = "HospitalSymbol") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.44f, 6.38f)
                curveToRelative(0.02f, 0.09f, 0.56f, 2.3f, 0.56f, 5.62f)
                reflectiveCurveToRelative(-0.54f, 5.53f, -0.56f, 5.62f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.36f)
                curveToRelative(-0.27f, -0.07f, -0.43f, -0.34f, -0.36f, -0.61f)
                curveToRelative(0.01f, -0.02f, 0.47f, -1.97f, 0.53f, -4.87f)
                curveToRelative(-0.64f, -0.15f, -2.32f, -0.51f, -3.99f, -0.51f)
                reflectiveCurveToRelative(-3.35f, 0.33f, -3.99f, 0.47f)
                curveToRelative(0.05f, 2.93f, 0.52f, 4.89f, 0.53f, 4.91f)
                curveToRelative(0.07f, 0.27f, -0.1f, 0.54f, -0.36f, 0.61f)
                curveToRelative(-0.26f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                curveToRelative(-0.02f, -0.09f, -0.56f, -2.3f, -0.56f, -5.62f)
                reflectiveCurveToRelative(0.54f, -5.53f, 0.56f, -5.62f)
                curveToRelative(0.07f, -0.27f, 0.33f, -0.43f, 0.61f, -0.36f)
                curveToRelative(0.27f, 0.07f, 0.43f, 0.34f, 0.36f, 0.61f)
                curveToRelative(-0.01f, 0.02f, -0.47f, 1.95f, -0.52f, 4.83f)
                curveToRelative(0.8f, -0.17f, 2.38f, -0.45f, 3.99f, -0.45f)
                reflectiveCurveToRelative(3.19f, 0.3f, 3.99f, 0.49f)
                curveToRelative(-0.05f, -2.91f, -0.52f, -4.84f, -0.53f, -4.87f)
                curveToRelative(-0.07f, -0.27f, 0.1f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.27f, -0.07f, 0.54f, 0.1f, 0.61f, 0.36f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.81f, -3.19f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.19f, -11f, -11f)
                reflectiveCurveToRelative(3.19f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.19f, 11f, 11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -7.2f, -2.8f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.8f, -10f, 10f)
                reflectiveCurveToRelative(2.8f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -2.8f, 10f, -10f)
                close()
            }
        }.also { _HospitalSymbol = it}
