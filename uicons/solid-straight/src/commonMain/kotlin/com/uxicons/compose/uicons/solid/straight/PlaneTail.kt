package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Ss.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.38f, 16.62f)
                curveToRelative(-0.46f, -0.19f, -11.3f, -4.62f, -21.38f, -4.62f)
                lineTo(0f, 12f)
                verticalLineToRelative(12f)
                lineTo(2f, 24f)
                curveToRelative(10.08f, 0f, 20.93f, -4.43f, 21.38f, -4.62f)
                lineToRelative(0.62f, -0.26f)
                verticalLineToRelative(-2.25f)
                lineToRelative(-0.62f, -0.26f)
                close()
                moveTo(14f, 19f)
                lineTo(7f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(8.44f, 10.49f)
                curveToRelative(0.31f, -0.27f, 0.6f, -0.57f, 0.85f, -0.9f)
                lineTo(15.59f, 1.19f)
                curveTo(16.15f, 0.43f, 17.05f, -0.01f, 17.99f, -0.01f)
                horizontalLineToRelative(4.3f)
                lineToRelative(-3.44f, 12.91f)
                curveToRelative(-2.81f, -0.87f, -6.48f, -1.84f, -10.4f, -2.41f)
                close()
            }
        }.also { _PlaneTail = it}
