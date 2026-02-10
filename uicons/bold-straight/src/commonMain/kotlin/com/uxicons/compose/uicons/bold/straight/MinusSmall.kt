package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MinusSmall: ImageVector? = null

val Icons.Bs.MinusSmall: ImageVector
    get() = _MinusSmall ?: UXIcon(name = "MinusSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 10.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _MinusSmall = it}
