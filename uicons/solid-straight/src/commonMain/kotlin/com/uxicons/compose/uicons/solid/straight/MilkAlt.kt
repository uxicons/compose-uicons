package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MilkAlt: ImageVector? = null

val Icons.Ss.MilkAlt: ImageVector
    get() = _MilkAlt ?: UXIcon(name = "MilkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 13.95f)
                verticalLineToRelative(10.05f)
                lineTo(4f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7f)
                lineTo(4.16f, 12f)
                curveToRelative(0.14f, -0.94f, 0.38f, -1.87f, 0.73f, -2.77f)
                lineToRelative(1.63f, -4.19f)
                curveToRelative(0.32f, -0.81f, 0.48f, -1.67f, 0.48f, -2.54f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(-1f)
                lineTo(6.0f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.49f)
                curveToRelative(0f, 0.87f, 0.16f, 1.73f, 0.48f, 2.54f)
                lineToRelative(1.63f, 4.19f)
                curveToRelative(0.59f, 1.51f, 0.89f, 3.1f, 0.89f, 4.72f)
                close()
                moveTo(14f, 17f)
                verticalLineToRelative(-3f)
                lineTo(4f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _MilkAlt = it}
