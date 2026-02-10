package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat1: ImageVector? = null

val Icons.Rs.ArrowsRepeat1: ImageVector
    get() = _ArrowsRepeat1 ?: UXIcon(name = "ArrowsRepeat1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                lineTo(3f, 20f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.5f, 2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(13f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineTo(19.91f, 0.09f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.5f, 2.5f)
                lineTo(8f, 4f)
                curveTo(3.59f, 4f, 0f, 7.59f, 0f, 12f)
                lineTo(2f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
                moveTo(13f, 16f)
                verticalLineToRelative(-7f)
                lineToRelative(-0.08f, -1f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-3.21f, 3.3f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.28f, -1.32f)
                verticalLineToRelative(4.62f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _ArrowsRepeat1 = it}
