package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueprint: ImageVector? = null

val Icons.Ss.Blueprint: ImageVector
    get() = _Blueprint ?: UXIcon(name = "Blueprint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 17.76f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.93f, 0f, -1.78f, 0.28f, -2.5f, 0.76f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(20f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                lineTo(7f, 4f)
                horizontalLineToRelative(17f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11f)
                close()
            }
        }.also { _Blueprint = it}
