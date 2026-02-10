package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCircleCheck: ImageVector? = null

val Icons.Br.PersonCircleCheck: ImageVector
    get() = _PersonCircleCheck ?: UXIcon(name = "PersonCircleCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(3f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(9f, 17.24f)
            verticalLineToRelative(5.26f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.26f)
            curveToRelative(-1.21f, -0.81f, -2f, -2.18f, -2f, -3.74f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(2f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.56f, -0.8f, 2.93f, -2f, 3.74f)
            close()
            moveTo(3f, 13.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            close()
            moveTo(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(21.68f, 17.71f)
            lineToRelative(-2.7f, 2.61f)
            curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
            reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
            lineToRelative(-1.35f, -1.33f)
            curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
            curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
            lineToRelative(1.35f, 1.33f)
            curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
            lineToRelative(2.71f, -2.62f)
            curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
            curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
            close()
        }
    }.also { _PersonCircleCheck = it }
