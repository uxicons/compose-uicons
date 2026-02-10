package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vest: ImageVector? = null

val Icons.Sr.Vest: ImageVector
    get() = _Vest ?: UXIcon(name = "Vest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24f)
                lineTo(6f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2f)
                lineTo(7f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(1f, 15f)
                verticalLineToRelative(-1.67f)
                curveToRelative(0f, -1.02f, 0.3f, -2.0f, 0.88f, -2.83f)
                curveToRelative(0.71f, -1.03f, 1.12f, -1.94f, 1.12f, -2.5f)
                verticalLineToRelative(-2.94f)
                curveTo(3f, 2.79f, 4.5f, 0.86f, 6.61f, 0.27f)
                lineToRelative(4.39f, 11.91f)
                verticalLineToRelative(11.82f)
                close()
                moveTo(12f, 9.11f)
                lineTo(15.35f, 0.01f)
                curveToRelative(-0.21f, -0.01f, -0.34f, -0.01f, -0.35f, -0.01f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.01f, 0f, -0.14f, 0f, -0.35f, 0.01f)
                lineToRelative(3.35f, 9.1f)
                close()
                moveTo(17f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.67f)
                curveToRelative(0f, -1.02f, -0.3f, -2.0f, -0.88f, -2.83f)
                curveToRelative(-0.71f, -1.03f, -1.12f, -1.94f, -1.12f, -2.5f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0f, -2.27f, -1.5f, -4.2f, -3.61f, -4.8f)
                lineToRelative(-4.39f, 11.91f)
                verticalLineToRelative(11.82f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Vest = it}
