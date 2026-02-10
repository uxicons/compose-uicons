package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleA: ImageVector? = null

val Icons.Tc.CircleA: ImageVector
    get() = _CircleA ?: UXIcon(name = "CircleA") {
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
                moveTo(12.39f, 6.19f)
                curveToRelative(-0.19f, -0.24f, -0.6f, -0.24f, -0.79f, 0f)
                curveToRelative(-0.14f, 0.18f, -1.39f, 1.85f, -2.64f, 5.43f)
                curveToRelative(-1.3f, 3.71f, -1.31f, 5.79f, -1.31f, 5.88f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.01f, 0.01f, -0.9f, 0.37f, -2.5f)
                horizontalLineToRelative(5.95f)
                curveToRelative(0.36f, 1.6f, 0.37f, 2.49f, 0.37f, 2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.09f, -0.01f, -2.17f, -1.31f, -5.88f)
                curveToRelative(-1.25f, -3.58f, -2.5f, -5.25f, -2.64f, -5.43f)
                close()
                moveTo(9.27f, 14f)
                curveToRelative(0.17f, -0.61f, 0.37f, -1.29f, 0.63f, -2.05f)
                curveToRelative(0.82f, -2.33f, 1.63f, -3.81f, 2.1f, -4.56f)
                curveToRelative(0.47f, 0.75f, 1.28f, 2.23f, 2.1f, 4.56f)
                curveToRelative(0.27f, 0.76f, 0.47f, 1.44f, 0.63f, 2.05f)
                horizontalLineToRelative(-5.46f)
                close()
            }
        }.also { _CircleA = it}
