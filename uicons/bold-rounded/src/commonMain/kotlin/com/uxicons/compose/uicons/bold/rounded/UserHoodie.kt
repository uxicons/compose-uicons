package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHoodie: ImageVector? = null

val Icons.Br.UserHoodie: ImageVector
    get() = _UserHoodie ?: UXIcon(name = "UserHoodie") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.12f, 13.61f)
            curveToRelative(1.04f, -2.13f, 1.88f, -4.5f, 1.88f, -6.61f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveTo(5f, 3.14f, 5f, 7f)
            curveToRelative(0f, 2.11f, 0.84f, 4.48f, 1.88f, 6.61f)
            curveToRelative(-2.41f, 1.67f, -3.88f, 4.41f, -3.88f, 7.39f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.88f, 0.88f, -3.61f, 2.33f, -4.74f)
            curveToRelative(0.89f, 1.48f, 1.73f, 2.65f, 2.17f, 3.24f)
            verticalLineToRelative(3.0f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.0f)
            curveToRelative(0.44f, -0.59f, 1.28f, -1.76f, 2.17f, -3.24f)
            curveToRelative(1.45f, 1.12f, 2.33f, 2.86f, 2.33f, 4.74f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -2.98f, -1.47f, -5.72f, -3.88f, -7.39f)
            close()
            moveTo(12f, 16.44f)
            curveToRelative(-1.69f, -2.5f, -4f, -6.56f, -4f, -9.44f)
            curveToRelative(0f, -1.38f, 2.34f, -2f, 4f, -2f)
            reflectiveCurveToRelative(4f, 0.62f, 4f, 2f)
            curveToRelative(0f, 2.88f, -2.31f, 6.94f, -4f, 9.44f)
            close()
        }
    }.also { _UserHoodie = it }
