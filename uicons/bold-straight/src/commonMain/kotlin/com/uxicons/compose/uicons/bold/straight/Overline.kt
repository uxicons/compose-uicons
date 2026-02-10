package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Bs.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 3f)
                lineTo(22f, 3f)
                lineTo(22f, 0f)
                close()
            }
        }.also { _Overline = it}
