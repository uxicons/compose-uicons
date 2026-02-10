package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassEye: ImageVector? = null

val Icons.Ss.MagnifyingGlassEye: ImageVector
    get() = _MagnifyingGlassEye ?: UXIcon(name = "MagnifyingGlassEye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                curveToRelative(-2.85f, 0f, -4.44f, 1.84f, -5.17f, 3f)
                curveToRelative(0.72f, 1.16f, 2.31f, 3f, 5.17f, 3f)
                reflectiveCurveToRelative(4.44f, -1.84f, 5.17f, -3f)
                curveToRelative(-0.72f, -1.16f, -2.31f, -3f, -5.17f, -3f)
                close()
                moveTo(10f, 11.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.74f, 16.32f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(6.22f, 6.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.22f, -6.22f)
                close()
                moveTo(17.2f, 10.46f)
                curveToRelative(-0.56f, 1.06f, -2.71f, 4.54f, -7.2f, 4.54f)
                reflectiveCurveToRelative(-6.65f, -3.47f, -7.2f, -4.54f)
                lineToRelative(-0.24f, -0.46f)
                lineToRelative(0.24f, -0.46f)
                curveToRelative(0.56f, -1.06f, 2.71f, -4.54f, 7.2f, -4.54f)
                reflectiveCurveToRelative(6.65f, 3.47f, 7.2f, 4.54f)
                lineToRelative(0.24f, 0.46f)
                lineToRelative(-0.24f, 0.46f)
                close()
            }
        }.also { _MagnifyingGlassEye = it}
