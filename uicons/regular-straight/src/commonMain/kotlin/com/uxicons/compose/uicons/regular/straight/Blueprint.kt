package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueprint: ImageVector? = null

val Icons.Rs.Blueprint: ImageVector
    get() = _Blueprint ?: UXIcon(name = "Blueprint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 4f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(20.5f)
                lineTo(24f, 4f)
                lineTo(7f, 4f)
                close()
                moveTo(2f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.54f, 0f, -1.04f, 0.12f, -1.5f, 0.34f)
                lineTo(2f, 3.5f)
                close()
                moveTo(22f, 22f)
                lineTo(3.5f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                lineTo(7f, 6f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(16f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _Blueprint = it}
