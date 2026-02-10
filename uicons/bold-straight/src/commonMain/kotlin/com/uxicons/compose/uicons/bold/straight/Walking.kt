package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walking: ImageVector? = null

val Icons.Bs.Walking: ImageVector
    get() = _Walking ?: UXIcon(name = "Walking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(15.45f, 13.15f)
                lineToRelative(4.38f, 2.19f)
                lineToRelative(1.34f, -2.68f)
                lineToRelative(-3.62f, -1.81f)
                lineToRelative(-2.32f, -3.65f)
                curveToRelative(-0.67f, -0.76f, -1.62f, -1.2f, -2.63f, -1.2f)
                horizontalLineToRelative(-1.95f)
                lineToRelative(-5.28f, 2.64f)
                lineToRelative(-1.32f, 4.98f)
                lineToRelative(2.9f, 0.77f)
                lineToRelative(0.97f, -3.67f)
                lineToRelative(1.83f, -0.92f)
                lineToRelative(-0.66f, 2.83f)
                curveToRelative(-0.35f, 1.5f, 0.34f, 3.08f, 1.68f, 3.84f)
                lineToRelative(4.23f, 2.4f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.87f)
                lineToRelative(-4.49f, -2.55f)
                lineToRelative(0.85f, -3.17f)
                lineToRelative(1.1f, 1.75f)
                close()
                moveTo(8.5f, 17.18f)
                lineToRelative(-0.42f, 1.84f)
                lineToRelative(-2.27f, 4.98f)
                horizontalLineToRelative(3.3f)
                lineToRelative(1.76f, -3.88f)
                lineToRelative(0.27f, -1.14f)
                lineToRelative(-1.35f, -0.77f)
                curveToRelative(-0.49f, -0.28f, -0.92f, -0.63f, -1.29f, -1.03f)
                close()
            }
        }.also { _Walking = it}
