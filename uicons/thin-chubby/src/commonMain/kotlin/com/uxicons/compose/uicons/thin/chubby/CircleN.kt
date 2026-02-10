package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Tc.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
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
                moveTo(16.42f, 6.38f)
                curveToRelative(0.02f, 0.09f, 0.58f, 2.3f, 0.58f, 5.62f)
                reflectiveCurveToRelative(-0.56f, 5.53f, -0.58f, 5.62f)
                curveToRelative(-0.05f, 0.19f, -0.2f, 0.33f, -0.39f, 0.37f)
                curveToRelative(-0.19f, 0.04f, -0.39f, -0.04f, -0.5f, -0.2f)
                lineToRelative(-7.2f, -10.06f)
                curveToRelative(-0.15f, 0.94f, -0.33f, 2.44f, -0.33f, 4.27f)
                curveToRelative(0f, 3.19f, 0.54f, 5.36f, 0.55f, 5.38f)
                curveToRelative(0.07f, 0.27f, -0.09f, 0.54f, -0.36f, 0.61f)
                curveToRelative(-0.27f, 0.07f, -0.54f, -0.09f, -0.61f, -0.36f)
                curveToRelative(-0.02f, -0.09f, -0.58f, -2.3f, -0.58f, -5.62f)
                reflectiveCurveToRelative(0.56f, -5.53f, 0.58f, -5.62f)
                curveToRelative(0.05f, -0.19f, 0.2f, -0.33f, 0.39f, -0.37f)
                curveToRelative(0.19f, -0.04f, 0.39f, 0.04f, 0.5f, 0.2f)
                lineToRelative(7.2f, 10.06f)
                curveToRelative(0.15f, -0.94f, 0.33f, -2.44f, 0.33f, -4.27f)
                curveToRelative(0f, -3.19f, -0.54f, -5.36f, -0.55f, -5.38f)
                curveToRelative(-0.07f, -0.27f, 0.09f, -0.54f, 0.36f, -0.61f)
                curveToRelative(0.27f, -0.07f, 0.54f, 0.09f, 0.61f, 0.36f)
                close()
            }
        }.also { _CircleN = it}
