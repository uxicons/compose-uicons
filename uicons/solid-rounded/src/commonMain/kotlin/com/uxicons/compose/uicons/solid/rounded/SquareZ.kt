package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareZ: ImageVector? = null

val Icons.Sr.SquareZ: ImageVector
    get() = _SquareZ ?: UXIcon(name = "SquareZ") {
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
                moveTo(18f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8.87f)
                curveToRelative(-0.87f, 0f, -1.65f, -0.52f, -1.97f, -1.32f)
                curveToRelative(-0.32f, -0.79f, -0.14f, -1.69f, 0.47f, -2.29f)
                lineToRelative(9.38f, -8.25f)
                curveToRelative(-0.02f, 0.02f, 0.01f, -0.01f, -0.02f, -0.07f)
                curveToRelative(-0.03f, -0.07f, -0.1f, -0.07f, -0.12f, -0.07f)
                lineTo(7.02f, 7.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.85f)
                curveToRelative(0.87f, 0f, 1.65f, 0.52f, 1.97f, 1.32f)
                curveToRelative(0.32f, 0.79f, 0.14f, 1.69f, -0.47f, 2.29f)
                lineToRelative(-9.37f, 8.24f)
                curveToRelative(0.01f, -0.01f, -0.01f, 0.02f, 0.01f, 0.07f)
                curveToRelative(0.03f, 0.07f, 0.1f, 0.07f, 0.12f, 0.07f)
                horizontalLineToRelative(8.87f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SquareZ = it}
