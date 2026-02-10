package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Employees: ImageVector? = null

val Icons.Br.Employees: ImageVector
    get() = _Employees ?: UXIcon(name = "Employees") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 8f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
            moveTo(12f, 8f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveTo(14.21f, 0f, 12f, 0f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveTo(6.5f, 16f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveTo(23.95f, 22.13f)
            curveToRelative(-0.77f, -3.02f, -3.52f, -5.13f, -6.7f, -5.13f)
            curveToRelative(-2.08f, 0f, -3.97f, 0.92f, -5.25f, 2.39f)
            curveToRelative(-1.28f, -1.47f, -3.17f, -2.39f, -5.25f, -2.39f)
            curveToRelative(-3.18f, 0f, -5.94f, 2.11f, -6.7f, 5.13f)
            curveToRelative(-0.2f, 0.8f, 0.28f, 1.62f, 1.08f, 1.82f)
            curveToRelative(0.8f, 0.2f, 1.62f, -0.28f, 1.82f, -1.08f)
            curveToRelative(0.22f, -0.88f, 0.76f, -1.62f, 1.47f, -2.12f)
            lineToRelative(1.42f, 1.81f)
            curveToRelative(0.47f, 0.59f, 1.37f, 0.59f, 1.84f, 0f)
            lineToRelative(1.43f, -1.79f)
            curveToRelative(0.7f, 0.51f, 1.22f, 1.24f, 1.44f, 2.1f)
            curveToRelative(0.0f, 0.01f, 0.27f, 1.13f, 1.46f, 1.13f)
            reflectiveCurveToRelative(1.45f, -1.12f, 1.45f, -1.13f)
            curveToRelative(0.22f, -0.88f, 0.76f, -1.61f, 1.47f, -2.12f)
            lineToRelative(1.42f, 1.81f)
            curveToRelative(0.47f, 0.59f, 1.37f, 0.59f, 1.84f, 0f)
            lineToRelative(1.43f, -1.79f)
            curveToRelative(0.7f, 0.51f, 1.22f, 1.24f, 1.44f, 2.1f)
            curveToRelative(0.2f, 0.8f, 1.02f, 1.29f, 1.82f, 1.08f)
            curveToRelative(0.8f, -0.2f, 1.29f, -1.02f, 1.09f, -1.82f)
            close()
        }
    }.also { _Employees = it }
