package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Indent: ImageVector? = null

val Icons.Ss.Indent: ImageVector
    get() = _Indent ?: UXIcon(name = "Indent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
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
                moveTo(8f, 14f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
                verticalLineToRelative(9f)
                lineToRelative(4.17f, -3.76f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.49f)
                close()
            }
        }.also { _Indent = it}
