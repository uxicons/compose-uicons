package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResizeScreen: ImageVector? = null

val Icons.Br.ResizeScreen: ImageVector
    get() = _ResizeScreen ?: UXIcon(name = "ResizeScreen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -1.34f, 0.49f, -2.63f, 1.38f, -3.64f)
            curveToRelative(0.55f, -0.62f, 1.5f, -0.68f, 2.12f, -0.13f)
            reflectiveCurveToRelative(0.68f, 1.5f, 0.13f, 2.12f)
            curveToRelative(-0.4f, 0.46f, -0.62f, 1.04f, -0.62f, 1.65f)
            verticalLineToRelative(8.0f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.61f, -0.22f, -1.2f, -0.62f, -1.65f)
            curveToRelative(-0.55f, -0.62f, -0.49f, -1.57f, 0.13f, -2.12f)
            curveToRelative(0.62f, -0.55f, 1.57f, -0.49f, 2.12f, 0.13f)
            curveToRelative(0.89f, 1.0f, 1.38f, 2.3f, 1.38f, 3.64f)
            close()
            moveTo(6f, 9f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            close()
            moveTo(8f, 6.04f)
            curveToRelative(0f, 0.85f, 1.03f, 1.27f, 1.63f, 0.67f)
            lineToRelative(0.84f, -0.84f)
            lineToRelative(1.65f, 1.65f)
            lineToRelative(-0.84f, 0.84f)
            curveToRelative(-0.6f, 0.6f, -0.17f, 1.63f, 0.67f, 1.63f)
            horizontalLineToRelative(3.07f)
            curveToRelative(0.54f, 0f, 0.98f, -0.44f, 0.98f, -0.98f)
            verticalLineToRelative(-3.07f)
            curveToRelative(0f, -0.85f, -1.03f, -1.27f, -1.63f, -0.67f)
            lineToRelative(-0.84f, 0.84f)
            lineToRelative(-1.65f, -1.65f)
            lineToRelative(0.84f, -0.84f)
            curveToRelative(0.6f, -0.6f, 0.17f, -1.63f, -0.67f, -1.63f)
            horizontalLineToRelative(-3.07f)
            curveToRelative(-0.54f, 0f, -0.98f, 0.44f, -0.98f, 0.98f)
            close()
        }
    }.also { _ResizeScreen = it }
