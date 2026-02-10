package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FunctionSquare: ImageVector? = null

val Icons.Br.FunctionSquare: ImageVector
    get() = _FunctionSquare ?: UXIcon(name = "FunctionSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(12.05f, 6f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-0.8f)
            curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(4.3f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-4.3f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.79f, 1.46f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(0.8f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(18.53f, 12.91f)
            lineToRelative(-1.45f, 2.08f)
            lineToRelative(1.45f, 2.08f)
            curveToRelative(0.4f, 0.57f, 0.26f, 1.35f, -0.31f, 1.74f)
            curveToRelative(-0.22f, 0.15f, -0.47f, 0.23f, -0.71f, 0.23f)
            curveToRelative(-0.4f, 0f, -0.78f, -0.19f, -1.03f, -0.54f)
            lineToRelative(-0.92f, -1.33f)
            lineToRelative(-0.92f, 1.33f)
            curveToRelative(-0.24f, 0.35f, -0.63f, 0.54f, -1.03f, 0.54f)
            curveToRelative(-0.25f, 0f, -0.5f, -0.07f, -0.71f, -0.23f)
            curveToRelative(-0.57f, -0.4f, -0.71f, -1.17f, -0.31f, -1.74f)
            lineToRelative(1.45f, -2.08f)
            lineToRelative(-1.45f, -2.08f)
            curveToRelative(-0.4f, -0.57f, -0.26f, -1.35f, 0.31f, -1.74f)
            curveToRelative(0.57f, -0.4f, 1.34f, -0.26f, 1.74f, 0.31f)
            lineToRelative(0.92f, 1.33f)
            lineToRelative(0.92f, -1.33f)
            curveToRelative(0.4f, -0.56f, 1.17f, -0.71f, 1.74f, -0.31f)
            curveToRelative(0.57f, 0.4f, 0.71f, 1.17f, 0.31f, 1.74f)
            close()
        }
    }.also { _FunctionSquare = it }
