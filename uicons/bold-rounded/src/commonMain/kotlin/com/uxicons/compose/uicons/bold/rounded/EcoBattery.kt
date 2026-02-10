package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EcoBattery: ImageVector? = null

val Icons.Br.EcoBattery: ImageVector
    get() = _EcoBattery ?: UXIcon(name = "EcoBattery") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 17f)
            curveToRelative(0.35f, 0f, 0.68f, -0.06f, 1f, -0.14f)
            verticalLineToRelative(1.14f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-1.14f)
            curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1f, 0.14f)
            close()
            moveTo(10.78f, 8.01f)
            curveToRelative(-1.29f, 1.32f, -2.78f, 3.28f, -2.78f, 4.99f)
            curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
            verticalLineToRelative(-3.86f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(3.86f)
            curveToRelative(1.72f, -0.45f, 3f, -2.0f, 3f, -3.86f)
            curveToRelative(0f, -1.71f, -1.49f, -3.67f, -2.78f, -4.99f)
            curveToRelative(-0.67f, -0.69f, -1.76f, -0.69f, -2.44f, 0f)
            close()
            moveTo(20f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -2.51f, 1.7f, -4.63f, 4f, -5.29f)
            verticalLineToRelative(-1.21f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(1.21f)
            curveToRelative(2.31f, 0.66f, 4f, 2.77f, 4f, 5.29f)
            close()
            moveTo(17f, 7.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _EcoBattery = it }
