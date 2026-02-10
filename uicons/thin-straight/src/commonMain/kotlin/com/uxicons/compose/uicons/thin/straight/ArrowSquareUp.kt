package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareUp: ImageVector? = null

val Icons.Ts.ArrowSquareUp: ImageVector
    get() = _ArrowSquareUp ?: UXIcon(name = "ArrowSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(13.15f, 6.48f)
                lineToRelative(4.81f, 4.81f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-4.76f, -4.76f)
                verticalLineToRelative(10.76f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 7.24f)
                lineToRelative(-4.76f, 4.76f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.81f, -4.81f)
                curveToRelative(0.62f, -0.62f, 1.69f, -0.62f, 2.31f, 0f)
                close()
            }
        }.also { _ArrowSquareUp = it}
