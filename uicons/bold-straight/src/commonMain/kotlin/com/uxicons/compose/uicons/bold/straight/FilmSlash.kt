package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilmSlash: ImageVector? = null

val Icons.Bs.FilmSlash: ImageVector
    get() = _FilmSlash ?: UXIcon(name = "FilmSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16.5f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -12.5f)
                lineToRelative(-6f, 0f)
                lineToRelative(0f, 3.5f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -6.5f)
                lineToRelative(12f, 0f)
                lineToRelative(0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 4f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 10f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.0f, 2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(21.87f, 21.87f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.05f, 23f)
                lineToRelative(-3f, -3f)
                lineToRelative(-6.05f, 0f)
                lineToRelative(0f, -6.05f)
                lineToRelative(-8f, -8f)
                lineToRelative(0f, 17.05f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -10f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 10f)
                lineToRelative(12.05f, 0f)
                close()
            }
        }.also { _FilmSlash = it}
