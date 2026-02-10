package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Bs.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 17.34f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7.78f)
                curveToRelative(-1.48f, 0f, -2.8f, 0.94f, -3.3f, 2.33f)
                lineTo(0.09f, 23.0f)
                lineToRelative(2.83f, 1.0f)
                lineToRelative(4.26f, -12.0f)
                horizontalLineToRelative(11.83f)
                verticalLineToRelative(5.34f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(8.24f, 9f)
                lineToRelative(2.01f, -5.67f)
                curveToRelative(0.07f, -0.2f, 0.26f, -0.33f, 0.47f, -0.33f)
                horizontalLineToRelative(7.78f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-10.76f)
                close()
            }
        }.also { _Walker = it}
