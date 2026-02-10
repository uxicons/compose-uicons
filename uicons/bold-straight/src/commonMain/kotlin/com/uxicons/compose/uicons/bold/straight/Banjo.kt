package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banjo: ImageVector? = null

val Icons.Bs.Banjo: ImageVector
    get() = _Banjo ?: UXIcon(name = "Banjo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.56f, 6.99f)
                lineToRelative(3.44f, -3.42f)
                lineToRelative(-3.56f, -3.56f)
                lineToRelative(-3.44f, 3.42f)
                verticalLineToRelative(1.45f)
                lineToRelative(-4.51f, 4.51f)
                curveToRelative(-1.28f, -0.87f, -2.83f, -1.39f, -4.49f, -1.39f)
                curveTo(3.59f, 8f, 0f, 11.59f, 0f, 16f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -1.67f, -0.51f, -3.21f, -1.39f, -4.49f)
                lineToRelative(4.52f, -4.52f)
                horizontalLineToRelative(1.42f)
                close()
                moveTo(8f, 21f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(6.06f, 13.94f)
                lineToRelative(4f, 4f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-4f, -4f)
                lineToRelative(2.12f, -2.12f)
                close()
            }
        }.also { _Banjo = it}
