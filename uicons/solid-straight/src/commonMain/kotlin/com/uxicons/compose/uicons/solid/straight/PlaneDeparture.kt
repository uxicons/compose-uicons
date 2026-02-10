package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Ss.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 9.73f)
                lineToRelative(-1.05f, -2.26f)
                curveToRelative(-0.58f, -1.25f, -2.07f, -1.8f, -3.32f, -1.22f)
                lineTo(5.8f, 12.93f)
                lineToRelative(-3.24f, -1.19f)
                curveToRelative(-0.47f, -0.17f, -1f, -0.15f, -1.46f, 0.06f)
                curveTo(0.48f, 12.09f, 0.07f, 12.67f, 0.01f, 13.35f)
                curveToRelative(-0.06f, 0.68f, 0.23f, 1.33f, 0.79f, 1.73f)
                lineToRelative(4.84f, 3.44f)
                lineTo(24f, 9.73f)
                close()
                moveTo(13.74f, 6.87f)
                lineToRelative(-5.35f, -3.38f)
                curveToRelative(-0.73f, -0.55f, -1.71f, -0.65f, -2.54f, -0.26f)
                lineToRelative(-2.5f, 1.14f)
                lineToRelative(5.54f, 4.82f)
                lineToRelative(4.86f, -2.32f)
                close()
            }
        }.also { _PlaneDeparture = it}
