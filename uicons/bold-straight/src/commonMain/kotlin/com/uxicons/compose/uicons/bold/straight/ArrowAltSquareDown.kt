package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareDown: ImageVector? = null

val Icons.Bs.ArrowAltSquareDown: ImageVector
    get() = _ArrowAltSquareDown ?: UXIcon(name = "ArrowAltSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 13f)
                horizontalLineToRelative(3.5f)
                lineToRelative(-4.24f, 4.63f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0f)
                lineToRelative(-4.24f, -4.63f)
                horizontalLineToRelative(3.63f)
                lineTo(10.5f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
                moveTo(24f, 3.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _ArrowAltSquareDown = it}
