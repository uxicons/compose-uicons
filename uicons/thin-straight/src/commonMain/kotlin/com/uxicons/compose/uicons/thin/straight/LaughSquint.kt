package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughSquint: ImageVector? = null

val Icons.Ts.LaughSquint: ImageVector
    get() = _LaughSquint ?: UXIcon(name = "LaughSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 20f)
                curveToRelative(-3.57f, 0f, -5.95f, -3.25f, -6.01f, -5.49f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.19f, -2.39f, 5.5f, -5.99f, 5.5f)
                close()
                moveTo(7.06f, 15.0f)
                curveToRelative(0.36f, 1.75f, 2.27f, 4.0f, 4.95f, 4.0f)
                curveToRelative(2.64f, 0f, 4.62f, -2.23f, 4.94f, -4f)
                curveToRelative(-3.2f, -0.0f, -8.23f, 0f, -9.89f, 0f)
                close()
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(17.98f, 11.64f)
                lineToRelative(-2.68f, -2.14f)
                lineToRelative(2.68f, -2.14f)
                lineToRelative(-0.62f, -0.78f)
                lineToRelative(-3.65f, 2.92f)
                lineToRelative(3.65f, 2.92f)
                lineToRelative(0.62f, -0.78f)
                close()
                moveTo(10.3f, 9.5f)
                lineToRelative(-3.65f, -2.92f)
                lineToRelative(-0.62f, 0.78f)
                lineToRelative(2.68f, 2.14f)
                lineToRelative(-2.68f, 2.14f)
                lineToRelative(0.62f, 0.78f)
                lineToRelative(3.65f, -2.92f)
                close()
            }
        }.also { _LaughSquint = it}
