package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Museum: ImageVector? = null

val Icons.Br.Museum: ImageVector
    get() = _Museum ?: UXIcon(name = "Museum") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21.0f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-9.07f)
            curveToRelative(1.71f, -0.34f, 3f, -1.84f, 3f, -3.65f)
            curveToRelative(0f, -1.36f, -0.74f, -2.61f, -1.94f, -3.26f)
            lineToRelative(-8.43f, -4.6f)
            curveToRelative(-1.02f, -0.56f, -2.24f, -0.56f, -3.27f, 0f)
            lineToRelative(-8.43f, 4.6f)
            curveToRelative(-1.2f, 0.65f, -1.94f, 1.9f, -1.94f, 3.27f)
            curveToRelative(0f, 1.8f, 1.29f, 3.31f, 3f, 3.65f)
            verticalLineToRelative(9.07f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13f, 12f)
            verticalLineToRelative(9.0f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-9.0f)
            close()
            moveTo(16f, 12f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(9.0f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(3.38f, 7.65f)
            reflectiveCurveToRelative(0f, 0f, 0f, 0f)
            lineToRelative(8.43f, -4.6f)
            curveToRelative(0.12f, -0.07f, 0.27f, -0.07f, 0.39f, 0f)
            lineToRelative(8.43f, 4.6f)
            curveToRelative(0.23f, 0.13f, 0.38f, 0.37f, 0.38f, 0.63f)
            curveToRelative(0f, 0.4f, -0.32f, 0.72f, -0.72f, 0.72f)
            horizontalLineToRelative(-16.56f)
            curveToRelative(-0.4f, 0f, -0.72f, -0.32f, -0.72f, -0.72f)
            curveToRelative(0f, -0.26f, 0.14f, -0.51f, 0.38f, -0.63f)
            close()
            moveTo(6f, 12f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(9.0f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(10.5f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _Museum = it }
