package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Registered: ImageVector? = null

val Icons.Rr.Registered: ImageVector
    get() = _Registered ?: UXIcon(name = "Registered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(14.57f, 12.68f)
                curveToRelative(1.43f, -0.61f, 2.43f, -2.03f, 2.43f, -3.68f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.43f)
                lineToRelative(2.71f, 4.51f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.48f, 0.86f, 0.48f)
                curveToRelative(0.17f, 0f, 0.35f, -0.05f, 0.51f, -0.14f)
                curveToRelative(0.47f, -0.28f, 0.63f, -0.9f, 0.34f, -1.37f)
                lineToRelative(-2.29f, -3.81f)
                close()
                moveTo(9f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Registered = it}
