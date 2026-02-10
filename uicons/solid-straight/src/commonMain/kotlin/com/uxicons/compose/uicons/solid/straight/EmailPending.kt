package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailPending: ImageVector? = null

val Icons.Ss.EmailPending: ImageVector
    get() = _EmailPending ?: UXIcon(name = "EmailPending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(21.76f, 0f, 19f, 0f)
                close()
                moveTo(20.29f, 7.71f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(9.88f, 14.12f)
                lineTo(0.36f, 4.6f)
                curveToRelative(0.51f, -0.95f, 1.49f, -1.6f, 2.64f, -1.6f)
                horizontalLineToRelative(9.29f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 3.04f, 1.94f, 5.62f, 4.65f, 6.59f)
                lineToRelative(-2.53f, 2.53f)
                curveToRelative(-1.17f, 1.17f, -3.07f, 1.17f, -4.24f, 0f)
                close()
                moveTo(24f, 9.89f)
                verticalLineToRelative(14.11f)
                lineTo(0f, 24f)
                lineTo(0f, 7.07f)
                lineToRelative(8.46f, 8.46f)
                curveToRelative(0.98f, 0.97f, 2.26f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.57f, -0.49f, 3.54f, -1.46f)
                lineToRelative(3.53f, -3.53f)
                curveToRelative(1.93f, -0.02f, 3.67f, -0.82f, 4.93f, -2.1f)
                close()
            }
        }.also { _EmailPending = it}
