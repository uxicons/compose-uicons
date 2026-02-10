package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _O: ImageVector? = null

val Icons.Ts.O: ImageVector
    get() = _O ?: UXIcon(name = "O") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(12f, 1f)
                curveTo(7.04f, 1f, 3f, 5.04f, 3f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
            }
        }.also { _O = it}
