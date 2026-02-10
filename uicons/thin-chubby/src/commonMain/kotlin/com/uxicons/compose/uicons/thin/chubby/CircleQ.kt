package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQ: ImageVector? = null

val Icons.Tc.CircleQ: ImageVector
    get() = _CircleQ ?: UXIcon(name = "CircleQ") {
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
                moveTo(12f, 6f)
                curveToRelative(-3.5f, 0f, -5f, 1.79f, -5f, 6f)
                reflectiveCurveToRelative(1.5f, 6f, 5f, 6f)
                curveToRelative(1.41f, 0f, 2.48f, -0.31f, 3.28f, -0.93f)
                curveToRelative(0.3f, 0.46f, 0.57f, 0.99f, 0.74f, 1.57f)
                curveToRelative(0.08f, 0.27f, 0.36f, 0.41f, 0.62f, 0.34f)
                curveToRelative(0.27f, -0.08f, 0.41f, -0.36f, 0.34f, -0.62f)
                curveToRelative(-0.23f, -0.78f, -0.6f, -1.45f, -1.0f, -2.03f)
                curveToRelative(0.69f, -0.97f, 1.03f, -2.38f, 1.03f, -4.33f)
                curveToRelative(0f, -4.21f, -1.5f, -6f, -5f, -6f)
                close()
                moveTo(13.78f, 14.08f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.09f, -0.69f, 0.14f)
                curveToRelative(-0.15f, 0.23f, -0.09f, 0.54f, 0.14f, 0.69f)
                curveToRelative(0.01f, 0.01f, 0.72f, 0.5f, 1.45f, 1.35f)
                curveToRelative(-0.63f, 0.5f, -1.49f, 0.73f, -2.67f, 0.73f)
                curveToRelative(-2.92f, 0f, -4f, -1.35f, -4f, -5f)
                reflectiveCurveToRelative(1.08f, -5f, 4f, -5f)
                reflectiveCurveToRelative(4f, 1.35f, 4f, 5f)
                curveToRelative(0f, 1.57f, -0.22f, 2.69f, -0.68f, 3.49f)
                curveToRelative(-0.77f, -0.87f, -1.49f, -1.37f, -1.54f, -1.4f)
                close()
            }
        }.also { _CircleQ = it}
