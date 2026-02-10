package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Minuss: ImageVector? = null

val Icons.Rs.Minuss: ImageVector
    get() = _Minuss ?: UXIcon(name = "Minuss") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _Minuss = it}
