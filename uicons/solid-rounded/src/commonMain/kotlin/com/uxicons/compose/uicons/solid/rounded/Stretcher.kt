package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stretcher: ImageVector? = null

val Icons.Sr.Stretcher: ImageVector
    get() = _Stretcher ?: UXIcon(name = "Stretcher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(-0.56f, 0f, -1.07f, 0.16f, -1.52f, 0.43f)
                lineToRelative(-3.02f, -2.82f)
                lineToRelative(4.93f, -4.61f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-13.32f)
                curveToRelative(-1.34f, 0f, -2.58f, -0.67f, -3.33f, -1.78f)
                lineTo(1.83f, 0.45f)
                curveTo(1.53f, -0.01f, 0.91f, -0.14f, 0.45f, 0.17f)
                curveTo(-0.01f, 0.47f, -0.14f, 1.09f, 0.17f, 1.55f)
                lineToRelative(4.52f, 6.77f)
                curveToRelative(0.89f, 1.33f, 2.25f, 2.22f, 3.78f, 2.54f)
                lineToRelative(5.07f, 4.74f)
                lineToRelative(-3.02f, 2.82f)
                curveToRelative(-0.45f, -0.27f, -0.96f, -0.43f, -1.52f, -0.43f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.37f, -0.07f, -0.71f, -0.2f, -1.04f)
                lineToRelative(3.2f, -2.99f)
                lineToRelative(3.2f, 2.99f)
                curveToRelative(-0.12f, 0.33f, -0.2f, 0.67f, -0.2f, 1.04f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(11.53f, 11f)
                horizontalLineToRelative(6.93f)
                lineToRelative(-3.47f, 3.24f)
                lineToRelative(-3.47f, -3.24f)
                close()
            }
        }.also { _Stretcher = it}
