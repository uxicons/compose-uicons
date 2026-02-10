package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chip: ImageVector? = null

val Icons.Br.Chip: ImageVector
    get() = _Chip ?: UXIcon(name = "Chip") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
            reflectiveCurveTo(18.63f, 0f, 12f, 0f)
            close()
            moveTo(13.5f, 3.13f)
            curveToRelative(2.12f, 0.36f, 3.98f, 1.45f, 5.33f, 3.01f)
            lineToRelative(-1.75f, 1.05f)
            curveToRelative(-0.95f, -1.0f, -2.19f, -1.73f, -3.58f, -2.03f)
            lineTo(13.5f, 3.13f)
            close()
            moveTo(10.5f, 3.13f)
            verticalLineToRelative(2.03f)
            curveToRelative(-1.39f, 0.31f, -2.63f, 1.03f, -3.58f, 2.03f)
            lineToRelative(-1.75f, -1.05f)
            curveToRelative(1.34f, -1.56f, 3.21f, -2.66f, 5.33f, -3.01f)
            close()
            moveTo(3f, 12f)
            curveToRelative(0f, -1.16f, 0.23f, -2.26f, 0.63f, -3.28f)
            lineToRelative(1.74f, 1.05f)
            curveToRelative(-0.24f, 0.7f, -0.37f, 1.45f, -0.37f, 2.23f)
            reflectiveCurveToRelative(0.13f, 1.53f, 0.37f, 2.23f)
            lineToRelative(-1.74f, 1.05f)
            curveToRelative(-0.4f, -1.02f, -0.63f, -2.12f, -0.63f, -3.28f)
            close()
            moveTo(10.5f, 20.86f)
            curveToRelative(-2.12f, -0.36f, -3.98f, -1.45f, -5.32f, -3.01f)
            lineToRelative(1.75f, -1.05f)
            curveToRelative(0.95f, 1.0f, 2.19f, 1.73f, 3.58f, 2.03f)
            verticalLineToRelative(2.03f)
            close()
            moveTo(8f, 12f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
            moveTo(13.5f, 20.86f)
            verticalLineToRelative(-2.03f)
            curveToRelative(1.39f, -0.31f, 2.63f, -1.03f, 3.58f, -2.03f)
            lineToRelative(1.75f, 1.05f)
            curveToRelative(-1.34f, 1.56f, -3.21f, 2.66f, -5.32f, 3.01f)
            close()
            moveTo(20.37f, 15.28f)
            lineToRelative(-1.74f, -1.05f)
            curveToRelative(0.24f, -0.7f, 0.37f, -1.45f, 0.37f, -2.23f)
            reflectiveCurveToRelative(-0.13f, -1.53f, -0.37f, -2.23f)
            lineToRelative(1.74f, -1.05f)
            curveToRelative(0.4f, 1.02f, 0.63f, 2.12f, 0.63f, 3.28f)
            reflectiveCurveToRelative(-0.23f, 2.26f, -0.63f, 3.28f)
            close()
        }
    }.also { _Chip = it }
