package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneMegaphone: ImageVector? = null

val Icons.Br.PhoneMegaphone: ImageVector
    get() = _PhoneMegaphone ?: UXIcon(name = "PhoneMegaphone") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.61f, 0f, 1.2f, 0.22f, 1.65f, 0.62f)
            curveToRelative(0.62f, 0.55f, 1.57f, 0.49f, 2.12f, -0.13f)
            curveToRelative(0.55f, -0.62f, 0.49f, -1.57f, -0.13f, -2.12f)
            curveToRelative(-1.0f, -0.89f, -2.3f, -1.38f, -3.64f, -1.38f)
            horizontalLineToRelative(-5.0f)
            curveToRelative(-3.03f, -0.0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(9f, 20f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            close()
            moveTo(23f, 10.41f)
            verticalLineToRelative(2.51f)
            curveToRelative(0f, 0.6f, -0.48f, 1.08f, -1.08f, 1.08f)
            curveToRelative(-0.48f, 0f, -0.89f, -0.32f, -1.03f, -0.77f)
            curveToRelative(-0.22f, -0.69f, -0.78f, -1.23f, -1.89f, -1.23f)
            horizontalLineToRelative(-1.0f)
            lineToRelative(0.88f, 2.13f)
            curveToRelative(0.39f, 0.88f, -0.26f, 1.86f, -1.22f, 1.86f)
            curveToRelative(-0.53f, 0f, -1.01f, -0.31f, -1.22f, -0.8f)
            lineToRelative(-1.83f, -4.39f)
            curveToRelative(-0.39f, -0.5f, -0.62f, -1.13f, -0.62f, -1.81f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 1.67f, -0.54f, 1.89f, -1.23f)
            curveToRelative(0.15f, -0.46f, 0.55f, -0.77f, 1.03f, -0.77f)
            curveToRelative(0.6f, 0f, 1.08f, 0.48f, 1.08f, 1.08f)
            verticalLineToRelative(2.51f)
            curveToRelative(0.58f, 0.21f, 1f, 0.76f, 1f, 1.41f)
            reflectiveCurveToRelative(-0.42f, 1.2f, -1f, 1.41f)
            close()
        }
    }.also { _PhoneMegaphone = it }
