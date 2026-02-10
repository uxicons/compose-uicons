package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _O: ImageVector? = null

val Icons.Bs.O: ImageVector
    get() = _O ?: UXIcon(name = "O") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 24f)
                curveToRelative(-5.53f, 0f, -10.02f, -4.53f, -10.02f, -10.09f)
                verticalLineToRelative(-3.82f)
                curveTo(2f, 4.53f, 6.5f, 0f, 12.02f, 0f)
                reflectiveCurveToRelative(9.98f, 4.53f, 9.98f, 10.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0f, 5.56f, -4.48f, 10.09f, -9.98f, 10.09f)
                close()
                moveTo(12.02f, 3f)
                curveToRelative(-3.87f, 0f, -7.02f, 3.18f, -7.02f, 7.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0f, 3.91f, 3.15f, 7.09f, 7.02f, 7.09f)
                curveToRelative(3.91f, 0f, 6.98f, -3.11f, 6.98f, -7.09f)
                verticalLineToRelative(-3.82f)
                curveToRelative(0f, -3.98f, -3.06f, -7.09f, -6.98f, -7.09f)
                close()
            }
        }.also { _O = it}
