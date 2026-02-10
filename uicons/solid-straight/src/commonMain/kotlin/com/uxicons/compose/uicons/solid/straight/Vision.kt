package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vision: ImageVector? = null

val Icons.Ss.Vision: ImageVector
    get() = _Vision ?: UXIcon(name = "Vision") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.14f, 5.01f)
                lineToRelative(-1.71f, -2.89f)
                lineToRelative(1.72f, -1.02f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(-1.72f, 1.02f)
                close()
                moveTo(22f, 12.0f)
                curveToRelative(-0.2f, 0.63f, -3.42f, 6.7f, -10f, 7.0f)
                curveToRelative(-6.87f, -0.31f, -9.78f, -6.36f, -10f, -6.99f)
                curveToRelative(0.2f, -0.63f, 3.4f, -6.7f, 10f, -7.01f)
                curveToRelative(6.18f, 0.14f, 9.46f, 5.59f, 10f, 7.0f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                lineTo(13f, 0f)
                close()
                moveTo(20.57f, 2.12f)
                lineToRelative(-1.72f, -1.02f)
                lineToRelative(-1.71f, 2.89f)
                lineToRelative(1.72f, 1.02f)
                lineToRelative(1.71f, -2.89f)
                close()
                moveTo(20.57f, 21.88f)
                lineToRelative(-1.71f, -2.89f)
                lineToRelative(-1.72f, 1.02f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(1.72f, -1.02f)
                close()
                moveTo(13f, 21.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6.86f, 20.01f)
                lineToRelative(-1.72f, -1.02f)
                lineToRelative(-1.71f, 2.89f)
                lineToRelative(1.72f, 1.02f)
                lineToRelative(1.71f, -2.89f)
                close()
            }
        }.also { _Vision = it}
