package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasStation: ImageVector? = null

val Icons.Rr.GasStation: ImageVector
    get() = _GasStation ?: UXIcon(name = "GasStation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.78f, 3.22f)
                curveToRelative(-2.08f, -2.08f, -4.84f, -3.22f, -7.78f, -3.22f)
                reflectiveCurveToRelative(-5.7f, 1.15f, -7.78f, 3.22f)
                curveToRelative(-4.29f, 4.29f, -4.29f, 11.27f, 0.03f, 15.58f)
                lineToRelative(3.94f, 3.64f)
                curveToRelative(1.02f, 1.0f, 2.38f, 1.55f, 3.81f, 1.55f)
                reflectiveCurveToRelative(2.78f, -0.55f, 3.79f, -1.53f)
                lineToRelative(3.99f, -3.69f)
                curveToRelative(4.29f, -4.29f, 4.29f, -11.27f, 0f, -15.56f)
                close()
                moveTo(18.39f, 17.34f)
                lineTo(14.41f, 21.02f)
                curveToRelative(-1.29f, 1.27f, -3.5f, 1.29f, -4.84f, -0.02f)
                lineToRelative(-3.94f, -3.63f)
                curveToRelative(-3.51f, -3.51f, -3.51f, -9.22f, 0f, -12.73f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                reflectiveCurveToRelative(4.66f, 0.94f, 6.36f, 2.64f)
                curveToRelative(3.51f, 3.51f, 3.51f, 9.22f, 0.03f, 12.7f)
                close()
                moveTo(16.28f, 7.67f)
                lineTo(15.38f, 8.57f)
                curveToRelative(-0.24f, 0.24f, -0.39f, 0.58f, -0.39f, 0.93f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
                horizontalLineToRelative(1.28f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.22f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                close()
                moveTo(9.0f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.99f)
                reflectiveCurveToRelative(0f, 0.01f, 0f, 0.01f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _GasStation = it}
