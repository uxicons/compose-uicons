package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _It: ImageVector? = null

val Icons.Bs.It: ImageVector
    get() = _It ?: UXIcon(name = "It") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(6.5f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(18f)
                lineTo(21f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-10.5f)
                close()
                moveTo(6.05f, 7.7f)
                lineToRelative(1.52f, -0.88f)
                curveToRelative(-0.05f, -0.27f, -0.07f, -0.54f, -0.07f, -0.82f)
                reflectiveCurveToRelative(0.03f, -0.55f, 0.07f, -0.82f)
                lineToRelative(-1.52f, -0.88f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.52f, 0.88f)
                curveToRelative(0.42f, -0.36f, 0.9f, -0.64f, 1.43f, -0.83f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.76f)
                curveToRelative(0.53f, 0.19f, 1.01f, 0.47f, 1.43f, 0.83f)
                lineToRelative(1.52f, -0.88f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(-1.52f, 0.88f)
                curveToRelative(0.05f, 0.27f, 0.07f, 0.54f, 0.07f, 0.82f)
                reflectiveCurveToRelative(-0.03f, 0.55f, -0.07f, 0.82f)
                lineToRelative(1.52f, 0.88f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(-1.52f, -0.88f)
                curveToRelative(-0.42f, 0.36f, -0.9f, 0.64f, -1.43f, 0.83f)
                verticalLineToRelative(1.76f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.76f)
                curveToRelative(-0.53f, -0.19f, -1.01f, -0.47f, -1.43f, -0.83f)
                lineToRelative(-1.52f, 0.88f)
                lineToRelative(-1.5f, -2.6f)
                close()
                moveTo(10.5f, 6f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _It = it}
