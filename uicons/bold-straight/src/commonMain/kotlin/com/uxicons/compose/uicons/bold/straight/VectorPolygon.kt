package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorPolygon: ImageVector? = null

val Icons.Bs.VectorPolygon: ImageVector
    get() = _VectorPolygon ?: UXIcon(name = "VectorPolygon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10.87f)
                lineToRelative(4.29f, -4.87f)
                horizontalLineToRelative(3.71f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                lineTo(6f, 2f)
                lineTo(6f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3.71f)
                lineToRelative(-4.29f, -4.87f)
                verticalLineToRelative(-2.27f)
                close()
                moveTo(5f, 18f)
                lineTo(5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11.18f)
                lineToRelative(-3.53f, 4f)
                horizontalLineToRelative(-3.65f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3.65f)
                lineToRelative(3.53f, 4f)
                lineTo(6f, 19f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _VectorPolygon = it}
