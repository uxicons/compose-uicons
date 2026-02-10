package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleR: ImageVector? = null

val Icons.Tc.CircleR: ImageVector
    get() = _CircleR ?: UXIcon(name = "CircleR") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10f)
                curveToRelative(0f, -2.68f, -1.74f, -3.98f, -5.33f, -4.0f)
                curveToRelative(-0.43f, 0.0f, -1.32f, -0.02f, -1.67f, 0f)
                curveToRelative(-0.25f, 0.01f, -0.45f, 0.21f, -0.46f, 0.46f)
                curveToRelative(-0.1f, 0.44f, -0.55f, 2.53f, -0.55f, 5.53f)
                curveToRelative(0f, 3.32f, 0.54f, 5.53f, 0.56f, 5.62f)
                curveToRelative(0.07f, 0.27f, 0.34f, 0.43f, 0.61f, 0.36f)
                curveToRelative(0.27f, -0.07f, 0.43f, -0.34f, 0.36f, -0.61f)
                curveToRelative(-0.0f, -0.02f, -0.33f, -1.34f, -0.47f, -3.43f)
                curveToRelative(0.48f, 0.04f, 0.96f, 0.06f, 1.43f, 0.06f)
                curveToRelative(1.04f, 0f, 1.89f, -0.12f, 2.59f, -0.32f)
                curveToRelative(0.29f, 0.32f, 1.49f, 1.75f, 1.92f, 3.92f)
                curveToRelative(0.05f, 0.27f, 0.32f, 0.45f, 0.59f, 0.39f)
                curveToRelative(0.27f, -0.05f, 0.45f, -0.32f, 0.39f, -0.59f)
                curveToRelative(-0.41f, -2.03f, -1.39f, -3.46f, -1.92f, -4.11f)
                curveToRelative(1.52f, -0.79f, 1.93f, -2.12f, 1.93f, -3.3f)
                close()
                moveTo(10.5f, 13f)
                curveToRelative(-0.49f, 0f, -0.99f, -0.02f, -1.49f, -0.06f)
                curveToRelative(-0.01f, -0.3f, -0.01f, -0.61f, -0.01f, -0.94f)
                curveToRelative(0f, -2.42f, 0.31f, -4.25f, 0.46f, -5.0f)
                curveToRelative(0.24f, 0f, 0.96f, 0.01f, 1.22f, 0.01f)
                curveToRelative(3.83f, 0.01f, 4.33f, 1.61f, 4.33f, 3.0f)
                curveToRelative(0f, 1.29f, -0.47f, 3f, -4.5f, 3f)
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
        }.also { _CircleR = it}
