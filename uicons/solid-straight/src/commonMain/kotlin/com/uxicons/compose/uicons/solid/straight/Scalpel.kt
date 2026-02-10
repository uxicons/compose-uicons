package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scalpel: ImageVector? = null

val Icons.Ss.Scalpel: ImageVector
    get() = _Scalpel ?: UXIcon(name = "Scalpel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.19f, 5.72f)
                lineToRelative(-9.03f, 9.03f)
                lineToRelative(-4.04f, -3.77f)
                lineTo(19.28f, 1.81f)
                curveToRelative(1.08f, -1.08f, 2.83f, -1.08f, 3.91f, 0f)
                reflectiveCurveToRelative(1.08f, 2.83f, 0f, 3.91f)
                close()
                moveTo(0f, 21.09f)
                verticalLineToRelative(1.91f)
                reflectiveCurveToRelative(2.81f, 0.01f, 3.04f, 0f)
                curveToRelative(3.6f, -0.14f, 7.0f, -1.63f, 9.56f, -4.19f)
                lineToRelative(0.19f, -0.19f)
                lineToRelative(0.22f, -2.11f)
                lineToRelative(-4.37f, -4.06f)
                lineTo(0f, 21.09f)
                close()
            }
        }.also { _Scalpel = it}
