package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLocation: ImageVector? = null

val Icons.Br.LandLocation: ImageVector
    get() = _LandLocation ?: UXIcon(name = "LandLocation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.25f, 12.68f)
            curveToRelative(0.97f, 0.95f, 2.52f, 0.95f, 3.5f, 0f)
            lineToRelative(2.49f, -2.44f)
            curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
            reflectiveCurveToRelative(-0.62f, -3.11f, -1.76f, -4.24f)
            curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
            reflectiveCurveToRelative(-3.11f, 0.62f, -4.24f, 1.76f)
            curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
            reflectiveCurveToRelative(0.62f, 3.11f, 1.77f, 4.25f)
            lineToRelative(2.48f, 2.43f)
            close()
            moveTo(12f, 4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
            moveTo(23.94f, 18.76f)
            lineToRelative(-1f, -6.0f)
            curveToRelative(-0.2f, -1.23f, -0.91f, -2.32f, -1.95f, -3.01f)
            curveToRelative(-0.69f, -0.46f, -1.62f, -0.27f, -2.08f, 0.42f)
            curveToRelative(-0.46f, 0.69f, -0.27f, 1.62f, 0.42f, 2.08f)
            curveToRelative(0.35f, 0.23f, 0.58f, 0.6f, 0.65f, 1.0f)
            lineToRelative(0.29f, 1.75f)
            lineTo(3.73f, 15f)
            lineToRelative(0.29f, -1.75f)
            curveToRelative(0.07f, -0.41f, 0.3f, -0.77f, 0.65f, -1.0f)
            curveToRelative(0.69f, -0.46f, 0.88f, -1.39f, 0.42f, -2.08f)
            reflectiveCurveToRelative(-1.39f, -0.88f, -2.08f, -0.42f)
            curveToRelative(-1.04f, 0.69f, -1.75f, 1.79f, -1.95f, 3.01f)
            lineTo(0.06f, 18.76f)
            curveToRelative(-0.22f, 1.31f, 0.15f, 2.64f, 1.0f, 3.65f)
            curveToRelative(0.86f, 1.01f, 2.11f, 1.59f, 3.43f, 1.59f)
            horizontalLineToRelative(15f)
            curveToRelative(1.32f, 0f, 2.58f, -0.58f, 3.43f, -1.59f)
            curveToRelative(0.86f, -1.01f, 1.22f, -2.34f, 1.0f, -3.65f)
            close()
            moveTo(14.12f, 18f)
            lineToRelative(0.25f, 3f)
            horizontalLineToRelative(-4.74f)
            lineToRelative(0.25f, -3f)
            horizontalLineToRelative(4.24f)
            close()
            moveTo(3.35f, 20.47f)
            curveToRelative(-0.29f, -0.34f, -0.41f, -0.77f, -0.34f, -1.22f)
            lineToRelative(0.21f, -1.25f)
            horizontalLineToRelative(3.64f)
            lineToRelative(-0.25f, 3f)
            horizontalLineToRelative(-2.12f)
            curveToRelative(-0.45f, 0f, -0.85f, -0.19f, -1.15f, -0.53f)
            close()
            moveTo(20.64f, 20.47f)
            curveToRelative(-0.29f, 0.34f, -0.7f, 0.53f, -1.15f, 0.53f)
            horizontalLineToRelative(-2.12f)
            lineToRelative(-0.25f, -3f)
            horizontalLineToRelative(3.64f)
            lineToRelative(0.21f, 1.25f)
            curveToRelative(0.07f, 0.44f, -0.05f, 0.87f, -0.34f, 1.22f)
            close()
        }
    }.also { _LandLocation = it }
