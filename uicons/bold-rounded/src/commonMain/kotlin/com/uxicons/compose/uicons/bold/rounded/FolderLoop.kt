package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderLoop: ImageVector? = null

val Icons.Br.FolderLoop: ImageVector
    get() = _FolderLoop ?: UXIcon(name = "FolderLoop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.69f, 15f)
            curveToRelative(-1.6f, 0f, -2.84f, 0.92f, -3.69f, 1.86f)
            curveToRelative(-0.85f, -0.94f, -2.09f, -1.86f, -3.69f, -1.86f)
            curveToRelative(-2.38f, 0f, -4.31f, 2.02f, -4.31f, 4.5f)
            reflectiveCurveToRelative(1.94f, 4.5f, 4.31f, 4.5f)
            curveToRelative(1.6f, 0f, 2.84f, -0.92f, 3.69f, -1.86f)
            curveToRelative(0.85f, 0.94f, 2.09f, 1.86f, 3.69f, 1.86f)
            curveToRelative(2.38f, 0f, 4.31f, -2.02f, 4.31f, -4.5f)
            reflectiveCurveToRelative(-1.94f, -4.5f, -4.31f, -4.5f)
            close()
            moveTo(12.31f, 21f)
            curveToRelative(-0.72f, 0f, -1.31f, -0.67f, -1.31f, -1.5f)
            reflectiveCurveToRelative(0.59f, -1.5f, 1.31f, -1.5f)
            reflectiveCurveToRelative(1.47f, 0.8f, 1.95f, 1.5f)
            curveToRelative(-0.48f, 0.7f, -1.23f, 1.5f, -1.95f, 1.5f)
            close()
            moveTo(19.69f, 21f)
            curveToRelative(-0.72f, 0f, -1.47f, -0.8f, -1.95f, -1.5f)
            curveToRelative(0.48f, -0.7f, 1.23f, -1.5f, 1.95f, -1.5f)
            reflectiveCurveToRelative(1.31f, 0.67f, 1.31f, 1.5f)
            reflectiveCurveToRelative(-0.59f, 1.5f, -1.31f, 1.5f)
            close()
            moveTo(24f, 7.5f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(21f, 7.5f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            lineTo(3f, 7f)
            verticalLineToRelative(9.63f)
            curveToRelative(0f, 1.14f, 0.77f, 2.14f, 1.87f, 2.42f)
            curveToRelative(0.8f, 0.21f, 1.28f, 1.02f, 1.08f, 1.83f)
            curveToRelative(-0.17f, 0.68f, -0.78f, 1.13f, -1.45f, 1.13f)
            curveToRelative(-0.12f, 0f, -0.25f, -0.01f, -0.38f, -0.05f)
            curveToRelative(-2.43f, -0.62f, -4.13f, -2.81f, -4.13f, -5.33f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.54f, 0f, 1.08f, 0.13f, 1.56f, 0.37f)
            lineToRelative(3.16f, 1.58f)
            curveToRelative(0.07f, 0.04f, 0.15f, 0.05f, 0.22f, 0.05f)
            horizontalLineToRelative(5.53f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
        }
    }.also { _FolderLoop = it }
