package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Rc.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.57f, 0f, 6.36f, 0.67f, 7.83f, 3.28f)
                curveToRelative(-1.34f, 0.99f, -4.38f, 1.55f, -8.06f, 1.46f)
                curveToRelative(-3.78f, -0.1f, -6.56f, -0.83f, -7.6f, -1.46f)
                curveToRelative(1.48f, -2.61f, 4.26f, -3.28f, 7.83f, -3.28f)
                close()
                moveTo(3.0f, 12.47f)
                curveToRelative(2.58f, 0.77f, 5.05f, 3.24f, 5.33f, 8.17f)
                curveToRelative(-3.21f, -0.76f, -5.21f, -2.91f, -5.33f, -8.17f)
                close()
                moveTo(10.35f, 20.94f)
                curveToRelative(-0.21f, -6.58f, -3.75f, -9.71f, -7.29f, -10.53f)
                curveToRelative(0.07f, -0.85f, 0.19f, -1.6f, 0.37f, -2.27f)
                curveToRelative(1.99f, 1.05f, 5.47f, 1.52f, 8.29f, 1.59f)
                curveToRelative(0.24f, 0.01f, 0.51f, 0.01f, 0.8f, 0.01f)
                curveToRelative(2.18f, 0f, 5.81f, -0.23f, 8.06f, -1.57f)
                curveToRelative(0.17f, 0.67f, 0.3f, 1.42f, 0.36f, 2.26f)
                curveToRelative(-3.38f, 0.81f, -7.04f, 3.96f, -7.3f, 10.51f)
                curveToRelative(-0.53f, 0.04f, -1.07f, 0.06f, -1.64f, 0.06f)
                curveToRelative(-0.57f, 0f, -1.12f, -0.02f, -1.65f, -0.06f)
                close()
                moveTo(15.66f, 20.65f)
                curveToRelative(0.31f, -4.9f, 2.78f, -7.37f, 5.33f, -8.16f)
                curveToRelative(-0.12f, 5.26f, -2.13f, 7.41f, -5.33f, 8.16f)
                close()
            }
        }.also { _SteeringWheel = it}
