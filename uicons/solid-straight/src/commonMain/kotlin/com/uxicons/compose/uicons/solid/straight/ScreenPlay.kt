package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Ss.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 20f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 23f)
                verticalLineToRelative(-2f)
                lineTo(11.86f, 21f)
                curveToRelative(0.08f, 0.32f, 0.14f, 0.65f, 0.14f, 1f)
                reflectiveCurveToRelative(-0.06f, 0.68f, -0.14f, 1f)
                horizontalLineToRelative(12.14f)
                close()
                moveTo(4.14f, 23f)
                curveToRelative(-0.08f, -0.32f, -0.14f, -0.65f, -0.14f, -1f)
                reflectiveCurveToRelative(0.06f, -0.68f, 0.14f, -1f)
                lineTo(0f, 21f)
                verticalLineToRelative(2f)
                lineTo(4.14f, 23f)
                close()
                moveTo(10.0f, 7.22f)
                verticalLineToRelative(3.55f)
                lineToRelative(3.11f, -1.78f)
                lineToRelative(-3.11f, -1.78f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(15f)
                lineTo(0f, 18f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(17.14f, 9f)
                lineTo(8.0f, 3.78f)
                lineTo(8.0f, 14.22f)
                lineToRelative(9.14f, -5.22f)
                close()
            }
        }.also { _ScreenPlay = it}
