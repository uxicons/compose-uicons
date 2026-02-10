package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vision: ImageVector? = null

val Icons.Rs.Vision: ImageVector
    get() = _Vision ?: UXIcon(name = "Vision") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.14f, 5.01f)
                lineToRelative(-1.71f, -2.89f)
                lineToRelative(1.72f, -1.02f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(-1.72f, 1.02f)
                close()
                moveTo(22.57f, 12.0f)
                curveToRelative(-0.21f, 0.68f, -3.61f, 7.17f, -10.57f, 7.5f)
                curveToRelative(-7.26f, -0.32f, -10.35f, -6.84f, -10.57f, -7.49f)
                curveToRelative(0.2f, -0.68f, 3.59f, -7.17f, 10.57f, -7.51f)
                curveToRelative(6.54f, 0.15f, 10.0f, 5.99f, 10.57f, 7.5f)
                close()
                moveTo(20.35f, 11.98f)
                curveToRelative(-0.79f, -1.3f, -3.67f, -5.48f, -8.35f, -5.48f)
                curveToRelative(-4.5f, 0f, -7.49f, 4.16f, -8.35f, 5.52f)
                curveToRelative(0.78f, 1.31f, 3.65f, 5.48f, 8.35f, 5.48f)
                curveToRelative(4.5f, 0f, 7.49f, -4.15f, 8.35f, -5.52f)
                close()
                moveTo(16.0f, 12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(14.0f, 12f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
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
                moveTo(17.14f, 20.01f)
                lineToRelative(1.71f, 2.89f)
                lineToRelative(1.72f, -1.02f)
                lineToRelative(-1.71f, -2.89f)
                lineToRelative(-1.72f, 1.02f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                close()
                moveTo(3.43f, 21.88f)
                lineToRelative(1.72f, 1.02f)
                lineToRelative(1.71f, -2.89f)
                lineToRelative(-1.72f, -1.02f)
                lineToRelative(-1.71f, 2.89f)
                close()
            }
        }.also { _Vision = it}
