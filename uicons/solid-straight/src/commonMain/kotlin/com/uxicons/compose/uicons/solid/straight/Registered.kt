package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Registered: ImageVector? = null

val Icons.Ss.Registered: ImageVector
    get() = _Registered ?: UXIcon(name = "Registered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-2.3f)
                lineToRelative(-3.0f, -5f)
                horizontalLineToRelative(-2.7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.88f, -1.3f, 3.44f, -3.05f, 3.87f)
                lineToRelative(3.05f, 5.13f)
                close()
                moveTo(15f, 9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Registered = it}
