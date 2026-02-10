package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Ts.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 24f)
                lineTo(6.99f, 24f)
                lineToRelative(-5.23f, -5.23f)
                curveToRelative(-1.02f, -1.02f, -1.02f, -2.67f, 0f, -3.69f)
                lineToRelative(4.24f, -4.17f)
                lineTo(6f, 2.5f)
                curveToRelative(0f, -0.73f, 0.32f, -1.43f, 0.88f, -1.91f)
                curveTo(7.44f, 0.12f, 8.19f, -0.08f, 8.92f, 0.03f)
                curveToRelative(1.19f, 0.19f, 2.08f, 1.3f, 2.08f, 2.57f)
                verticalLineToRelative(5.61f)
                lineToRelative(11f, 2.38f)
                verticalLineToRelative(13.4f)
                close()
                moveTo(7.41f, 23f)
                horizontalLineToRelative(13.59f)
                verticalLineToRelative(-11.6f)
                lineToRelative(-11f, -2.38f)
                lineTo(10f, 2.61f)
                curveToRelative(0f, -0.79f, -0.54f, -1.47f, -1.25f, -1.59f)
                curveToRelative(-0.45f, -0.07f, -0.89f, 0.05f, -1.23f, 0.34f)
                curveToRelative(-0.34f, 0.29f, -0.53f, 0.7f, -0.53f, 1.14f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.18f)
                lineToRelative(-3.53f, 3.48f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, 0.0f, 2.27f)
                lineToRelative(4.94f, 4.94f)
                close()
            }
        }.also { _CursorFinger = it}
