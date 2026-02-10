package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Castle: ImageVector? = null

val Icons.Bs.Castle: ImageVector
    get() = _Castle ?: UXIcon(name = "Castle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 10f)
                lineTo(3f, 10f)
                verticalLineToRelative(-2f)
                lineTo(0f, 8f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20.5f, 21f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                lineTo(21f, 13f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _Castle = it}
