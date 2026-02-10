package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAlien: ImageVector? = null

val Icons.Bs.UserAlien: ImageVector
    get() = _UserAlien ?: UXIcon(name = "UserAlien") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.84f, 14.23f)
                curveToRelative(1.2f, -1.91f, 2.16f, -4.09f, 2.16f, -6.23f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 2.13f, 0.95f, 4.32f, 2.16f, 6.23f)
                curveToRelative(-1.82f, 0.58f, -3.16f, 2.26f, -3.16f, 4.27f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.69f)
                curveToRelative(1.42f, 1.7f, 2.69f, 2.85f, 2.81f, 2.95f)
                lineToRelative(1.0f, 0.89f)
                lineToRelative(1.0f, -0.89f)
                curveToRelative(0.12f, -0.11f, 1.39f, -1.25f, 2.81f, -2.95f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.01f, -1.33f, -3.7f, -3.16f, -4.27f)
                close()
                moveTo(12.0f, 16.75f)
                curveToRelative(-1.97f, -2.01f, -5.0f, -5.75f, -5.0f, -8.75f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 3.0f, -3.03f, 6.74f, -5.0f, 8.75f)
                close()
                moveTo(15.39f, 9.39f)
                curveToRelative(-0.74f, 0.74f, -2.38f, 0.59f, -2.38f, 0.59f)
                curveToRelative(0f, 0f, -0.15f, -1.64f, 0.59f, -2.38f)
                curveToRelative(0.74f, -0.74f, 2.38f, -0.59f, 2.38f, -0.59f)
                curveToRelative(0f, 0f, 0.15f, 1.64f, -0.59f, 2.38f)
                close()
                moveTo(10.4f, 7.61f)
                curveToRelative(0.75f, 0.75f, 0.6f, 2.39f, 0.6f, 2.39f)
                curveToRelative(0f, 0f, -1.64f, 0.15f, -2.39f, -0.6f)
                curveToRelative(-0.75f, -0.75f, -0.6f, -2.39f, -0.6f, -2.39f)
                curveToRelative(0f, 0f, 1.64f, -0.15f, 2.39f, 0.6f)
                close()
            }
        }.also { _UserAlien = it}
