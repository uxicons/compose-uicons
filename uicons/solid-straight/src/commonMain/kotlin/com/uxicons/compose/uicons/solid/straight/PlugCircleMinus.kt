package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleMinus: ImageVector? = null

val Icons.Ss.PlugCircleMinus: ImageVector
    get() = _PlugCircleMinus ?: UXIcon(name = "PlugCircleMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 19f)
                lineTo(14f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                lineTo(0f, 8f)
                verticalLineToRelative(-2f)
                lineTo(4f, 6f)
                lineTo(4f, 0f)
                horizontalLineToRelative(2f)
                lineTo(6f, 6f)
                horizontalLineToRelative(6f)
                lineTo(12f, 0f)
                horizontalLineToRelative(2f)
                lineTo(14f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.07f)
                curveToRelative(-3.94f, 0.49f, -7f, 3.85f, -7f, 7.93f)
                close()
            }
        }.also { _PlugCircleMinus = it}
