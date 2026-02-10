package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSeatReclined: ImageVector? = null

val Icons.Sr.PersonSeatReclined: ImageVector
    get() = _PersonSeatReclined ?: UXIcon(name = "PersonSeatReclined") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(-2.67f, -5.34f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-0.46f, 0f, -0.86f, -0.31f, -0.97f, -0.76f)
                lineToRelative(-0.56f, -2.24f)
                horizontalLineToRelative(5.97f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6.47f)
                lineToRelative(-0.56f, -2.24f)
                curveToRelative(-0.13f, -0.54f, -0.68f, -0.86f, -1.21f, -0.73f)
                curveToRelative(-0.54f, 0.13f, -0.86f, 0.68f, -0.73f, 1.21f)
                lineToRelative(1.62f, 6.49f)
                curveToRelative(0.34f, 1.34f, 1.53f, 2.27f, 2.91f, 2.27f)
                horizontalLineToRelative(5.7f)
                curveToRelative(0.38f, 0f, 0.72f, 0.21f, 0.89f, 0.55f)
                lineToRelative(2.67f, 5.34f)
                curveToRelative(0.34f, 0.68f, 1.03f, 1.1f, 1.79f, 1.1f)
                horizontalLineToRelative(1.38f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(-4.35f)
                curveToRelative(-2.31f, 0f, -4.31f, -1.57f, -4.86f, -3.81f)
                lineToRelative(-1.82f, -7.43f)
                curveToRelative(-0.13f, -0.54f, -0.68f, -0.86f, -1.21f, -0.73f)
                curveToRelative(-0.54f, 0.13f, -0.86f, 0.67f, -0.73f, 1.21f)
                lineToRelative(1.82f, 7.43f)
                curveToRelative(0.77f, 3.14f, 3.56f, 5.34f, 6.8f, 5.34f)
                horizontalLineToRelative(4.35f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _PersonSeatReclined = it}
