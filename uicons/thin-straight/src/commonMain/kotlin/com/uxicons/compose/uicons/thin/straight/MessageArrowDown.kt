package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowDown: ImageVector? = null

val Icons.Ts.MessageArrowDown: ImageVector
    get() = _MessageArrowDown ?: UXIcon(name = "MessageArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(7.11f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.28f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(7.03f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.67f, -0.01f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19.0f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(15.89f, 10.52f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.2f, 3.2f)
                curveToRelative(-0.38f, 0.38f, -0.89f, 0.58f, -1.39f, 0.58f)
                reflectiveCurveToRelative(-1.01f, -0.19f, -1.39f, -0.58f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.11f, 0.19f, 0.15f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8.87f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.09f, 0.19f, -0.15f)
                lineToRelative(3.2f, -3.2f)
                close()
            }
        }.also { _MessageArrowDown = it}
