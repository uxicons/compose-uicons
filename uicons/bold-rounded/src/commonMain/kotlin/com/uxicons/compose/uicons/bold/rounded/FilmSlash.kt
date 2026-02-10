package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilmSlash: ImageVector? = null

val Icons.Br.FilmSlash: ImageVector
    get() = _FilmSlash ?: UXIcon(name = "FilmSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 20f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            lineTo(14.5f, 23f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(4f, 17.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2.95f)
            curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
            close()
            moveTo(23.56f, 21.43f)
            lineToRelative(-1.26f, -1.26f)
            curveToRelative(0.45f, -0.81f, 0.71f, -1.73f, 0.71f, -2.67f)
            lineTo(23.0f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(6.5f, 1f)
            curveToRelative(-0.94f, 0f, -1.86f, 0.25f, -2.67f, 0.71f)
            lineTo(2.56f, 0.43f)
            curveTo(1.97f, -0.15f, 1.02f, -0.15f, 0.43f, 0.43f)
            curveTo(-0.15f, 1.02f, -0.15f, 1.97f, 0.43f, 2.56f)
            lineTo(21.43f, 23.55f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(9f, 4f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2.88f)
            lineToRelative(-3.12f, -3.12f)
            verticalLineToRelative(-2.88f)
            close()
            moveTo(20f, 14f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            close()
            moveTo(20f, 6.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2.95f)
            curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
            close()
        }
    }.also { _FilmSlash = it }
