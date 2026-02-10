package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PumpMedical: ImageVector? = null

val Icons.Br.PumpMedical: ImageVector
    get() = _PumpMedical ?: UXIcon(name = "PumpMedical") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.44f, 2.33f)
            lineToRelative(-0.58f, -0.47f)
            curveToRelative(-1.5f, -1.2f, -3.39f, -1.86f, -5.31f, -1.86f)
            horizontalLineToRelative(-4.54f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(1.45f)
            curveToRelative(-3.13f, 1.31f, -6f, 4.2f, -6f, 8.24f)
            verticalLineToRelative(4.81f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-4.81f)
            curveToRelative(0f, -4.05f, -2.87f, -6.94f, -6f, -8.24f)
            verticalLineToRelative(-2.44f)
            horizontalLineToRelative(2.54f)
            curveToRelative(1.24f, 0f, 2.46f, 0.43f, 3.44f, 1.21f)
            lineToRelative(0.58f, 0.47f)
            curveToRelative(0.65f, 0.52f, 1.59f, 0.41f, 2.11f, -0.23f)
            curveToRelative(0.52f, -0.65f, 0.41f, -1.59f, -0.23f, -2.11f)
            close()
            moveTo(18f, 13.69f)
            verticalLineToRelative(4.81f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-4.81f)
            curveToRelative(0f, -3.07f, 2.5f, -4.96f, 4.73f, -5.69f)
            horizontalLineToRelative(2.54f)
            curveToRelative(2.23f, 0.73f, 4.73f, 2.62f, 4.73f, 5.69f)
            close()
            moveTo(13.5f, 13.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            close()
        }
    }.also { _PumpMedical = it }
