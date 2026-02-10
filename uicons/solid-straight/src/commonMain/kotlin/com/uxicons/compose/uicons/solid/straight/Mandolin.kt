package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Ss.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.57f, 13.85f)
                lineToRelative(5.43f, -5.43f)
                verticalLineToRelative(7.09f)
                curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
                curveToRelative(-2.27f, 0f, -4.4f, -0.88f, -6.01f, -2.49f)
                curveToRelative(-1.6f, -1.6f, -2.49f, -3.74f, -2.49f, -6.01f)
                curveTo(0f, 10.81f, 3.81f, 7f, 8.5f, 7f)
                horizontalLineToRelative(7.09f)
                lineToRelative(-5.43f, 5.43f)
                curveToRelative(-0.49f, -0.27f, -1.05f, -0.43f, -1.65f, -0.43f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -0.6f, -0.17f, -1.16f, -0.43f, -1.65f)
                close()
                moveTo(8.5f, 14f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 3.18f)
                lineTo(20.82f, -0.0f)
                lineToRelative(-2.82f, 2.0f)
                lineToRelative(-0.32f, 2.91f)
                lineToRelative(-2.09f, 2.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.09f, -2.09f)
                lineToRelative(2.91f, -0.32f)
                lineToRelative(2.0f, -2.82f)
                close()
            }
        }.also { _Mandolin = it}
