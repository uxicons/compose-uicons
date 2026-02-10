package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stop: ImageVector? = null

val Icons.Rs.Stop: ImageVector
    get() = _Stop ?: UXIcon(name = "Stop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(24f)
                close()
                moveTo(2f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _Stop = it}
