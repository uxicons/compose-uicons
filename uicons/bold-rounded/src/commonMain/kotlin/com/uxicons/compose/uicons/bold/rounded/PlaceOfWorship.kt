package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaceOfWorship: ImageVector? = null

val Icons.Br.PlaceOfWorship: ImageVector
    get() = _PlaceOfWorship ?: UXIcon(name = "PlaceOfWorship") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 12.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 15.6f)
            verticalLineToRelative(3.4f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            lineTo(5f, 24f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            verticalLineToRelative(-3.4f)
            curveToRelative(0f, -1.75f, 0.85f, -3.42f, 2.27f, -4.45f)
            curveToRelative(0f, 0f, 0.0f, -0.0f, 0.01f, -0.0f)
            lineToRelative(4.73f, -3.41f)
            verticalLineToRelative(-3.14f)
            curveToRelative(0f, -1.12f, 0.54f, -2.17f, 1.44f, -2.83f)
            lineToRelative(1.5f, -1.09f)
            curveToRelative(1.23f, -0.9f, 2.89f, -0.9f, 4.12f, 0f)
            lineToRelative(1.5f, 1.09f)
            curveToRelative(0.9f, 0.66f, 1.44f, 1.71f, 1.44f, 2.83f)
            verticalLineToRelative(3.14f)
            lineToRelative(4.73f, 3.41f)
            curveToRelative(1.42f, 1.03f, 2.27f, 2.7f, 2.27f, 4.45f)
            close()
            moveTo(5f, 12.87f)
            lineToRelative(-0.97f, 0.7f)
            curveToRelative(-0.64f, 0.47f, -1.03f, 1.22f, -1.03f, 2.02f)
            verticalLineToRelative(3.4f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            verticalLineToRelative(-8.13f)
            close()
            moveTo(16f, 10.71f)
            lineToRelative(-1.38f, -0.99f)
            curveToRelative(-0.39f, -0.28f, -0.62f, -0.73f, -0.62f, -1.22f)
            verticalLineToRelative(-3.91f)
            curveToRelative(0f, -0.16f, -0.08f, -0.31f, -0.21f, -0.4f)
            lineToRelative(-1.5f, -1.09f)
            curveToRelative(-0.17f, -0.13f, -0.41f, -0.13f, -0.59f, 0f)
            lineToRelative(-1.5f, 1.09f)
            curveToRelative(-0.13f, 0.09f, -0.21f, 0.24f, -0.21f, 0.4f)
            verticalLineToRelative(3.91f)
            curveToRelative(0f, 0.48f, -0.23f, 0.94f, -0.62f, 1.22f)
            lineToRelative(-1.38f, 0.99f)
            verticalLineToRelative(10.29f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-10.29f)
            close()
            moveTo(21f, 15.6f)
            curveToRelative(0f, -0.8f, -0.39f, -1.55f, -1.03f, -2.02f)
            lineToRelative(-0.97f, -0.7f)
            verticalLineToRelative(8.13f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-3.4f)
            close()
        }
    }.also { _PlaceOfWorship = it }
