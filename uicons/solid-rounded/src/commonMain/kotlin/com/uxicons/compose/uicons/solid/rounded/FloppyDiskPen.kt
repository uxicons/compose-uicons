package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDiskPen: ImageVector? = null

val Icons.Sr.FloppyDiskPen: ImageVector
    get() = _FloppyDiskPen ?: UXIcon(name = "FloppyDiskPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.33f, 12.67f)
                curveToRelative(0.9f, 0.9f, 0.9f, 2.35f, 0f, 3.25f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
                horizontalLineToRelative(-1.46f)
                verticalLineToRelative(-1.46f)
                curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.25f, 0f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14f, 0f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                lineTo(14f, 0f)
                close()
                moveTo(18.66f, 11.26f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.82f, 0.82f, -1.39f, 1.83f, -1.67f, 2.93f)
                horizontalLineToRelative(-5.19f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(-0.0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(16f, 0.28f)
                curveToRelative(0.33f, 0.15f, 0.64f, 0.35f, 0.89f, 0.61f)
                lineToRelative(3.24f, 3.27f)
                curveToRelative(0.56f, 0.56f, 0.87f, 1.31f, 0.87f, 2.11f)
                verticalLineToRelative(3.79f)
                curveToRelative(-0.88f, 0.14f, -1.69f, 0.56f, -2.34f, 1.2f)
                close()
                moveTo(14f, 13.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _FloppyDiskPen = it}
