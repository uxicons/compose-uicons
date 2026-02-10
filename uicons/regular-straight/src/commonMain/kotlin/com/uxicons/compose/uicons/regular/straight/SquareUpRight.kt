package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareUpRight: ImageVector? = null

val Icons.Rs.SquareUpRight: ImageVector
    get() = _SquareUpRight ?: UXIcon(name = "SquareUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.59f)
                lineToRelative(-10.79f, 10.79f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(15.59f, 7f)
                horizontalLineToRelative(-6.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _SquareUpRight = it}
