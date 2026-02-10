package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Rr.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 16f)
                horizontalLineToRelative(-0.35f)
                lineToRelative(-0.19f, -1.58f)
                curveToRelative(-0.3f, -2.52f, -2.43f, -4.42f, -4.97f, -4.42f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-2.53f, 0f, -4.67f, 1.9f, -4.97f, 4.42f)
                lineToRelative(-0.19f, 1.58f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.35f)
                lineToRelative(0.19f, 1.58f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.53f, 0f, 4.67f, -1.9f, 4.97f, -4.42f)
                lineToRelative(0.19f, -1.58f)
                horizontalLineToRelative(0.35f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(3.52f, 14.65f)
                curveToRelative(0.18f, -1.51f, 1.46f, -2.65f, 2.98f, -2.65f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.16f, 1.35f)
                horizontalLineToRelative(-17.28f)
                close()
                moveTo(17.5f, 22f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineToRelative(-0.16f, -1.35f)
                horizontalLineToRelative(5.86f)
                lineToRelative(0.12f, 0.48f)
                curveToRelative(0.22f, 0.89f, 1.02f, 1.51f, 1.94f, 1.51f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.92f, 0f, 1.72f, -0.62f, 1.94f, -1.51f)
                lineToRelative(0.12f, -0.48f)
                horizontalLineToRelative(5.86f)
                lineToRelative(-0.16f, 1.35f)
                curveToRelative(-0.18f, 1.51f, -1.46f, 2.65f, -2.98f, 2.65f)
                close()
                moveTo(8f, 8f)
                curveToRelative(1.86f, 0f, 3.41f, -1.28f, 3.86f, -3f)
                horizontalLineToRelative(9.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-9.14f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3f, -3.86f, -3f)
                curveToRelative(-2.06f, 0f, -6f, 1.56f, -6f, 4f)
                reflectiveCurveToRelative(3.94f, 4f, 6f, 4f)
                close()
                moveTo(8f, 2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                curveToRelative(-1.5f, 0f, -4f, -1.25f, -4f, -2f)
                reflectiveCurveToRelative(2.5f, -2f, 4f, -2f)
                close()
            }
        }.also { _LunchBox = it}
