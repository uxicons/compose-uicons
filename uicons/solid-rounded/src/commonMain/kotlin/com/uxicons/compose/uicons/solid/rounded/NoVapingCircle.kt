package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVapingCircle: ImageVector? = null

val Icons.Sr.NoVapingCircle: ImageVector
    get() = _NoVapingCircle ?: UXIcon(name = "NoVapingCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(0.0f, -0.03f, 0.01f, -0.05f, 0.01f, -0.07f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -1f, -1f, -1f, -1f, -1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                reflectiveCurveToRelative(-1f, 0f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.45f, 0f, -0.89f, 0.11f, -1.28f, 0.3f)
                lineToRelative(-3.04f, -3.04f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(14.46f, 18.7f)
                curveToRelative(-0.46f, 0.18f, -0.95f, 0.29f, -1.46f, 0.29f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-3.75f)
                close()
            }
        }.also { _NoVapingCircle = it}
