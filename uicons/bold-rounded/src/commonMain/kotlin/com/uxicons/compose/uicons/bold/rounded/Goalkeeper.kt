package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Goalkeeper: ImageVector? = null

val Icons.Br.Goalkeeper: ImageVector
    get() = _Goalkeeper ?: UXIcon(name = "Goalkeeper") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 17f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.16f, -0.07f, -0.31f, -0.2f, -0.4f)
            lineToRelative(-4.48f, -3.36f)
            lineToRelative(2.16f, 3.49f)
            curveToRelative(0.34f, 0.55f, 0.52f, 1.19f, 0.52f, 1.84f)
            verticalLineToRelative(3.93f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3.93f)
            curveToRelative(0f, -0.09f, -0.03f, -0.18f, -0.07f, -0.26f)
            lineToRelative(-4.87f, -7.87f)
            lineToRelative(-1.34f, 2.15f)
            curveToRelative(-0.55f, 0.88f, -1.5f, 1.41f, -2.54f, 1.41f)
            horizontalLineToRelative(-2.67f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.67f)
            lineToRelative(1.35f, -2.16f)
            curveToRelative(0.6f, -0.97f, 1.45f, -1.76f, 2.46f, -2.29f)
            lineToRelative(5.99f, -3.19f)
            curveToRelative(0.44f, -0.23f, 0.92f, -0.35f, 1.41f, -0.35f)
            horizontalLineToRelative(3.12f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.12f)
            lineToRelative(-2.64f, 1.41f)
            lineToRelative(1.89f, 3.06f)
            lineToRelative(4.97f, 3.73f)
            curveToRelative(0.88f, 0.66f, 1.4f, 1.71f, 1.4f, 2.8f)
            close()
            moveTo(10.0f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveTo(4f, 9f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            close()
        }
    }.also { _Goalkeeper = it }
