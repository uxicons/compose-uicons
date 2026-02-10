package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareUp: ImageVector? = null

val Icons.Ts.ArrowAltSquareUp: ImageVector
    get() = _ArrowAltSquareUp ?: UXIcon(name = "ArrowAltSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.13f, 5.54f)
                curveToRelative(-0.31f, -0.34f, -0.74f, -0.54f, -1.2f, -0.54f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.46f, 0f, -0.9f, 0.2f, -1.2f, 0.53f)
                lineToRelative(-5.0f, 5.47f)
                horizontalLineToRelative(5.77f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 11f)
                horizontalLineToRelative(5.64f)
                lineToRelative(-5.0f, -5.46f)
                close()
                moveTo(11.48f, 6.2f)
                curveToRelative(0.12f, -0.13f, 0.28f, -0.2f, 0.46f, -0.2f)
                horizontalLineToRelative(0f)
                curveToRelative(0.18f, 0f, 0.34f, 0.07f, 0.46f, 0.2f)
                lineToRelative(3.47f, 3.8f)
                horizontalLineToRelative(-7.86f)
                lineToRelative(3.47f, -3.79f)
                close()
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
            }
        }.also { _ArrowAltSquareUp = it}
