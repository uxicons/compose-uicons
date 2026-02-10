package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectVertical: ImageVector? = null

val Icons.Ss.ReflectVertical: ImageVector
    get() = _ReflectVertical ?: UXIcon(name = "ReflectVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveToRelative(0.65f, 0f, 1.27f, -0.28f, 1.7f, -0.76f)
                lineTo(21.25f, 0f)
                lineTo(2.75f, 0f)
                lineToRelative(7.54f, 8.24f)
                curveToRelative(0.44f, 0.49f, 1.06f, 0.76f, 1.71f, 0.76f)
                close()
                moveTo(10.3f, 15.75f)
                lineTo(2.75f, 24f)
                lineTo(21.25f, 24f)
                lineToRelative(-7.54f, -8.24f)
                curveToRelative(-0.87f, -0.97f, -2.56f, -0.96f, -3.41f, 0f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                lineTo(24f, 11f)
                close()
            }
        }.also { _ReflectVertical = it}
