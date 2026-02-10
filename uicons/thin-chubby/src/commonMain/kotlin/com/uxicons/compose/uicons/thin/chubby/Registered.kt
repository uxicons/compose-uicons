package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Registered: ImageVector? = null

val Icons.Tc.Registered: ImageVector
    get() = _Registered ?: UXIcon(name = "Registered") {
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
                moveTo(16.02f, 9.67f)
                curveToRelative(0f, -3.21f, -2.69f, -3.66f, -5.33f, -3.67f)
                horizontalLineToRelative(-1.65f)
                curveToRelative(-0.23f, 0f, -0.43f, 0.16f, -0.48f, 0.38f)
                curveToRelative(-0.02f, 0.09f, -0.56f, 2.3f, -0.56f, 5.62f)
                reflectiveCurveToRelative(0.54f, 5.53f, 0.56f, 5.62f)
                curveToRelative(0.07f, 0.27f, 0.34f, 0.43f, 0.61f, 0.36f)
                curveToRelative(0.27f, -0.07f, 0.43f, -0.34f, 0.36f, -0.61f)
                curveToRelative(-0.01f, -0.02f, -0.38f, -1.55f, -0.5f, -3.93f)
                curveToRelative(1.12f, 0.09f, 2.5f, 0.08f, 3.52f, -0.12f)
                curveToRelative(0.14f, 0.12f, 1.96f, 1.82f, 2.45f, 4.28f)
                curveToRelative(0.05f, 0.27f, 0.32f, 0.45f, 0.59f, 0.39f)
                curveToRelative(0.27f, -0.05f, 0.45f, -0.32f, 0.39f, -0.59f)
                curveToRelative(-0.41f, -2.08f, -1.63f, -3.63f, -2.31f, -4.37f)
                curveToRelative(1.56f, -0.57f, 2.35f, -1.68f, 2.35f, -3.36f)
                close()
                moveTo(10.5f, 12.5f)
                curveToRelative(-0.5f, 0f, -1.01f, -0.02f, -1.5f, -0.06f)
                curveToRelative(-0.06f, -2.21f, 0.29f, -4.76f, 0.45f, -5.43f)
                horizontalLineToRelative(1.24f)
                curveToRelative(3.6f, 0.01f, 4.33f, 1.03f, 4.33f, 2.67f)
                curveToRelative(0f, 1.32f, -0.51f, 2.83f, -4.52f, 2.83f)
                close()
            }
        }.also { _Registered = it}
