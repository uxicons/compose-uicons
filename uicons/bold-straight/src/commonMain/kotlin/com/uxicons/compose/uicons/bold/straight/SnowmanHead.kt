package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowmanHead: ImageVector? = null

val Icons.Bs.SnowmanHead: ImageVector
    get() = _SnowmanHead ?: UXIcon(name = "SnowmanHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                horizontalLineToRelative(-3f)
                lineTo(19f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(2f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.94f)
                curveToRelative(-0.61f, 1.23f, -0.94f, 2.6f, -0.94f, 4f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.4f, -0.32f, -2.77f, -0.94f, -4f)
                horizontalLineToRelative(1.94f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                lineTo(8f, 8f)
                lineTo(8f, 3.5f)
                close()
                moveTo(18f, 15f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.48f, 0.54f, -2.9f, 1.53f, -4f)
                horizontalLineToRelative(8.95f)
                curveToRelative(0.99f, 1.1f, 1.53f, 2.52f, 1.53f, 4f)
                close()
                moveTo(8.5f, 13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveToRelative(0f, 0.83f, -1.5f, 3.5f, -1.5f, 3.5f)
                curveToRelative(0f, 0f, -1.5f, -2.67f, -1.5f, -3.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SnowmanHead = it}
