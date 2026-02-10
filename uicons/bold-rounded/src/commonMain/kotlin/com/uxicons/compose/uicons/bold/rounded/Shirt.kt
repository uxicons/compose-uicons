package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shirt: ImageVector? = null

val Icons.Br.Shirt: ImageVector
    get() = _Shirt ?: UXIcon(name = "Shirt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 8.45f)
            verticalLineToRelative(10.05f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-10.05f)
            curveToRelative(0f, -1.1f, -0.71f, -2.06f, -1.76f, -2.39f)
            lineToRelative(-0.6f, -0.19f)
            lineToRelative(-1.88f, 2.39f)
            curveToRelative(-0.86f, 1.1f, -2.55f, 1.03f, -3.33f, -0.13f)
            lineToRelative(-1.43f, -2.14f)
            lineToRelative(2.49f, -3f)
            horizontalLineToRelative(-5.0f)
            lineToRelative(2.51f, 3f)
            lineToRelative(-1.43f, 2.14f)
            curveToRelative(-0.78f, 1.17f, -2.46f, 1.23f, -3.33f, 0.13f)
            lineToRelative(-1.88f, -2.39f)
            lineToRelative(-0.6f, 0.19f)
            curveToRelative(-1.06f, 0.33f, -1.76f, 1.28f, -1.76f, 2.39f)
            verticalLineToRelative(10.05f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-10.05f)
            curveToRelative(0f, -2.38f, 1.5f, -4.45f, 3.75f, -5.2f)
            lineToRelative(2.07f, -2.08f)
            curveTo(6.57f, 0.42f, 7.58f, 0f, 8.65f, -0.0f)
            lineToRelative(6.69f, -0.01f)
            curveToRelative(1.06f, 0f, 2.08f, 0.42f, 2.83f, 1.17f)
            lineToRelative(2.08f, 2.08f)
            curveToRelative(2.25f, 0.75f, 3.75f, 2.82f, 3.75f, 5.2f)
            close()
            moveTo(13.78f, 10.97f)
            curveToRelative(-0.16f, -0.85f, -0.78f, -1.97f, -1.78f, -1.97f)
            reflectiveCurveToRelative(-1.62f, 1.12f, -1.78f, 1.97f)
            lineToRelative(-1.42f, 8.38f)
            curveToRelative(-0.19f, 0.98f, 0.12f, 1.98f, 0.83f, 2.68f)
            lineToRelative(1.67f, 1.67f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
            lineToRelative(1.67f, -1.67f)
            curveToRelative(0.7f, -0.7f, 1.01f, -1.71f, 0.83f, -2.68f)
            lineToRelative(-1.42f, -8.38f)
            close()
        }
    }.also { _Shirt = it }
