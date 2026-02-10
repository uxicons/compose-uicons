package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Ts.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-5f)
                curveTo(4f, 6.59f, 7.59f, 3f, 12f, 3f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(22f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 1f)
                lineTo(22f, 1f)
                lineTo(22f, 0f)
                close()
            }
        }.also { _Overline = it}
