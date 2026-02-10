package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareSmall: ImageVector? = null

val Icons.Ss.SquareSmall: ImageVector
    get() = _SquareSmall ?: UXIcon(name = "SquareSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _SquareSmall = it}
