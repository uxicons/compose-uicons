package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Castle: ImageVector? = null

val Icons.Ss.Castle: ImageVector
    get() = _Castle ?: UXIcon(name = "Castle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                lineTo(5f, 10f)
                lineTo(5f, 0f)
                horizontalLineToRelative(2f)
                lineTo(7f, 2f)
                horizontalLineToRelative(2f)
                lineTo(9f, 0f)
                horizontalLineToRelative(2f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(2f)
                lineTo(15f, 2f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(2f)
                lineTo(19f, 10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(22f, 9f)
                verticalLineToRelative(3f)
                lineTo(2f, 12f)
                verticalLineToRelative(-3f)
                lineTo(0f, 9f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 9f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Castle = it}
