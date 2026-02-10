package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlidersHSquare: ImageVector? = null

val Icons.Bs.SlidersHSquare: ImageVector
    get() = _SlidersHSquare ?: UXIcon(name = "SlidersHSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(10f, 7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                lineTo(5f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SlidersHSquare = it}
