package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCircleXmark: ImageVector? = null

val Icons.Br.PersonCircleXmark: ImageVector
    get() = _PersonCircleXmark ?: UXIcon(name = "PersonCircleXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(3f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(11f, 13.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.56f, 0.8f, 2.93f, 2f, 3.74f)
            verticalLineToRelative(5.26f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.26f)
            curveToRelative(1.21f, -0.81f, 2f, -2.18f, 2f, -3.74f)
            close()
            moveTo(3f, 10.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            close()
            moveTo(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(20.71f, 19.29f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
            reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
            lineToRelative(-1.29f, -1.29f)
            lineToRelative(-1.29f, 1.29f)
            curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
            reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            lineToRelative(1.29f, -1.29f)
            lineToRelative(-1.29f, -1.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
            lineToRelative(1.29f, 1.29f)
            lineToRelative(1.29f, -1.29f)
            curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
            reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(-1.29f, 1.29f)
            lineToRelative(1.29f, 1.29f)
            close()
        }
    }.also { _PersonCircleXmark = it }
