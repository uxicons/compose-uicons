package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedEmpty: ImageVector? = null

val Icons.Ss.BedEmpty: ImageVector
    get() = _BedEmpty ?: UXIcon(name = "BedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _BedEmpty = it}
