package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Rs.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.38f, 16.62f)
                curveToRelative(-0.19f, -0.08f, -2.12f, -0.87f, -5.04f, -1.78f)
                lineTo(22.3f, 0f)
                horizontalLineToRelative(-4.3f)
                curveToRelative(-0.94f, 0f, -1.84f, 0.45f, -2.4f, 1.2f)
                lineToRelative(-6.3f, 8.4f)
                curveToRelative(-1.13f, 1.5f, -2.92f, 2.4f, -4.8f, 2.4f)
                lineTo(0f, 12.0f)
                verticalLineToRelative(2f)
                lineTo(2f, 14.0f)
                curveToRelative(7.77f, 0f, 16.28f, 2.85f, 19.39f, 4f)
                curveToRelative(-3.11f, 1.15f, -11.62f, 4f, -19.39f, 4f)
                lineTo(0f, 22.0f)
                verticalLineToRelative(2f)
                lineTo(2f, 24.0f)
                curveToRelative(10.08f, 0f, 20.93f, -4.43f, 21.38f, -4.62f)
                lineToRelative(0.62f, -0.26f)
                verticalLineToRelative(-2.25f)
                lineToRelative(-0.62f, -0.26f)
                close()
                moveTo(10.9f, 10.8f)
                lineTo(17.2f, 2.4f)
                curveToRelative(0.19f, -0.25f, 0.49f, -0.4f, 0.8f, -0.4f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-3.27f, 12.28f)
                curveToRelative(-2.19f, -0.62f, -4.74f, -1.23f, -7.42f, -1.67f)
                curveToRelative(0.72f, -0.49f, 1.36f, -1.1f, 1.9f, -1.81f)
                close()
                moveTo(14.0f, 17f)
                verticalLineToRelative(2f)
                lineTo(7f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _PlaneTail = it}
