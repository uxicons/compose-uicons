package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pump: ImageVector? = null

val Icons.Rs.Pump: ImageVector
    get() = _Pump ?: UXIcon(name = "Pump") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.21f, -2f, 0.56f)
                lineTo(13f, 2f)
                horizontalLineToRelative(2f)
                lineTo(15f, 0f)
                lineTo(4f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                lineTo(2f, 12f)
                verticalLineToRelative(-2f)
                lineTo(0f, 10f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(2f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(2f, 17f)
                close()
                moveTo(8f, 17f)
                lineTo(8f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Pump = it}
