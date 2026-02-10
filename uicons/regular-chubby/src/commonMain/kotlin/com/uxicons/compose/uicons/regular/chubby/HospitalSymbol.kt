package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HospitalSymbol: ImageVector? = null

val Icons.Rc.HospitalSymbol: ImageVector
    get() = _HospitalSymbol ?: UXIcon(name = "HospitalSymbol") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(16.47f, 6.76f)
                curveToRelative(0.02f, 0.09f, 0.53f, 2.15f, 0.53f, 5.24f)
                reflectiveCurveToRelative(-0.51f, 5.16f, -0.53f, 5.24f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.54f, -0.13f, -0.86f, -0.68f, -0.73f, -1.21f)
                curveToRelative(0.0f, -0.02f, 0.33f, -1.37f, 0.43f, -3.45f)
                curveToRelative(-0.73f, -0.14f, -1.85f, -0.3f, -2.96f, -0.3f)
                reflectiveCurveToRelative(-2.24f, 0.17f, -2.96f, 0.3f)
                curveToRelative(0.11f, 2.09f, 0.43f, 3.44f, 0.43f, 3.46f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.52f, 0.14f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.15f, -0.53f, -5.24f)
                reflectiveCurveToRelative(0.51f, -5.16f, 0.53f, -5.24f)
                curveToRelative(0.13f, -0.53f, 0.68f, -0.86f, 1.21f, -0.73f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                curveToRelative(-0.0f, 0.02f, -0.39f, 1.62f, -0.46f, 4.04f)
                curveToRelative(0.8f, -0.14f, 1.88f, -0.28f, 2.99f, -0.28f)
                reflectiveCurveToRelative(2.19f, 0.14f, 2.99f, 0.28f)
                curveToRelative(-0.07f, -2.42f, -0.45f, -4.02f, -0.46f, -4.04f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.53f, -0.14f, 1.08f, 0.19f, 1.21f, 0.73f)
                close()
            }
        }.also { _HospitalSymbol = it}
