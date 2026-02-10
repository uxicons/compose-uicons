package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareLeft: ImageVector? = null

val Icons.Rs.ArrowAltSquareLeft: ImageVector
    get() = _ArrowAltSquareLeft ?: UXIcon(name = "ArrowAltSquareLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4.13f)
                lineToRelative(-4.63f, -4.24f)
                curveToRelative(-0.49f, -0.44f, -0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(4.63f, -4.24f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _ArrowAltSquareLeft = it}
