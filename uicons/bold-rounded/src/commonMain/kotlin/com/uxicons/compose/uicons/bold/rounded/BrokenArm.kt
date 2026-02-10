package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenArm: ImageVector? = null

val Icons.Br.BrokenArm: ImageVector
    get() = _BrokenArm ?: UXIcon(name = "BrokenArm") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 20f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.3f)
            lineToRelative(0.45f, -0.54f)
            curveToRelative(0.51f, -0.62f, 0.45f, -1.53f, -0.14f, -2.07f)
            curveToRelative(-0.59f, -0.54f, -1.51f, -0.52f, -2.07f, 0.05f)
            lineToRelative(-2.56f, 2.56f)
            horizontalLineToRelative(-2.88f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.5f, -0.45f, -1.88f, -1f, -2.44f)
            lineTo(10f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-3f)
            lineTo(4f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4.56f)
            curveToRelative(-0.62f, 0.63f, -1f, 1.49f, -1f, 2.44f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
            horizontalLineToRelative(14f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(4.5f)
            close()
            moveTo(11.14f, 16.02f)
            lineToRelative(0.02f, -0.02f)
            horizontalLineToRelative(3.84f)
            verticalLineToRelative(3.52f)
            lineToRelative(-3.86f, -3.5f)
            close()
            moveTo(3.65f, 18.8f)
            curveToRelative(-0.4f, -0.68f, -0.65f, -1.46f, -0.65f, -2.3f)
            verticalLineToRelative(-0.2f)
            lineToRelative(5f, -4.57f)
            verticalLineToRelative(2.77f)
            curveToRelative(0f, 0.1f, 0.01f, 0.2f, 0.03f, 0.3f)
            lineToRelative(-4.38f, 4.0f)
            close()
            moveTo(3.0f, 8.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.04f, 0f, 0.07f, 0.01f, 0.11f, 0.02f)
            lineToRelative(-4.61f, 4.21f)
            verticalLineToRelative(-3.74f)
            close()
            moveTo(5.99f, 20.72f)
            lineToRelative(2.92f, -2.67f)
            lineToRelative(3.25f, 2.95f)
            horizontalLineToRelative(-4.67f)
            curveToRelative(-0.53f, 0f, -1.03f, -0.11f, -1.51f, -0.28f)
            close()
        }
    }.also { _BrokenArm = it }
