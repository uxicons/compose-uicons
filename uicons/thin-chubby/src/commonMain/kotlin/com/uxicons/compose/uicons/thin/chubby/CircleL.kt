package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleL: ImageVector? = null

val Icons.Tc.CircleL: ImageVector
    get() = _CircleL ?: UXIcon(name = "CircleL") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.99f, 17.02f)
                curveToRelative(0.05f, 0.27f, -0.13f, 0.53f, -0.4f, 0.58f)
                curveToRelative(-0.73f, 0.13f, -2.05f, 0.39f, -3.8f, 0.39f)
                curveToRelative(-2.06f, 0f, -3.89f, -0.41f, -3.97f, -0.42f)
                curveToRelative(-0.2f, -0.04f, -0.34f, -0.2f, -0.38f, -0.4f)
                curveToRelative(-0.02f, -0.1f, -0.44f, -2.41f, -0.44f, -5.18f)
                reflectiveCurveToRelative(0.42f, -5.46f, 0.43f, -5.58f)
                curveToRelative(0.04f, -0.27f, 0.29f, -0.46f, 0.57f, -0.42f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.3f, 0.42f, 0.57f)
                curveToRelative(-0.0f, 0.03f, -0.42f, 2.75f, -0.42f, 5.42f)
                curveToRelative(0f, 2.08f, 0.25f, 3.93f, 0.37f, 4.67f)
                curveToRelative(0.6f, 0.11f, 1.97f, 0.33f, 3.42f, 0.33f)
                curveToRelative(1.66f, -0.01f, 2.92f, -0.25f, 3.62f, -0.38f)
                curveToRelative(0.28f, -0.05f, 0.53f, 0.13f, 0.58f, 0.4f)
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
        }.also { _CircleL = it}
