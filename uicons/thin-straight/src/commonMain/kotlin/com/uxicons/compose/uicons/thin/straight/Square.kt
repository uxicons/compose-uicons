package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square: ImageVector? = null

val Icons.Ts.Square: ImageVector
    get() = _Square ?: UXIcon(name = "Square") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
                moveTo(1f, 23f)
                horizontalLineToRelative(22f)
                lineTo(23f, 1f)
                lineTo(1f, 1f)
                verticalLineToRelative(22f)
                close()
            }
        }.also { _Square = it}
