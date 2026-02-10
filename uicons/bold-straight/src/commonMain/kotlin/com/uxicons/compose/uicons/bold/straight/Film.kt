package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Film: ImageVector? = null

val Icons.Bs.Film: ImageVector
    get() = _Film ?: UXIcon(name = "Film") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-24f)
                close()
                moveTo(21f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 13.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 3f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(5f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(3f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Film = it}
