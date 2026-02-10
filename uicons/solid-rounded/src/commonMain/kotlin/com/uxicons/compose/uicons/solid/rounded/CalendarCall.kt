package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCall: ImageVector? = null

val Icons.Sr.CalendarCall: ImageVector
    get() = _CalendarCall ?: UXIcon(name = "CalendarCall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.36f, 19.76f)
                lineToRelative(1.3f, 1.21f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                lineToRelative(-0.52f, 0.6f)
                curveToRelative(-0.55f, 0.55f, -1.28f, 0.81f, -2f, 0.81f)
                curveToRelative(-3.71f, 0f, -9.14f, -5.14f, -9.14f, -9.14f)
                curveToRelative(0f, -0.72f, 0.26f, -1.45f, 0.81f, -2f)
                lineToRelative(0.6f, -0.52f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                lineToRelative(1.21f, 1.3f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                lineToRelative(-1.02f, 1.04f)
                curveToRelative(0.9f, 2.24f, 2.43f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.04f, -1.02f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                close()
                moveTo(10f, 14.86f)
                curveToRelative(0f, -1.3f, 0.5f, -2.51f, 1.4f, -3.42f)
                lineToRelative(0.66f, -0.58f)
                curveToRelative(1.19f, -1.13f, 3.22f, -1.11f, 4.38f, 0.06f)
                lineToRelative(1.26f, 1.35f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.17f, -0.05f, 4.39f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(0.44f, 0.7f, 1.0f, 1.26f, 1.67f, 1.69f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(1.19f, -1.19f, 3.26f, -1.18f, 4.44f, 0.0f)
                lineToRelative(0.22f, 0.21f)
                verticalLineToRelative(-8.55f)
                lineTo(0f, 10.0f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10.72f)
                curveToRelative(-3.16f, -2.22f, -5.72f, -5.92f, -5.72f, -9.14f)
                close()
                moveTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _CalendarCall = it}
