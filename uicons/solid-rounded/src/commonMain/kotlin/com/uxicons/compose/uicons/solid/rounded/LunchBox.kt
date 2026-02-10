package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Sr.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                horizontalLineToRelative(-9.14f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3f, -3.86f, -3f)
                curveToRelative(-2.06f, 0f, -6f, 1.56f, -6f, 4f)
                reflectiveCurveToRelative(3.94f, 4f, 6f, 4f)
                curveToRelative(1.86f, 0f, 3.41f, -1.28f, 3.86f, -3f)
                horizontalLineToRelative(9.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(0f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.46f)
                lineToRelative(0.07f, -0.58f)
                curveToRelative(0.3f, -2.52f, 2.43f, -4.42f, 4.97f, -4.42f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.53f, 0f, 4.67f, 1.9f, 4.97f, 4.42f)
                lineToRelative(0.07f, 0.58f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-22.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22.54f, 19f)
                lineTo(22.47f, 19.58f)
                curveToRelative(-0.3f, 2.52f, -2.43f, 4.42f, -4.97f, 4.42f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-2.53f, 0f, -4.67f, -1.9f, -4.97f, -4.42f)
                lineToRelative(-0.07f, -0.58f)
                horizontalLineToRelative(7.76f)
                lineToRelative(0.12f, 0.48f)
                curveToRelative(0.22f, 0.89f, 1.02f, 1.51f, 1.94f, 1.51f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.92f, 0f, 1.72f, -0.62f, 1.94f, -1.51f)
                lineToRelative(0.12f, -0.48f)
                horizontalLineToRelative(7.76f)
                close()
            }
        }.also { _LunchBox = it}
