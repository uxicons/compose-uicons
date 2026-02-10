package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Bs.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(24f)
                verticalLineToRelative(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.89f, 18.73f)
                lineTo(1.26f, 14.3f)
                curveTo(0.37f, 13.67f, -0.08f, 12.69f, 0.01f, 11.65f)
                curveToRelative(0.1f, -1.04f, 0.72f, -1.93f, 1.67f, -2.37f)
                curveToRelative(0.7f, -0.33f, 1.49f, -0.36f, 2.22f, -0.09f)
                lineToRelative(2.81f, 1.03f)
                lineTo(15.31f, 5.75f)
                curveToRelative(1.32f, -0.69f, 2.83f, -0.81f, 4.25f, -0.35f)
                curveToRelative(1.42f, 0.47f, 2.56f, 1.46f, 3.22f, 2.8f)
                lineToRelative(1.22f, 2.47f)
                lineTo(7.89f, 18.73f)
                close()
                moveTo(3.63f, 12.28f)
                lineToRelative(4.47f, 2.98f)
                lineToRelative(11.88f, -5.94f)
                curveToRelative(-0.31f, -0.51f, -0.78f, -0.89f, -1.36f, -1.08f)
                curveToRelative(-0.64f, -0.21f, -1.33f, -0.15f, -1.93f, 0.16f)
                horizontalLineToRelative(0f)
                lineTo(6.93f, 13.49f)
                lineToRelative(-3.29f, -1.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.82f, 11.08f)
                lineTo(2.17f, 4.34f)
                lineToRelative(3.74f, -2f)
                curveToRelative(0.87f, -0.33f, 1.86f, -0.17f, 2.57f, 0.44f)
                lineToRelative(6.22f, 5.18f)
            }
        }.also { _PlaneDeparture = it}
