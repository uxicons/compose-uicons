package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat: ImageVector? = null

val Icons.Rs.ArrowsRepeat: ImageVector
    get() = _ArrowsRepeat ?: UXIcon(name = "ArrowsRepeat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                horizontalLineTo(3f)
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
                horizontalLineTo(8f)
                curveTo(3.59f, 4f, 0f, 7.59f, 0f, 12f)
                horizontalLineTo(2f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
            }
        }.also { _ArrowsRepeat = it}
