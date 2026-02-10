package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueprint: ImageVector? = null

val Icons.Ts.Blueprint: ImageVector
    get() = _Blueprint ?: UXIcon(name = "Blueprint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 4f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                lineTo(24f, 4f)
                lineTo(6f, 4f)
                close()
                moveTo(1f, 3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                lineTo(1f, 3f)
                close()
                moveTo(23f, 23f)
                lineTo(3f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                lineTo(6f, 5f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(18f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-13f)
                lineTo(8f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _Blueprint = it}
