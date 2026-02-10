package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally2: ImageVector? = null

val Icons.Ss.Tally2: ImageVector
    get() = _Tally2 ?: UXIcon(name = "Tally2") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(24f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                close()
            }
        }.also { _Tally2 = it}
