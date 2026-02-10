package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareRight: ImageVector? = null

val Icons.Rs.ArrowAltSquareRight: ImageVector
    get() = _ArrowAltSquareRight ?: UXIcon(name = "ArrowAltSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.63f, 12.9f)
                lineToRelative(-4.63f, 4.24f)
                verticalLineToRelative(-4.13f)
                lineTo(6f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                lineTo(13f, 7f)
                lineToRelative(4.63f, 4.24f)
                curveToRelative(0.49f, 0.44f, 0.49f, 1.22f, 0f, 1.66f)
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
        }.also { _ArrowAltSquareRight = it}
