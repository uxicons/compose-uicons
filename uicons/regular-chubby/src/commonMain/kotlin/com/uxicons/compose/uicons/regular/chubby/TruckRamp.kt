package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Rc.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 15.97f)
                lineToRelative(0.5f, -10.66f)
                curveToRelative(0.04f, -0.88f, 0.56f, -1.67f, 1.36f, -2.05f)
                lineToRelative(0.58f, -0.28f)
                curveToRelative(0.5f, -0.24f, 0.71f, -0.83f, 0.47f, -1.33f)
                curveToRelative(-0.24f, -0.5f, -0.84f, -0.71f, -1.33f, -0.47f)
                lineToRelative(-0.57f, 0.27f)
                curveToRelative(-1.46f, 0.7f, -2.42f, 2.14f, -2.5f, 3.76f)
                lineToRelative(-0.52f, 11.01f)
                curveToRelative(-0.19f, 0.09f, -0.37f, 0.19f, -0.54f, 0.31f)
                curveToRelative(-1.34f, 0.56f, -3.93f, 1.56f, -6.6f, 2.08f)
                curveToRelative(-3.82f, 0.74f, -8.77f, 0.63f, -8.82f, 0.63f)
                curveToRelative(-0.53f, 0f, -1.01f, 0.42f, -1.02f, 0.98f)
                curveToRelative(-0.01f, 0.55f, 0.42f, 1.01f, 0.98f, 1.02f)
                curveToRelative(0.05f, 0f, 0.36f, 0.01f, 0.86f, 0.01f)
                curveToRelative(1.64f, 0f, 5.3f, -0.07f, 8.39f, -0.67f)
                curveToRelative(1.69f, -0.33f, 3.35f, -0.83f, 4.71f, -1.31f)
                curveToRelative(-0.0f, 0.05f, -0.0f, 0.1f, -0.0f, 0.15f)
                curveToRelative(0f, 1.93f, 1.56f, 3.49f, 3.49f, 3.49f)
                reflectiveCurveToRelative(3.49f, -1.56f, 3.49f, -3.49f)
                curveToRelative(0f, -1.73f, -1.26f, -3.17f, -2.92f, -3.45f)
                close()
                moveTo(19.42f, 20.91f)
                curveToRelative(-0.82f, 0f, -1.49f, -0.67f, -1.49f, -1.49f)
                reflectiveCurveToRelative(0.67f, -1.49f, 1.49f, -1.49f)
                reflectiveCurveToRelative(1.49f, 0.67f, 1.49f, 1.49f)
                reflectiveCurveToRelative(-0.67f, 1.49f, -1.49f, 1.49f)
                close()
            }
        }.also { _TruckRamp = it}
