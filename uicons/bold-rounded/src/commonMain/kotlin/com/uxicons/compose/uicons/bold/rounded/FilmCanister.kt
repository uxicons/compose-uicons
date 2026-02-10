package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilmCanister: ImageVector? = null

val Icons.Br.FilmCanister: ImageVector
    get() = _FilmCanister ?: UXIcon(name = "FilmCanister") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 2f)
            horizontalLineToRelative(-3.59f)
            curveToRelative(0.06f, -0.16f, 0.09f, -0.32f, 0.09f, -0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(1.5f, 0f)
            curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(18f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.18f, -0.04f, -0.34f, -0.09f, -0.5f)
            horizontalLineToRelative(3.59f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(14f, 7f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(14f, 19f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(14f, 14f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(21f, 6.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(5f, 3f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(18f)
            horizontalLineToRelative(-6f)
            lineTo(5f, 3f)
            close()
            moveTo(19.5f, 19f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _FilmCanister = it }
