package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Bs.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.07f, 15.66f)
                curveToRelative(-0.18f, -0.07f, -1.93f, -0.79f, -4.59f, -1.64f)
                lineTo(22.49f, 0f)
                horizontalLineToRelative(-5.04f)
                curveToRelative(-1.05f, 0f, -2.04f, 0.47f, -2.71f, 1.28f)
                lineToRelative(-6.3f, 7.7f)
                curveToRelative(-1.05f, 1.28f, -2.6f, 2.02f, -4.26f, 2.02f)
                lineTo(0f, 11f)
                verticalLineToRelative(3f)
                lineTo(1.5f, 14f)
                curveToRelative(6.78f, 0f, 14.15f, 2.2f, 17.91f, 3.5f)
                curveToRelative(-3.76f, 1.3f, -11.13f, 3.5f, -17.91f, 3.5f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                lineTo(1.5f, 24f)
                curveToRelative(10.18f, 0f, 21.11f, -4.47f, 21.57f, -4.66f)
                lineToRelative(0.93f, -0.38f)
                verticalLineToRelative(-2.91f)
                lineToRelative(-0.93f, -0.38f)
                close()
                moveTo(9.85f, 11.84f)
                curveToRelative(0.33f, -0.29f, 0.63f, -0.61f, 0.91f, -0.95f)
                lineToRelative(6.3f, -7.7f)
                curveToRelative(0.1f, -0.12f, 0.24f, -0.18f, 0.39f, -0.18f)
                horizontalLineToRelative(1.06f)
                lineToRelative(-2.91f, 10.17f)
                curveToRelative(-1.74f, -0.48f, -3.7f, -0.95f, -5.75f, -1.33f)
                close()
                moveTo(11f, 16f)
                verticalLineToRelative(3f)
                lineTo(4f, 19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _PlaneTail = it}
