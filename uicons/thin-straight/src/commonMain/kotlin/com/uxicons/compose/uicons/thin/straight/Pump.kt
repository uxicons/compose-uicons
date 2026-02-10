package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pump: ImageVector? = null

val Icons.Ts.Pump: ImageVector
    get() = _Pump ?: UXIcon(name = "Pump") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 7f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.41f, -2.5f, 1.06f)
                lineTo(12f, 1f)
                horizontalLineToRelative(2f)
                lineTo(14f, 0f)
                lineTo(4f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                lineTo(1f, 13f)
                verticalLineToRelative(-2f)
                lineTo(0f, 11f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(9.5f)
                lineTo(24f, 7f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(1f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                lineTo(1f, 18f)
                close()
                moveTo(7f, 18f)
                lineTo(7f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(14.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }.also { _Pump = it}
