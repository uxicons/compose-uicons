package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareA: ImageVector? = null

val Icons.Ss.SquareA: ImageVector
    get() = _SquareA ?: UXIcon(name = "SquareA") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.13f, 7.73f)
                lineToRelative(1.81f, 5.27f)
                horizontalLineToRelative(-5.82f)
                lineToRelative(1.74f, -5.27f)
                curveToRelative(0.32f, -0.69f, 0.55f, -0.73f, 1.14f, -0.73f)
                curveToRelative(0.58f, 0f, 0.82f, 0.04f, 1.13f, 0.73f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(19f, 19f)
                lineToRelative(-4f, -12f)
                curveToRelative(-0.67f, -1.53f, -1.64f, -2f, -3f, -2f)
                curveToRelative(-1.36f, 0f, -2.33f, 0.47f, -3f, 2f)
                lineToRelative(-4f, 12f)
                horizontalLineToRelative(2.15f)
                lineToRelative(1.32f, -4f)
                horizontalLineToRelative(7.17f)
                lineToRelative(1.38f, 4f)
                horizontalLineToRelative(1.99f)
                close()
            }
        }.also { _SquareA = it}
