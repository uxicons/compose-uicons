package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareK: ImageVector? = null

val Icons.Ss.SquareK: ImageVector
    get() = _SquareK ?: UXIcon(name = "SquareK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16.17f, 19f)
                lineToRelative(-4.39f, -7f)
                horizontalLineToRelative(-3.78f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3.89f)
                lineToRelative(3.66f, -5f)
                horizontalLineToRelative(2.45f)
                lineToRelative(-4.45f, 6.1f)
                lineToRelative(4.95f, 7.9f)
                horizontalLineToRelative(-2.33f)
                close()
            }
        }.also { _SquareK = it}
