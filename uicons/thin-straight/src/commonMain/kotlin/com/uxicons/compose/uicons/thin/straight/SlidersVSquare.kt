package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlidersVSquare: ImageVector? = null

val Icons.Ts.SlidersVSquare: ImageVector
    get() = _SlidersVSquare ?: UXIcon(name = "SlidersVSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(2f, 0f)
                curveTo(0.75f, 0f, 0f, 0.94f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.41f, -1.61f, -2.5f, -3f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -1.5f, 0.75f, -1.5f, 1f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.87f, 0f, 2f, 0.73f, 2f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                lineTo(16f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _SlidersVSquare = it}
