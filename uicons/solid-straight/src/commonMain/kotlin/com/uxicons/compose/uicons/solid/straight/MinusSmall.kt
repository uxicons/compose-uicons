package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusSmall: ImageVector? = null

val Icons.Ss.MinusSmall: ImageVector
    get() = _MinusSmall ?: UXIcon(name = "MinusSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _MinusSmall = it}
