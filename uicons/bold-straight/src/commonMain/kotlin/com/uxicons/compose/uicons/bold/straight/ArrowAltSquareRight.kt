package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareRight: ImageVector? = null

val Icons.Bs.ArrowAltSquareRight: ImageVector
    get() = _ArrowAltSquareRight ?: UXIcon(name = "ArrowAltSquareRight") {
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
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(17.59f, 12.9f)
                lineToRelative(-4.63f, 4.24f)
                verticalLineToRelative(-3.63f)
                lineTo(5.96f, 13.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.63f, 4.24f)
                curveToRelative(0.49f, 0.44f, 0.49f, 1.22f, 0f, 1.66f)
                close()
            }
        }.also { _ArrowAltSquareRight = it}
