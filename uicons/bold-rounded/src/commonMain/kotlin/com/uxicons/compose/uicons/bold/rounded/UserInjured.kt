package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Br.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 22f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            curveToRelative(-0.45f, 0f, -0.88f, 0.06f, -1.29f, 0.17f)
            curveToRelative(0.34f, 1.43f, 0.68f, 2.83f, 0.93f, 3.83f)
            horizontalLineToRelative(1.86f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7.5f)
            curveToRelative(-1.25f, 0f, -2f, -1.02f, -2f, -2f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
            close()
            moveTo(6f, 6f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            horizontalLineToRelative(0f)
            curveToRelative(3.5f, 0f, 6f, 2.59f, 6f, 5.79f)
            curveToRelative(0f, 3.05f, -2.19f, 5.77f, -5.21f, 6.16f)
            curveToRelative(-3.66f, 0.47f, -6.79f, -2.38f, -6.79f, -5.95f)
            close()
            moveTo(9f, 6f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            horizontalLineToRelative(-2.79f)
            lineToRelative(2.21f, -1.77f)
            curveToRelative(-0.42f, -0.57f, -1.04f, -0.99f, -1.76f, -1.16f)
            lineToRelative(-3.66f, 2.92f)
            close()
        }
    }.also { _UserInjured = it }
