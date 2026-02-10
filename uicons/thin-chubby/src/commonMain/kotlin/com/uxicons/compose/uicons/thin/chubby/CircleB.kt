package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Tc.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.42f, 11.27f)
                curveToRelative(0.65f, -0.44f, 1.08f, -1.15f, 1.08f, -2.27f)
                curveToRelative(0f, -2.67f, -2.62f, -2.99f, -4.59f, -3.0f)
                lineToRelative(-2.86f, -0.0f)
                curveToRelative(-0.23f, 0f, -0.43f, 0.16f, -0.48f, 0.38f)
                curveToRelative(-0.02f, 0.09f, -0.56f, 2.3f, -0.56f, 5.62f)
                reflectiveCurveToRelative(0.54f, 5.53f, 0.56f, 5.62f)
                curveToRelative(0.06f, 0.22f, 0.26f, 0.38f, 0.48f, 0.38f)
                horizontalLineToRelative(3.35f)
                curveToRelative(2.77f, -0.01f, 5.6f, -0.43f, 5.6f, -3.5f)
                curveToRelative(0f, -1.97f, -1.07f, -2.85f, -2.58f, -3.23f)
                close()
                moveTo(8.45f, 7.0f)
                horizontalLineToRelative(2.46f)
                curveToRelative(3.15f, 0.01f, 3.59f, 0.97f, 3.59f, 2.0f)
                curveToRelative(0f, 1.04f, -0.41f, 2f, -3.42f, 2f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(0.07f, -1.92f, 0.31f, -3.35f, 0.44f, -4f)
                close()
                moveTo(11.4f, 17.0f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.15f, -0.76f, -0.45f, -2.58f, -0.45f, -5f)
                verticalLineToRelative(-0.0f)
                curveToRelative(0.39f, 0.01f, 3.21f, -0.0f, 3.55f, 0.0f)
                curveToRelative(3.72f, 0f, 4.45f, 0.92f, 4.45f, 2.5f)
                curveToRelative(0f, 1.53f, -0.77f, 2.49f, -4.6f, 2.5f)
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
        }.also { _CircleB = it}
