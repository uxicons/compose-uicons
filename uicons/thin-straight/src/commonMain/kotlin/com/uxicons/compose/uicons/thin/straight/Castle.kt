package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Castle: ImageVector? = null

val Icons.Ts.Castle: ImageVector
    get() = _Castle ?: UXIcon(name = "Castle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(14f, 2f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(9f, 2f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 10f)
                lineTo(1f, 10f)
                verticalLineToRelative(-2f)
                lineTo(0f, 8f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(6f, 3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                lineTo(6f, 10f)
                lineTo(6f, 3f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.5f, 23f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 11f)
                lineTo(23f, 11f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Castle = it}
