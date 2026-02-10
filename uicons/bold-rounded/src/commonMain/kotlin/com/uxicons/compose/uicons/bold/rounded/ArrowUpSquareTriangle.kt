package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpSquareTriangle: ImageVector? = null

val Icons.Br.ArrowUpSquareTriangle: ImageVector
    get() = _ArrowUpSquareTriangle ?: UXIcon(name = "ArrowUpSquareTriangle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            lineTo(14f, 3f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            close()
            moveTo(23.44f, 20.56f)
            lineToRelative(-3.49f, -5.7f)
            curveToRelative(-0.62f, -1.15f, -2.28f, -1.15f, -2.9f, 0f)
            lineToRelative(-3.49f, 5.7f)
            curveToRelative(-0.6f, 1.1f, 0.2f, 2.44f, 1.45f, 2.44f)
            horizontalLineToRelative(6.98f)
            curveToRelative(1.25f, 0f, 2.05f, -1.34f, 1.45f, -2.44f)
            close()
            moveTo(8.27f, 0.74f)
            curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.53f, -0.01f)
            lineTo(0.94f, 4.49f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.01f, 2.12f)
            curveToRelative(0.58f, 0.59f, 1.53f, 0.59f, 2.12f, 0.01f)
            lineToRelative(1.95f, -1.92f)
            lineTo(5f, 22.55f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(8f, 4.7f)
            lineToRelative(1.95f, 1.92f)
            curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
            curveToRelative(0.5f, 0f, 1.01f, -0.25f, 1.3f, -0.75f)
            curveToRelative(0.36f, -0.6f, 0.19f, -1.38f, -0.31f, -1.87f)
            lineTo(8.27f, 0.74f)
            close()
        }
    }.also { _ArrowUpSquareTriangle = it }
