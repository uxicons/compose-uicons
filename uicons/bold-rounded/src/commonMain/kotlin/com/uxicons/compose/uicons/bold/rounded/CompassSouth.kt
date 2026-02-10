package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSouth: ImageVector? = null

val Icons.Br.CompassSouth: ImageVector
    get() = _CompassSouth ?: UXIcon(name = "CompassSouth") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.31f, 9.97f)
            curveToRelative(-0.68f, 1.57f, -3.71f, 7.04f, -3.71f, 7.04f)
            curveToRelative(-0.66f, 1.3f, -2.52f, 1.29f, -3.17f, -0.01f)
            curveToRelative(0f, 0f, -3.73f, -7.03f, -3.73f, -7.03f)
            curveToRelative(-0.29f, -0.64f, -0.16f, -1.42f, 0.36f, -1.95f)
            curveToRelative(0.5f, -0.5f, 1.24f, -0.65f, 1.8f, -0.41f)
            curveToRelative(0.19f, 0.09f, 3.15f, 1.61f, 3.15f, 1.61f)
            curveToRelative(0f, 0f, 2.65f, -1.36f, 2.97f, -1.55f)
            curveToRelative(0.45f, -0.22f, 0.98f, -0.23f, 1.45f, -0.02f)
            curveToRelative(0.88f, 0.39f, 1.28f, 1.42f, 0.89f, 2.32f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _CompassSouth = it }
