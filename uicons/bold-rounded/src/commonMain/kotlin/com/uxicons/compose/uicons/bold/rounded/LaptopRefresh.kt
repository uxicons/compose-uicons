package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopRefresh: ImageVector? = null

val Icons.Br.LaptopRefresh: ImageVector
    get() = _LaptopRefresh ?: UXIcon(name = "LaptopRefresh") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 21f)
            verticalLineToRelative(1.15f)
            curveToRelative(0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f)
            horizontalLineToRelative(-20.31f)
            curveToRelative(-1.02f, 0f, -1.85f, -0.83f, -1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(3.31f)
            lineToRelative(0.92f, 1f)
            horizontalLineToRelative(5.54f)
            lineToRelative(0.92f, -1f)
            horizontalLineToRelative(3.31f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(18f, 14f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            curveToRelative(0f, -0.22f, -0.01f, -0.44f, -0.04f, -0.66f)
            curveToRelative(-0.09f, -0.82f, -0.83f, -1.42f, -1.65f, -1.33f)
            curveToRelative(-0.82f, 0.09f, -1.42f, 0.83f, -1.33f, 1.65f)
            curveToRelative(0.01f, 0.11f, 0.02f, 0.23f, 0.02f, 0.34f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
            verticalLineToRelative(1.27f)
            curveToRelative(0f, 0.45f, 0.53f, 0.69f, 0.87f, 0.39f)
            lineToRelative(2.71f, -2.39f)
            curveToRelative(0.56f, -0.48f, 0.56f, -1.32f, 0f, -1.8f)
            lineToRelative(-2.71f, -2.39f)
            curveToRelative(-0.34f, -0.3f, -0.87f, -0.06f, -0.87f, 0.39f)
            verticalLineToRelative(1.43f)
            curveToRelative(-2.83f, 0.48f, -5f, 2.94f, -5f, 5.91f)
            curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
            close()
        }
    }.also { _LaptopRefresh = it }
