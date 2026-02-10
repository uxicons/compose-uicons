package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MilkAlt: ImageVector? = null

val Icons.Rs.MilkAlt: ImageVector
    get() = _MilkAlt ?: UXIcon(name = "MilkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.11f, 9.23f)
                lineToRelative(-1.63f, -4.19f)
                curveToRelative(-0.32f, -0.81f, -0.48f, -1.67f, -0.48f, -2.54f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(1f)
                lineTo(18.0f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.49f)
                curveToRelative(0f, 0.87f, -0.16f, 1.73f, -0.48f, 2.54f)
                lineToRelative(-1.63f, 4.19f)
                curveToRelative(-0.59f, 1.51f, -0.89f, 3.1f, -0.89f, 4.72f)
                verticalLineToRelative(10.05f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-10.05f)
                curveToRelative(0f, -1.62f, -0.3f, -3.21f, -0.89f, -4.72f)
                close()
                moveTo(14f, 14f)
                verticalLineToRelative(3f)
                lineTo(6f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(18f, 22f)
                lineTo(6f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7f)
                lineTo(6.18f, 12f)
                curveToRelative(0.12f, -0.7f, 0.32f, -1.38f, 0.57f, -2.05f)
                lineToRelative(1.63f, -4.19f)
                curveToRelative(0.41f, -1.05f, 0.61f, -2.15f, 0.61f, -3.27f)
                verticalLineToRelative(-0.49f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.49f)
                curveToRelative(0f, 1.12f, 0.21f, 2.22f, 0.61f, 3.27f)
                lineToRelative(1.63f, 4.19f)
                curveToRelative(0.5f, 1.28f, 0.75f, 2.62f, 0.75f, 4.0f)
                verticalLineToRelative(8.05f)
                close()
            }
        }.also { _MilkAlt = it}
