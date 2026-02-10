package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareR: ImageVector? = null

val Icons.Sr.SquareR: ImageVector
    get() = _SquareR ?: UXIcon(name = "SquareR") {
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
                moveTo(17.39f, 17.55f)
                curveToRelative(0.25f, 0.49f, 0.05f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.14f, 0.07f, -0.3f, 0.1f, -0.45f, 0.1f)
                curveToRelative(-0.37f, 0f, -0.72f, -0.2f, -0.9f, -0.55f)
                lineToRelative(-2.22f, -4.45f)
                horizontalLineToRelative(-5.38f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.8f, -1.06f, 3.36f, -2.59f, 4.08f)
                lineToRelative(1.99f, 3.98f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _SquareR = it}
