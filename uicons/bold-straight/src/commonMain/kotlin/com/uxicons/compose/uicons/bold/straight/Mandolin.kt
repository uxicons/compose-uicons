package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Bs.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 6f)
                lineToRelative(2.0f, -2.82f)
                lineTo(20.82f, -0.0f)
                lineToRelative(-2.82f, 2.0f)
                lineToRelative(-0.23f, 2.11f)
                lineToRelative(-1.89f, 1.89f)
                horizontalLineToRelative(-6.88f)
                curveTo(4.04f, 6f, 0f, 10.04f, 0f, 15f)
                curveToRelative(0f, 2.4f, 0.94f, 4.66f, 2.64f, 6.37f)
                curveToRelative(1.7f, 1.7f, 3.96f, 2.63f, 6.36f, 2.63f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-6.88f)
                lineToRelative(1.89f, -1.89f)
                lineToRelative(2.11f, -0.23f)
                close()
                moveTo(15f, 15f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-1.6f, 0f, -3.11f, -0.62f, -4.24f, -1.76f)
                curveToRelative(-1.13f, -1.13f, -1.76f, -2.64f, -1.76f, -4.24f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-3.1f, 3.1f)
                curveToRelative(-0.25f, -0.07f, -0.51f, -0.1f, -0.78f, -0.1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.27f, -0.04f, -0.53f, -0.1f, -0.78f)
                lineToRelative(3.1f, -3.1f)
                verticalLineToRelative(3.88f)
                close()
            }
        }.also { _Mandolin = it}
