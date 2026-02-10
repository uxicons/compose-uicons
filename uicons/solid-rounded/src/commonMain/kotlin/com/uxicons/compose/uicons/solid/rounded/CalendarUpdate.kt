package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarUpdate: ImageVector? = null

val Icons.Sr.CalendarUpdate: ImageVector
    get() = _CalendarUpdate ?: UXIcon(name = "CalendarUpdate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
                verticalLineToRelative(-1f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(1f)
                lineTo(6f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                lineTo(0f, 8f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 10f)
                lineTo(24f, 10f)
                close()
                moveTo(15.45f, 18f)
                curveToRelative(-0.36f, 0f, -0.69f, 0.2f, -0.87f, 0.51f)
                curveToRelative(-0.52f, 0.89f, -1.48f, 1.5f, -2.58f, 1.5f)
                curveToRelative(-0.57f, 0f, -1.11f, -0.17f, -1.57f, -0.46f)
                lineToRelative(0.37f, -0.37f)
                curveToRelative(0.43f, -0.43f, 0.12f, -1.17f, -0.48f, -1.17f)
                horizontalLineToRelative(-2.69f)
                curveToRelative(-0.34f, 0f, -0.62f, 0.28f, -0.62f, 0.62f)
                verticalLineToRelative(2.69f)
                curveToRelative(0f, 0.61f, 0.73f, 0.91f, 1.17f, 0.48f)
                lineToRelative(0.82f, -0.82f)
                curveToRelative(0.86f, 0.65f, 1.91f, 1.02f, 3.02f, 1.02f)
                curveToRelative(1.83f, 0f, 3.44f, -0.99f, 4.31f, -2.47f)
                curveToRelative(0.4f, -0.68f, -0.08f, -1.53f, -0.86f, -1.53f)
                close()
                moveTo(17f, 12.68f)
                curveToRelative(0f, -0.61f, -0.73f, -0.91f, -1.17f, -0.48f)
                lineToRelative(-0.82f, 0.82f)
                curveToRelative(-0.86f, -0.65f, -1.91f, -1.02f, -3.02f, -1.02f)
                curveToRelative(-1.83f, 0f, -3.44f, 0.99f, -4.31f, 2.47f)
                curveToRelative(-0.4f, 0.68f, 0.08f, 1.53f, 0.86f, 1.53f)
                curveToRelative(0.36f, 0f, 0.69f, -0.2f, 0.87f, -0.51f)
                curveToRelative(0.52f, -0.89f, 1.48f, -1.5f, 2.58f, -1.5f)
                curveToRelative(0.57f, 0f, 1.11f, 0.17f, 1.57f, 0.46f)
                lineToRelative(-0.37f, 0.37f)
                curveToRelative(-0.43f, 0.43f, -0.12f, 1.17f, 0.48f, 1.17f)
                horizontalLineToRelative(2.69f)
                curveToRelative(0.34f, 0f, 0.62f, -0.28f, 0.62f, -0.62f)
                verticalLineToRelative(-2.69f)
                close()
            }
        }.also { _CalendarUpdate = it}
