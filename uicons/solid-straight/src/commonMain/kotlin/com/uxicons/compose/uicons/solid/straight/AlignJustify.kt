package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlignJustify: ImageVector? = null

val Icons.Ss.AlignJustify: ImageVector
    get() = _AlignJustify ?: UXIcon(name = "AlignJustify") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 9f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 19f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 14f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _AlignJustify = it}
