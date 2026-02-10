package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilmCanister: ImageVector? = null

val Icons.Bs.FilmCanister: ImageVector
    get() = _FilmCanister ?: UXIcon(name = "FilmCanister") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                horizontalLineToRelative(-10f)
                lineTo(14f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(18f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                lineTo(24f, 2f)
                close()
                moveTo(21f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-6f)
                lineTo(5f, 3f)
                close()
                moveTo(19f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _FilmCanister = it}
