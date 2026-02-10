package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pump: ImageVector? = null

val Icons.Ss.Pump: ImageVector
    get() = _Pump ?: UXIcon(name = "Pump") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(22f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(22f, 11f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(17f)
                lineTo(2f, 19f)
                verticalLineToRelative(2f)
                lineTo(0f, 21f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(5f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(3f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Pump = it}
