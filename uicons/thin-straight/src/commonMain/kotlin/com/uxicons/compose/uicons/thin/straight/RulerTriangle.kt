package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerTriangle: ImageVector? = null

val Icons.Ts.RulerTriangle: ImageVector
    get() = _RulerTriangle ?: UXIcon(name = "RulerTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.44f, 20.73f)
                lineTo(3.27f, 0.56f)
                curveTo(2.71f, 0.01f, 1.91f, -0.15f, 1.18f, 0.15f)
                curveTo(0.45f, 0.45f, 0f, 1.13f, 0f, 1.92f)
                lineTo(0f, 24f)
                lineTo(22.08f, 24f)
                curveToRelative(0.79f, 0f, 1.47f, -0.45f, 1.77f, -1.18f)
                curveToRelative(0.3f, -0.73f, 0.14f, -1.53f, -0.42f, -2.09f)
                close()
                moveTo(22.93f, 22.43f)
                curveToRelative(-0.15f, 0.35f, -0.46f, 0.57f, -0.85f, 0.57f)
                lineTo(1f, 23f)
                lineTo(1f, 1.92f)
                curveToRelative(0f, -0.38f, 0.21f, -0.7f, 0.57f, -0.85f)
                curveToRelative(0.35f, -0.14f, 0.73f, -0.07f, 1f, 0.2f)
                lineToRelative(2.68f, 2.68f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(2.63f, 2.63f)
                curveToRelative(0.27f, 0.27f, 0.35f, 0.65f, 0.2f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                horizontalLineToRelative(7.21f)
                lineToRelative(-7.21f, -7.21f)
                verticalLineToRelative(7.21f)
                close()
                moveTo(6f, 14.21f)
                lineToRelative(3.79f, 3.79f)
                horizontalLineToRelative(-3.79f)
                verticalLineToRelative(-3.79f)
                close()
            }
        }.also { _RulerTriangle = it}
