package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pause: ImageVector? = null

val Icons.Rs.Pause: ImageVector
    get() = _Pause ?: UXIcon(name = "Pause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(7f)
                close()
                moveTo(5f, 22f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(14f, 24f)
                lineTo(14f, 0f)
                horizontalLineToRelative(7f)
                close()
                moveTo(16f, 22f)
                horizontalLineToRelative(3f)
                lineTo(19f, 2f)
                lineTo(16f, 2f)
                close()
            }
        }.also { _Pause = it}
