package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectVertical: ImageVector? = null

val Icons.Ts.ReflectVertical: ImageVector
    get() = _ReflectVertical ?: UXIcon(name = "ReflectVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveToRelative(0.56f, 0f, 1.1f, -0.24f, 1.47f, -0.65f)
                lineTo(21.11f, 0f)
                lineTo(2.89f, 0f)
                lineToRelative(7.63f, 8.34f)
                curveToRelative(0.38f, 0.42f, 0.91f, 0.66f, 1.48f, 0.66f)
                close()
                moveTo(18.84f, 1f)
                lineToRelative(-6.11f, 6.67f)
                curveToRelative(-0.38f, 0.42f, -1.08f, 0.42f, -1.47f, 0f)
                lineTo(5.16f, 1f)
                horizontalLineToRelative(13.68f)
                close()
                moveTo(10.53f, 15.65f)
                lineTo(2.89f, 24f)
                lineTo(21.11f, 24f)
                lineToRelative(-7.63f, -8.34f)
                curveToRelative(-0.75f, -0.84f, -2.2f, -0.83f, -2.95f, 0f)
                close()
                moveTo(24f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                lineTo(24f, 11.5f)
                close()
            }
        }.also { _ReflectVertical = it}
