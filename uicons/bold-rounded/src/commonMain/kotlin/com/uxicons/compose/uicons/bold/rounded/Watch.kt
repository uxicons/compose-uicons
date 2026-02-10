package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Br.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.56f, 12.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.88f)
            lineToRelative(1.06f, 1.06f)
            close()
            moveTo(18f, 19.99f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.96f)
            curveToRelative(-0.95f, 0.3f, -1.96f, 0.46f, -3f, 0.46f)
            reflectiveCurveToRelative(-2.05f, -0.16f, -3f, -0.46f)
            verticalLineToRelative(0.96f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(-2.43f, -1.83f, -4f, -4.73f, -4f, -8.0f)
            reflectiveCurveToRelative(1.57f, -6.17f, 4f, -8.0f)
            lineTo(6f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.96f)
            curveToRelative(0.95f, -0.3f, 1.96f, -0.46f, 3f, -0.46f)
            reflectiveCurveToRelative(2.05f, 0.16f, 3f, 0.46f)
            verticalLineToRelative(-0.96f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(2.43f, 1.83f, 4f, 4.73f, 4f, 8.0f)
            reflectiveCurveToRelative(-1.57f, 6.17f, -4f, 8.0f)
            close()
            moveTo(19f, 12.0f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
            reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
            close()
        }
    }.also { _Watch = it }
