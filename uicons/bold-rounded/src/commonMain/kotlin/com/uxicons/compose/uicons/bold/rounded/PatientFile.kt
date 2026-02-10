package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PatientFile: ImageVector? = null

val Icons.Br.PatientFile: ImageVector
    get() = _PatientFile ?: UXIcon(name = "PatientFile") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 16f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
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
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 13.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -2.86f, 2.2f, -5.22f, 5f, -5.47f)
            verticalLineToRelative(-2.02f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(5.17f)
            curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
            lineToRelative(1.33f, 1.33f)
            curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
            verticalLineToRelative(3.2f)
            curveToRelative(2.8f, 0.25f, 5f, 2.61f, 5f, 5.47f)
            close()
            moveTo(8f, 6.16f)
            curveToRelative(0.2f, 0.06f, 0.4f, 0.12f, 0.59f, 0.21f)
            lineToRelative(3.26f, 1.63f)
            horizontalLineToRelative(4.15f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            close()
            moveTo(21f, 13.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.23f, 0f, -0.46f, -0.06f, -0.67f, -0.16f)
            lineToRelative(-3.58f, -1.79f)
            curveToRelative(-0.07f, -0.03f, -0.15f, -0.05f, -0.22f, -0.05f)
            horizontalLineToRelative(-1.53f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.also { _PatientFile = it }
