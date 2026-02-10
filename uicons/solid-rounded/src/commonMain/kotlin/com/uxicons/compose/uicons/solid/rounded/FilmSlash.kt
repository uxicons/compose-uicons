package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilmSlash: ImageVector? = null

val Icons.Sr.FilmSlash: ImageVector
    get() = _FilmSlash ?: UXIcon(name = "FilmSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 10.24f)
                verticalLineToRelative(0.76f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.76f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(10.76f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10.76f)
                lineTo(6f, 10.24f)
                close()
                moveTo(6f, 19.82f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.82f)
                close()
                moveTo(6f, 15.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.71f, 22.29f)
                lineToRelative(-2.55f, -2.55f)
                curveToRelative(0.54f, -0.81f, 0.84f, -1.76f, 0.84f, -2.75f)
                lineTo(22f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 2f)
                curveToRelative(-0.99f, 0f, -1.93f, 0.3f, -2.75f, 0.84f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(16f, 13.0f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(2f)
                close()
                moveTo(19.7f, 18.28f)
                lineToRelative(-1.28f, -1.28f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0f, 0.45f, -0.11f, 0.89f, -0.3f, 1.28f)
                close()
                moveTo(20f, 15.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 11.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 7.0f)
                verticalLineToRelative(-2.82f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _FilmSlash = it}
