package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUp: ImageVector? = null

val Icons.Ts.MessageArrowUp: ImageVector
    get() = _MessageArrowUp ?: UXIcon(name = "MessageArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(7.11f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.29f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(7.03f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.68f, -0.01f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(13.39f, 5.57f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.2f, -3.2f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.11f, -0.19f, -0.15f)
                verticalLineToRelative(8.87f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 6.13f)
                curveToRelative(-0.07f, 0.04f, -0.13f, 0.09f, -0.19f, 0.15f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.77f, -0.77f, 2.02f, -0.77f, 2.79f, 0f)
                close()
            }
        }.also { _MessageArrowUp = it}
