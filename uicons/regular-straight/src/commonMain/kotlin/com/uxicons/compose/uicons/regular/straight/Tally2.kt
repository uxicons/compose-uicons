package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally2: ImageVector? = null

val Icons.Rs.Tally2: ImageVector
    get() = _Tally2 ?: UXIcon(name = "Tally2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(24f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                close()
                moveTo(7f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Tally2 = it}
