package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerHorizontal: ImageVector? = null

val Icons.Ss.RulerHorizontal: ImageVector
    get() = _RulerHorizontal ?: UXIcon(name = "RulerHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _RulerHorizontal = it}
