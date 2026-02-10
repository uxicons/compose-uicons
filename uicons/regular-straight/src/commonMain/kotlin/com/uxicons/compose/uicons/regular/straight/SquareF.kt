package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareF: ImageVector? = null

val Icons.Rs.SquareF: ImageVector
    get() = _SquareF ?: UXIcon(name = "SquareF") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
            }
        }.also { _SquareF = it}
