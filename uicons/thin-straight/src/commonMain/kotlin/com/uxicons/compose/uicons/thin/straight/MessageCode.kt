package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCode: ImageVector? = null

val Icons.Ts.MessageCode: ImageVector
    get() = _MessageCode ?: UXIcon(name = "MessageCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.15f, 9.6f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.75f, 3.75f)
                close()
                moveTo(14.81f, 5.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(-3.75f, -3.75f)
                close()
                moveTo(24f, 2.5f)
                lineTo(24f, 20f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                curveToRelative(-0.36f, 0f, -0.71f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                lineTo(0f, 20f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 19f)
                lineTo(7.47f, 19f)
                lineToRelative(4.19f, 3.53f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.67f, 0.01f)
                lineToRelative(4.28f, -3.54f)
                horizontalLineToRelative(6.39f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _MessageCode = it}
