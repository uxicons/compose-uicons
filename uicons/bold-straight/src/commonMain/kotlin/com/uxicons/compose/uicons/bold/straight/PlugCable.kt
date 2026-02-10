package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCable: ImageVector? = null

val Icons.Bs.PlugCable: ImageVector
    get() = _PlugCable ?: UXIcon(name = "PlugCable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-2.52f)
                curveToRelative(2.8f, -0.25f, 5f, -2.61f, 5f, -5.48f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                lineTo(0f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.86f, 2.2f, 5.22f, 5f, 5.48f)
                verticalLineToRelative(2.52f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(4f, 9.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PlugCable = it}
