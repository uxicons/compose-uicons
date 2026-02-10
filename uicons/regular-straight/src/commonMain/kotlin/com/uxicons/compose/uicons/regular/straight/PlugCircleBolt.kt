package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleBolt: ImageVector? = null

val Icons.Rs.PlugCircleBolt: ImageVector
    get() = _PlugCircleBolt ?: UXIcon(name = "PlugCircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                lineTo(0f, 8f)
                verticalLineToRelative(-2f)
                lineTo(4f, 6f)
                lineTo(4f, 0f)
                horizontalLineToRelative(2f)
                lineTo(6f, 6f)
                horizontalLineToRelative(5f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(3f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(17.9f, 16.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(1.27f, -1.89f)
                lineToRelative(-1.66f, -1.11f)
                reflectiveCurveToRelative(-1.42f, 1.88f, -1.9f, 2.92f)
                curveToRelative(-0.21f, 0.46f, -0.05f, 1.02f, 0.25f, 1.43f)
                curveToRelative(0.3f, 0.41f, 0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(1.01f)
                lineToRelative(-1.31f, 1.88f)
                lineToRelative(1.66f, 1.12f)
                lineToRelative(1.73f, -2.51f)
                horizontalLineToRelative(0f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.64f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.85f, -1.41f, -0.85f)
                close()
            }
        }.also { _PlugCircleBolt = it}
