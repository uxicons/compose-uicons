package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Surfing: ImageVector? = null

val Icons.Tr.Surfing: ImageVector
    get() = _Surfing ?: UXIcon(name = "Surfing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.37f, 0f)
                curveToRelative(-1.44f, 0f, -6.54f, 0.4f, -11.68f, 5.54f)
                curveTo(5.08f, 9.15f, 2.18f, 13.38f, 0.29f, 17.77f)
                curveToRelative(-0.59f, 1.38f, -0.29f, 2.95f, 0.77f, 4.01f)
                lineToRelative(1.16f, 1.16f)
                curveToRelative(0.7f, 0.7f, 1.63f, 1.07f, 2.57f, 1.07f)
                curveToRelative(0.48f, 0f, 0.97f, -0.1f, 1.44f, -0.3f)
                curveToRelative(4.38f, -1.87f, 8.61f, -4.78f, 12.23f, -8.4f)
                curveToRelative(5.14f, -5.14f, 5.54f, -10.24f, 5.54f, -11.68f)
                curveToRelative(0f, -2.37f, -1.25f, -3.63f, -3.63f, -3.63f)
                close()
                moveTo(17.75f, 14.6f)
                curveToRelative(-3.53f, 3.53f, -7.65f, 6.36f, -11.91f, 8.19f)
                curveToRelative(-0.98f, 0.42f, -2.15f, 0.19f, -2.9f, -0.56f)
                lineToRelative(-0.23f, -0.23f)
                lineToRelative(13.15f, -13.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineTo(2f, 21.29f)
                lineToRelative(-0.23f, -0.23f)
                curveToRelative(-0.76f, -0.76f, -0.98f, -1.93f, -0.56f, -2.91f)
                curveToRelative(1.83f, -4.27f, 4.67f, -8.39f, 8.18f, -11.91f)
                curveToRelative(3.87f, -3.87f, 8.21f, -5.25f, 10.98f, -5.25f)
                curveToRelative(1.82f, 0f, 2.63f, 0.81f, 2.63f, 2.63f)
                curveToRelative(0f, 2.77f, -1.38f, 7.11f, -5.25f, 10.98f)
                close()
            }
        }.also { _Surfing = it}
