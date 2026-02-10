package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleE: ImageVector? = null

val Icons.Tc.CircleE: ImageVector
    get() = _CircleE ?: UXIcon(name = "CircleE") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.36f, 7.3f)
                curveToRelative(-0.1f, 0.66f, -0.31f, 2.3f, -0.35f, 4.2f)
                horizontalLineToRelative(5.49f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5.49f)
                curveToRelative(0.03f, 1.89f, 0.25f, 3.54f, 0.35f, 4.2f)
                curveToRelative(0.45f, 0.11f, 1.48f, 0.3f, 3.15f, 0.3f)
                curveToRelative(0.97f, 0f, 2.32f, -0.1f, 2.93f, -0.19f)
                curveToRelative(0.27f, -0.04f, 0.53f, 0.15f, 0.57f, 0.42f)
                curveToRelative(0.04f, 0.27f, -0.15f, 0.53f, -0.42f, 0.57f)
                curveToRelative(-0.72f, 0.11f, -2.15f, 0.2f, -3.07f, 0.2f)
                curveToRelative(-2.54f, 0f, -3.71f, -0.43f, -3.76f, -0.44f)
                curveToRelative(-0.17f, -0.06f, -0.29f, -0.21f, -0.32f, -0.38f)
                curveToRelative(-0.02f, -0.1f, -0.42f, -2.41f, -0.42f, -5.17f)
                reflectiveCurveToRelative(0.4f, -5.08f, 0.42f, -5.17f)
                curveToRelative(0.03f, -0.17f, 0.15f, -0.32f, 0.32f, -0.38f)
                curveToRelative(0.05f, -0.02f, 1.23f, -0.44f, 3.76f, -0.44f)
                curveToRelative(0.92f, 0f, 2.35f, 0.09f, 3.07f, 0.2f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.29f, 0.42f, 0.57f)
                curveToRelative(-0.04f, 0.27f, -0.3f, 0.46f, -0.57f, 0.42f)
                curveToRelative(-0.6f, -0.09f, -1.95f, -0.19f, -2.93f, -0.19f)
                curveToRelative(-1.67f, 0f, -2.69f, 0.19f, -3.15f, 0.3f)
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
        }.also { _CircleE = it}
