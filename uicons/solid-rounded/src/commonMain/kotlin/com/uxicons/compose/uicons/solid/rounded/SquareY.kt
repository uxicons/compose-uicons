package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareY: ImageVector? = null

val Icons.Sr.SquareY: ImageVector
    get() = _SquareY ?: UXIcon(name = "SquareY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17.79f, 6.61f)
                lineToRelative(-4.79f, 6.23f)
                verticalLineToRelative(5.16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.16f)
                lineToRelative(-4.79f, -6.23f)
                curveToRelative(-0.34f, -0.44f, -0.26f, -1.06f, 0.18f, -1.4f)
                curveToRelative(0.44f, -0.34f, 1.07f, -0.26f, 1.4f, 0.18f)
                lineToRelative(4.21f, 5.47f)
                lineToRelative(4.21f, -5.47f)
                curveToRelative(0.34f, -0.44f, 0.96f, -0.52f, 1.4f, -0.18f)
                curveToRelative(0.44f, 0.34f, 0.52f, 0.96f, 0.18f, 1.4f)
                close()
            }
        }.also { _SquareY = it}
