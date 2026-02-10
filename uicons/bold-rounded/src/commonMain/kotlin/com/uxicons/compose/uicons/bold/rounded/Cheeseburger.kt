package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheeseburger: ImageVector? = null

val Icons.Br.Cheeseburger: ImageVector
    get() = _Cheeseburger ?: UXIcon(name = "Cheeseburger") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.88f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-3.06f, -3.06f)
            lineTo(2.5f, 17f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(19f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(1.57f, 11.1f)
            curveToRelative(-0.48f, -0.57f, -0.67f, -1.31f, -0.54f, -2.04f)
            curveTo(1.99f, 3.81f, 6.6f, 0f, 12f, 0f)
            reflectiveCurveToRelative(10.03f, 3.81f, 10.97f, 9.06f)
            curveToRelative(0.13f, 0.73f, -0.07f, 1.47f, -0.55f, 2.04f)
            curveToRelative(-0.48f, 0.57f, -1.18f, 0.9f, -1.92f, 0.9f)
            lineTo(3.5f, 12f)
            curveToRelative(-0.75f, 0f, -1.45f, -0.33f, -1.93f, -0.9f)
            close()
            moveTo(4.12f, 9f)
            horizontalLineToRelative(15.77f)
            curveToRelative(-0.91f, -3.51f, -4.13f, -6f, -7.89f, -6f)
            curveToRelative(-3.67f, 0f, -6.96f, 2.54f, -7.88f, 6f)
            close()
            moveTo(21.5f, 19f)
            horizontalLineToRelative(-1.05f)
            lineToRelative(-2.48f, 2.48f)
            curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
            reflectiveCurveToRelative(-1.81f, -0.36f, -2.48f, -1.02f)
            lineToRelative(-2.48f, -2.48f)
            lineTo(2.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(16f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _Cheeseburger = it }
