package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQ: ImageVector? = null

val Icons.Sc.CircleQ: ImageVector
    get() = _CircleQ ?: UXIcon(name = "CircleQ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(16.96f, 17.71f)
                curveToRelative(0.16f, 0.53f, -0.14f, 1.09f, -0.67f, 1.25f)
                curveToRelative(-0.52f, 0.16f, -1.09f, -0.14f, -1.25f, -0.67f)
                curveToRelative(-0.09f, -0.31f, -0.22f, -0.6f, -0.36f, -0.87f)
                curveToRelative(-0.68f, 0.36f, -1.56f, 0.58f, -2.68f, 0.58f)
                curveToRelative(-4.48f, 0f, -5f, -3.42f, -5f, -6f)
                reflectiveCurveToRelative(0.52f, -6f, 5f, -6f)
                reflectiveCurveToRelative(5f, 3.42f, 5f, 6f)
                curveToRelative(0f, 1.29f, -0.13f, 2.8f, -0.83f, 3.98f)
                curveToRelative(0.31f, 0.52f, 0.59f, 1.09f, 0.79f, 1.73f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.99f, 0f, -3f, -0.62f, -3f, -4f)
                reflectiveCurveToRelative(1.01f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 0.62f, 3f, 4f)
                curveToRelative(0f, 0.93f, -0.08f, 1.65f, -0.23f, 2.2f)
                curveToRelative(-0.64f, -0.64f, -1.17f, -1.0f, -1.21f, -1.04f)
                curveToRelative(-0.46f, -0.3f, -1.07f, -0.18f, -1.38f, 0.28f)
                curveToRelative(-0.31f, 0.46f, -0.18f, 1.08f, 0.27f, 1.39f)
                curveToRelative(0.01f, 0.01f, 0.5f, 0.34f, 1.07f, 0.95f)
                curveToRelative(-0.42f, 0.17f, -0.92f, 0.22f, -1.51f, 0.22f)
                close()
            }
        }.also { _CircleQ = it}
