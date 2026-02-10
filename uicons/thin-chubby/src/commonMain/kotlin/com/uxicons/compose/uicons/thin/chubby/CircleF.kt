package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleF: ImageVector? = null

val Icons.Tc.CircleF: ImageVector
    get() = _CircleF ?: UXIcon(name = "CircleF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.99f, 6.77f)
                curveToRelative(-0.04f, 0.27f, -0.29f, 0.46f, -0.57f, 0.42f)
                curveToRelative(-0.64f, -0.1f, -1.96f, -0.18f, -2.86f, -0.18f)
                curveToRelative(-1.38f, 0f, -2.64f, 0.21f, -3.21f, 0.32f)
                curveToRelative(-0.1f, 0.64f, -0.29f, 2.13f, -0.34f, 3.87f)
                curveToRelative(0.7f, -0.08f, 1.94f, -0.2f, 3.26f, -0.2f)
                curveToRelative(0.72f, 0f, 1.7f, 0.03f, 2.27f, 0.08f)
                curveToRelative(0.28f, 0.02f, 0.48f, 0.26f, 0.46f, 0.54f)
                reflectiveCurveToRelative(-0.26f, 0.48f, -0.54f, 0.46f)
                curveToRelative(-0.55f, -0.04f, -1.49f, -0.08f, -2.19f, -0.08f)
                curveToRelative(-1.35f, 0f, -2.63f, 0.13f, -3.27f, 0.21f)
                curveToRelative(0.02f, 2.61f, 0.4f, 5.19f, 0.41f, 5.21f)
                curveToRelative(0.04f, 0.27f, -0.15f, 0.53f, -0.42f, 0.57f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.15f, -0.57f, -0.42f)
                curveToRelative(-0.02f, -0.11f, -0.42f, -2.82f, -0.42f, -5.57f)
                reflectiveCurveToRelative(0.4f, -5.08f, 0.42f, -5.17f)
                curveToRelative(0.04f, -0.2f, 0.18f, -0.35f, 0.38f, -0.4f)
                curveToRelative(0.07f, -0.02f, 1.77f, -0.41f, 3.77f, -0.41f)
                curveToRelative(0.96f, 0f, 2.31f, 0.08f, 3.01f, 0.19f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.29f, 0.42f, 0.57f)
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
        }.also { _CircleF = it}
