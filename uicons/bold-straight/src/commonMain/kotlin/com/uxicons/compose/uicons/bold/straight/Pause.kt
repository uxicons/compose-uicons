package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pause: ImageVector? = null

val Icons.Bs.Pause: ImageVector
    get() = _Pause ?: UXIcon(name = "Pause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(8f)
                close()
                moveTo(6f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(13f, 24f)
                lineTo(13f, 0f)
                horizontalLineToRelative(8f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(2f)
                lineTo(18f, 3f)
                lineTo(16f, 3f)
                close()
            }
        }.also { _Pause = it}
