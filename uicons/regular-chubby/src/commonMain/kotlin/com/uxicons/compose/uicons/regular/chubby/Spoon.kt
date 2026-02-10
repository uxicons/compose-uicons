package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Rc.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.27f, 2.67f)
                curveTo(18.98f, 0.44f, 12.56f, 0.1f, 8.34f, 4.21f)
                curveToRelative(-2.82f, 2.96f, -2.78f, 6.63f, 0.05f, 9.94f)
                lineTo(1.29f, 21.27f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.19f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(7.1f, -7.11f)
                curveToRelative(1.68f, 1.45f, 3.42f, 2.19f, 5.12f, 2.19f)
                curveToRelative(1.68f, 0f, 3.31f, -0.71f, 4.8f, -2.14f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.03f)
                curveToRelative(4.32f, -4.45f, 3.77f, -10.73f, 1.51f, -12.92f)
                close()
                moveTo(18.33f, 14.18f)
                curveToRelative(-3.03f, 2.88f, -5.93f, 1.21f, -7.84f, -0.7f)
                curveToRelative(-1.92f, -1.92f, -3.6f, -4.85f, -0.73f, -7.87f)
                curveToRelative(1.93f, -1.88f, 4.4f, -2.58f, 6.47f, -2.58f)
                curveToRelative(1.61f, 0f, 2.97f, 0.43f, 3.63f, 1.07f)
                curveToRelative(1.45f, 1.41f, 1.98f, 6.44f, -1.54f, 10.08f)
                close()
            }
        }.also { _Spoon = it}
