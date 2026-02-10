package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Rs.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(15f)
                lineTo(24f, 18f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                close()
                moveTo(10f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(11.86f, 21f)
                horizontalLineToRelative(12.14f)
                verticalLineToRelative(2f)
                lineTo(11.86f, 23f)
                curveToRelative(0.08f, -0.32f, 0.14f, -0.65f, 0.14f, -1f)
                reflectiveCurveToRelative(-0.06f, -0.68f, -0.14f, -1f)
                close()
                moveTo(4.14f, 21f)
                curveToRelative(-0.08f, 0.32f, -0.14f, 0.65f, -0.14f, 1f)
                reflectiveCurveToRelative(0.06f, 0.68f, 0.14f, 1f)
                lineTo(0f, 23f)
                verticalLineToRelative(-2f)
                lineTo(4.14f, 21f)
                close()
                moveTo(8.0f, 14.22f)
                lineToRelative(9.14f, -5.22f)
                lineTo(8.0f, 3.78f)
                lineTo(8.0f, 14.22f)
                close()
                moveTo(10.0f, 7.22f)
                lineToRelative(3.11f, 1.78f)
                lineToRelative(-3.11f, 1.78f)
                verticalLineToRelative(-3.55f)
                close()
            }
        }.also { _ScreenPlay = it}
