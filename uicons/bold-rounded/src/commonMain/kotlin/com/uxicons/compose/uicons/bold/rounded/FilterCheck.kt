package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterCheck: ImageVector? = null

val Icons.Br.FilterCheck: ImageVector
    get() = _FilterCheck ?: UXIcon(name = "FilterCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 14.5f)
            verticalLineToRelative(8f)
            curveToRelative(0.02f, 0.81f, -0.64f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.27f, 0f, -0.53f, -0.07f, -0.77f, -0.21f)
            lineToRelative(-5f, -3.0f)
            curveToRelative(-0.45f, -0.27f, -0.73f, -0.76f, -0.73f, -1.29f)
            verticalLineToRelative(-4.98f)
            lineToRelative(-5.99f, -7.26f)
            curveToRelative(-0.65f, -0.8f, -1.01f, -1.8f, -1.01f, -2.82f)
            curveToRelative(0f, -2.45f, 1.99f, -4.44f, 4.44f, -4.44f)
            horizontalLineToRelative(5.06f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5.06f)
            curveToRelative(-0.79f, 0f, -1.44f, 0.65f, -1.44f, 1.44f)
            curveToRelative(0f, 0.33f, 0.12f, 0.66f, 0.33f, 0.92f)
            lineToRelative(6.33f, 7.68f)
            curveToRelative(0.22f, 0.27f, 0.34f, 0.61f, 0.34f, 0.95f)
            verticalLineToRelative(4.67f)
            lineToRelative(2f, 1.2f)
            verticalLineToRelative(-5.35f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 6f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(21.71f, 4.3f)
            curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
            lineToRelative(-2.71f, 2.62f)
            curveToRelative(-0.14f, 0.14f, -0.38f, 0.14f, -0.52f, 0.0f)
            lineToRelative(-1.35f, -1.33f)
            curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.01f)
            curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.01f, 1.41f)
            lineToRelative(1.35f, 1.33f)
            curveToRelative(0.46f, 0.45f, 1.06f, 0.67f, 1.66f, 0.67f)
            reflectiveCurveToRelative(1.2f, -0.23f, 1.65f, -0.67f)
            lineToRelative(2.7f, -2.61f)
            curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
            close()
        }
    }.also { _FilterCheck = it }
