package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorPolygon: ImageVector? = null

val Icons.Ss.VectorPolygon: ImageVector
    get() = _VectorPolygon ?: UXIcon(name = "VectorPolygon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10.04f)
                lineToRelative(3.46f, -4.04f)
                horizontalLineToRelative(4.54f)
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
                horizontalLineToRelative(-4.54f)
                lineToRelative(-3.46f, -4.04f)
                verticalLineToRelative(-3.93f)
                close()
                moveTo(6f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(0.63f)
                lineToRelative(-3.75f, 4.37f)
                horizontalLineToRelative(-4.25f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4.25f)
                lineToRelative(3.75f, 4.37f)
                verticalLineToRelative(0.63f)
                lineTo(6f, 20f)
                close()
            }
        }.also { _VectorPolygon = it}
