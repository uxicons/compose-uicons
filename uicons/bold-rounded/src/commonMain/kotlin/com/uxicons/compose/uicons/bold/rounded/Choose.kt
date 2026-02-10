package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Choose: ImageVector? = null

val Icons.Br.Choose: ImageVector
    get() = _Choose ?: UXIcon(name = "Choose") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(2.5f, 8f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-3f)
            curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(3f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            close()
            moveTo(8f, 15.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveTo(5f, 15f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            close()
            moveTo(10f, 5.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.11f, -0.72f, -2.08f, -1.78f, -2.4f)
            lineToRelative(-4.22f, -1.27f)
            verticalLineToRelative(2.74f)
            curveToRelative(0f, 1.34f, -1.08f, 2.42f, -2.42f, 2.42f)
            horizontalLineToRelative(-0.76f)
            curveToRelative(-0.88f, 0f, -1.74f, -0.32f, -2.4f, -0.91f)
            lineToRelative(-1.68f, -1.48f)
            curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
            curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
            lineToRelative(1.64f, 1.3f)
            verticalLineToRelative(-8.27f)
            curveToRelative(0f, -0.96f, 0.88f, -1.71f, 1.88f, -1.45f)
            curveToRelative(0.68f, 0.17f, 1.13f, 0.84f, 1.13f, 1.54f)
            verticalLineToRelative(4.12f)
            lineToRelative(5.08f, 1.52f)
            curveToRelative(2.35f, 0.7f, 3.92f, 2.82f, 3.92f, 5.27f)
            close()
        }
    }.also { _Choose = it }
