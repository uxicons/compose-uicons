package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Sr.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.01f, 9.77f)
                curveToRelative(-0.86f, -1.26f, -2.43f, -2.77f, -5.01f, -2.77f)
                reflectiveCurveToRelative(-4.15f, 1.5f, -5.01f, 2.77f)
                curveToRelative(-0.1f, 0.14f, -0.1f, 0.33f, 0f, 0.47f)
                curveToRelative(0.86f, 1.26f, 2.43f, 2.77f, 5.01f, 2.77f)
                reflectiveCurveToRelative(4.15f, -1.5f, 5.01f, -2.77f)
                curveToRelative(0.1f, -0.14f, 0.1f, -0.32f, 0f, -0.47f)
                horizontalLineToRelative(0f)
                close()
                moveTo(10f, 11.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.71f, 22.29f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(16.66f, 11.36f)
                curveToRelative(-0.93f, 1.36f, -3.02f, 3.64f, -6.66f, 3.64f)
                reflectiveCurveToRelative(-5.73f, -2.28f, -6.66f, -3.64f)
                curveToRelative(-0.56f, -0.83f, -0.56f, -1.89f, 0f, -2.72f)
                curveToRelative(0.93f, -1.36f, 3.02f, -3.64f, 6.66f, -3.64f)
                reflectiveCurveToRelative(5.74f, 2.28f, 6.66f, 3.64f)
                curveToRelative(0.56f, 0.83f, 0.56f, 1.89f, 0f, 2.72f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
