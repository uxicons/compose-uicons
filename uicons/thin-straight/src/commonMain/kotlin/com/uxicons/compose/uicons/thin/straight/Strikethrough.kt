package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Ts.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.15f)
                lineToRelative(-1.84f, -0.47f)
                curveToRelative(-2.48f, -0.64f, -4.21f, -2.87f, -4.21f, -5.42f)
                curveTo(2.1f, 2.51f, 4.61f, 0f, 7.7f, 0f)
                horizontalLineToRelative(8.8f)
                curveToRelative(3.09f, 0f, 5.6f, 2.51f, 5.6f, 5.6f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -2.54f, -2.06f, -4.6f, -4.6f, -4.6f)
                lineTo(7.7f, 1f)
                curveToRelative(-2.54f, 0f, -4.6f, 2.06f, -4.6f, 4.6f)
                curveToRelative(0f, 2.1f, 1.42f, 3.93f, 3.45f, 4.46f)
                lineToRelative(5.61f, 1.44f)
                horizontalLineToRelative(11.84f)
                close()
                moveTo(18.93f, 14.5f)
                curveToRelative(1.32f, 0.82f, 2.17f, 2.28f, 2.17f, 3.9f)
                curveToRelative(0f, 2.54f, -2.06f, 4.6f, -4.6f, 4.6f)
                lineTo(7.7f, 23f)
                curveToRelative(-2.54f, 0f, -4.6f, -2.06f, -4.6f, -4.6f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 3.09f, 2.51f, 5.6f, 5.6f, 5.6f)
                horizontalLineToRelative(8.8f)
                curveToRelative(3.09f, 0f, 5.6f, -2.51f, 5.6f, -5.6f)
                curveToRelative(0f, -1.5f, -0.61f, -2.88f, -1.6f, -3.9f)
                horizontalLineToRelative(-1.57f)
                close()
            }
        }.also { _Strikethrough = it}
