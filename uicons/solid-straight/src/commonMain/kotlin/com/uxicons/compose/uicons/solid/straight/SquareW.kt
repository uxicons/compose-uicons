package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareW: ImageVector? = null

val Icons.Ss.SquareW: ImageVector
    get() = _SquareW ?: UXIcon(name = "SquareW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16.85f, 17.83f)
                curveToRelative(-0.12f, 0.6f, -0.58f, 1.06f, -1.19f, 1.15f)
                curveToRelative(-0.61f, 0.09f, -1.2f, -0.21f, -1.47f, -0.69f)
                lineToRelative(-2.19f, -4.99f)
                lineToRelative(-2.14f, 4.88f)
                curveToRelative(-0.32f, 0.6f, -0.92f, 0.91f, -1.53f, 0.81f)
                curveToRelative(-0.61f, -0.1f, -1.08f, -0.55f, -1.19f, -1.15f)
                lineToRelative(-2.22f, -12.84f)
                horizontalLineToRelative(2.03f)
                lineToRelative(1.84f, 10.63f)
                lineToRelative(3.2f, -7.32f)
                lineToRelative(3.21f, 7.31f)
                lineToRelative(1.84f, -10.62f)
                horizontalLineToRelative(2.03f)
                lineToRelative(-2.22f, 12.83f)
                close()
            }
        }.also { _SquareW = it}
