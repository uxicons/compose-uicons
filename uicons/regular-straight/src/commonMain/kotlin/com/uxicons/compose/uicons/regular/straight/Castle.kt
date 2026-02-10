package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Castle: ImageVector? = null

val Icons.Rs.Castle: ImageVector
    get() = _Castle ?: UXIcon(name = "Castle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 11f)
                lineTo(2f, 11f)
                verticalLineToRelative(-2f)
                lineTo(0f, 9f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 9f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 4f)
                close()
                moveTo(21f, 22f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 13f)
                lineTo(22f, 13f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Castle = it}
