package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckCircle: ImageVector? = null

val Icons.Tc.CheckCircle: ImageVector
    get() = _CheckCircle ?: UXIcon(name = "CheckCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.92f, 8.77f)
                curveToRelative(-1.79f, 2.78f, -3.31f, 4.92f, -6.6f, 7.14f)
                curveToRelative(-0.17f, 0.11f, -0.38f, 0.12f, -0.55f, 0.01f)
                curveToRelative(-1.44f, -0.91f, -3.08f, -2.05f, -4.26f, -3.62f)
                curveToRelative(-0.17f, -0.22f, -0.12f, -0.53f, 0.1f, -0.7f)
                curveToRelative(0.22f, -0.17f, 0.54f, -0.12f, 0.7f, 0.1f)
                curveToRelative(1.02f, 1.35f, 2.43f, 2.37f, 3.72f, 3.2f)
                curveToRelative(2.95f, -2.05f, 4.33f, -3.99f, 6.05f, -6.67f)
                curveToRelative(0.15f, -0.23f, 0.46f, -0.3f, 0.69f, -0.15f)
                curveToRelative(0.23f, 0.15f, 0.3f, 0.46f, 0.15f, 0.69f)
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
        }.also { _CheckCircle = it}
