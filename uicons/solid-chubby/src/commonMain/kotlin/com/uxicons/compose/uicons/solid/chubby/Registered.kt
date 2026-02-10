package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Registered: ImageVector? = null

val Icons.Sc.Registered: ImageVector
    get() = _Registered ?: UXIcon(name = "Registered") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 12f)
                curveToRelative(-0.21f, 0f, -0.36f, -0.0f, -0.5f, -0.01f)
                curveToRelative(0f, -1.77f, 0.18f, -3.18f, 0.32f, -3.99f)
                horizontalLineToRelative(0.29f)
                curveToRelative(3.39f, 0.01f, 3.39f, 1.0f, 3.39f, 1.88f)
                curveToRelative(0f, 0.74f, 0f, 2.12f, -3.5f, 2.12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(14.37f, 13.11f)
                curveToRelative(1.28f, -0.82f, 1.63f, -2.09f, 1.63f, -3.23f)
                curveToRelative(0f, -3.86f, -3.91f, -3.88f, -5.39f, -3.88f)
                curveToRelative(-0.55f, 0.0f, -0.73f, -0.02f, -1.18f, 0.0f)
                curveToRelative(-0.49f, 0.03f, -0.87f, 0.4f, -0.93f, 0.88f)
                curveToRelative(-0.11f, 0.49f, -0.5f, 2.41f, -0.5f, 5.12f)
                curveToRelative(0f, 3.09f, 0.51f, 5.16f, 0.53f, 5.24f)
                curveToRelative(0.13f, 0.54f, 0.69f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.54f, -0.13f, 0.86f, -0.68f, 0.73f, -1.21f)
                curveToRelative(-0.0f, -0.01f, -0.26f, -1.07f, -0.39f, -2.77f)
                curveToRelative(0.78f, 0.03f, 1.69f, -0.03f, 2.33f, -0.16f)
                curveToRelative(0.32f, 0.37f, 1.26f, 1.58f, 1.61f, 3.36f)
                curveToRelative(0.11f, 0.55f, 0.65f, 0.89f, 1.18f, 0.78f)
                curveToRelative(0.54f, -0.11f, 0.89f, -0.64f, 0.78f, -1.18f)
                curveToRelative(-0.33f, -1.67f, -1.07f, -2.94f, -1.61f, -3.7f)
                close()
            }
        }.also { _Registered = it}
