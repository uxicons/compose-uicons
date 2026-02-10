package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedEmpty: ImageVector? = null

val Icons.Ts.BedEmpty: ImageVector
    get() = _BedEmpty ?: UXIcon(name = "BedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 12f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 18f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(20.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(1f)
                close()
            }
        }.also { _BedEmpty = it}
