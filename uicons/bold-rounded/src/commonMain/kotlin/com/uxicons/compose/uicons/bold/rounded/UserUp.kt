package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserUp: ImageVector? = null

val Icons.Br.UserUp: ImageVector
    get() = _UserUp ?: UXIcon(name = "UserUp") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.56f, 5.0f)
            horizontalLineToRelative(-1.56f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-0.86f, 0f, -1.29f, -1.04f, -0.69f, -1.65f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.99f, -0.38f, 1.37f, 0f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.61f, 0.61f, 0.18f, 1.65f, -0.69f, 1.65f)
            close()
            moveTo(7.46f, 16f)
            curveToRelative(-3.7f, 0f, -6.83f, 2.63f, -7.44f, 6.25f)
            curveToRelative(-0.14f, 0.82f, 0.41f, 1.59f, 1.23f, 1.73f)
            curveToRelative(0.82f, 0.14f, 1.59f, -0.41f, 1.73f, -1.23f)
            curveToRelative(0.37f, -2.17f, 2.25f, -3.75f, 4.48f, -3.75f)
            reflectiveCurveToRelative(4.11f, 1.58f, 4.48f, 3.75f)
            curveToRelative(0.13f, 0.82f, 0.93f, 1.37f, 1.73f, 1.23f)
            curveToRelative(0.82f, -0.14f, 1.37f, -0.91f, 1.23f, -1.73f)
            curveToRelative(-0.61f, -3.62f, -3.74f, -6.25f, -7.44f, -6.25f)
            close()
            moveTo(2f, 8.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
            reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
            close()
            moveTo(5f, 8.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            close()
        }
    }.also { _UserUp = it }
