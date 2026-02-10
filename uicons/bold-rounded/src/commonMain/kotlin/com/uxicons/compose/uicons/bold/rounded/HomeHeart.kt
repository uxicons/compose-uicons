package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeHeart: ImageVector? = null

val Icons.Br.HomeHeart: ImageVector
    get() = _HomeHeart ?: UXIcon(name = "HomeHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.48f, 12.47f)
            curveToRelative(0f, 1.88f, -2.37f, 4.16f, -3.67f, 5.22f)
            curveToRelative(-0.49f, 0.4f, -1.18f, 0.4f, -1.67f, 0f)
            curveToRelative(-1.3f, -1.06f, -3.67f, -3.35f, -3.67f, -5.22f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            close()
            moveTo(24f, 9.89f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, 0.91f, -3.54f, 2.42f, -4.56f)
            lineTo(8.92f, 0.94f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(6.5f, 4.39f)
            curveToRelative(1.52f, 1.02f, 2.42f, 2.73f, 2.42f, 4.56f)
            close()
            moveTo(21f, 9.89f)
            curveToRelative(0f, -0.83f, -0.41f, -1.61f, -1.1f, -2.07f)
            lineToRelative(-6.5f, -4.39f)
            curveToRelative(-0.42f, -0.29f, -0.91f, -0.43f, -1.4f, -0.43f)
            reflectiveCurveToRelative(-0.97f, 0.14f, -1.4f, 0.43f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-8.61f)
            close()
        }
    }.also { _HomeHeart = it }
