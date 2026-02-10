package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePollVertical: ImageVector? = null

val Icons.Bs.SquarePollVertical: ImageVector
    get() = _SquarePollVertical ?: UXIcon(name = "SquarePollVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 8f)
                close()
                moveTo(10.5f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 5f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _SquarePollVertical = it}
