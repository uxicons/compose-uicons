package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Sc.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.99f, 17.54f)
                curveToRelative(-0.04f, 0.93f, -0.14f, 2.77f, -0.4f, 4.61f)
                curveToRelative(-0.07f, 0.49f, -0.49f, 0.86f, -0.99f, 0.86f)
                horizontalLineToRelative(-15.68f)
                curveToRelative(-0.54f, 0f, -1.03f, -0.29f, -1.3f, -0.74f)
                curveToRelative(-1.34f, -2.21f, -1.62f, -4.67f, -1.62f, -4.67f)
                curveToRelative(-0.15f, -1.05f, 0.36f, -1.96f, 1.12f, -2.36f)
                curveToRelative(0.73f, -0.38f, 1.6f, -0.29f, 2.25f, 0.26f)
                curveToRelative(0f, 0f, 0.77f, 0.57f, 1.63f, 1.69f)
                lineToRelative(0.01f, -8.4f)
                curveToRelative(0f, -1.78f, 0.71f, -2.78f, 2.5f, -2.78f)
                reflectiveCurveToRelative(2.5f, 1.0f, 2.5f, 2.78f)
                reflectiveCurveToRelative(0f, 5.22f, 0f, 5.22f)
                curveToRelative(2.12f, 0.25f, 6.08f, 1.03f, 9.34f, 2.48f)
                curveToRelative(0.41f, 0.18f, 0.66f, 0.6f, 0.65f, 1.05f)
                close()
                moveTo(5.0f, 12.66f)
                lineTo(5.0f, 8.78f)
                curveToRelative(0.0f, -3.0f, 1.68f, -4.78f, 4.5f, -4.78f)
                reflectiveCurveToRelative(4.5f, 1.79f, 4.5f, 4.78f)
                verticalLineToRelative(3.87f)
                curveToRelative(1.31f, -1.08f, 2f, -2.78f, 2f, -5.15f)
                curveToRelative(0f, -4.31f, -2.19f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.19f, -6.5f, 6.5f)
                curveToRelative(0f, 2.38f, 0.69f, 4.08f, 2.0f, 5.16f)
                close()
            }
        }.also { _Tap = it}
