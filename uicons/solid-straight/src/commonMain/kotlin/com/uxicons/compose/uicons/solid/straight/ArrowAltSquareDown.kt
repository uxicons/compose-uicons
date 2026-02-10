package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareDown: ImageVector? = null

val Icons.Ss.ArrowAltSquareDown: ImageVector
    get() = _ArrowAltSquareDown ?: UXIcon(name = "ArrowAltSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12.76f, 17.63f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0f)
                lineToRelative(-4.24f, -4.63f)
                horizontalLineToRelative(4.13f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                lineToRelative(-4.24f, 4.63f)
                close()
            }
        }.also { _ArrowAltSquareDown = it}
