package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vision: ImageVector? = null

val Icons.Ts.Vision: ImageVector
    get() = _Vision ?: UXIcon(name = "Vision") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.57f, 4.75f)
                lineTo(3.86f, 1.87f)
                lineToRelative(0.86f, -0.51f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(-0.86f, 0.51f)
                close()
                moveTo(22.04f, 12.0f)
                curveToRelative(-0.12f, 0.38f, -3.53f, 6.83f, -10.04f, 7.0f)
                curveToRelative(-6.79f, -0.17f, -9.9f, -6.62f, -10.04f, -7.0f)
                curveToRelative(0.12f, -0.38f, 3.52f, -6.83f, 10.04f, -7.0f)
                curveToRelative(6.7f, 0.17f, 9.91f, 6.62f, 10.04f, 7.0f)
                close()
                moveTo(20.93f, 11.99f)
                curveToRelative(-0.59f, -1.04f, -3.71f, -5.99f, -8.93f, -5.99f)
                curveToRelative(-5.04f, 0f, -8.28f, 4.93f, -8.93f, 6.01f)
                curveToRelative(0.59f, 1.05f, 3.68f, 5.99f, 8.93f, 5.99f)
                curveToRelative(5.04f, 0f, 8.28f, -4.92f, 8.93f, -6.01f)
                close()
                moveTo(16f, 12.0f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(15f, 12.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 3f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 0f)
                close()
                moveTo(20.14f, 1.87f)
                lineToRelative(-0.86f, -0.51f)
                lineToRelative(-1.71f, 2.89f)
                lineToRelative(0.86f, 0.51f)
                lineToRelative(1.71f, -2.89f)
                close()
                moveTo(17.57f, 19.75f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(0.86f, -0.51f)
                lineToRelative(-1.71f, -2.89f)
                lineToRelative(-0.86f, 0.51f)
                close()
                moveTo(11.5f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                close()
                moveTo(3.86f, 22.13f)
                lineToRelative(0.86f, 0.51f)
                lineToRelative(1.71f, -2.89f)
                lineToRelative(-0.86f, -0.51f)
                lineToRelative(-1.71f, 2.89f)
                close()
            }
        }.also { _Vision = it}
