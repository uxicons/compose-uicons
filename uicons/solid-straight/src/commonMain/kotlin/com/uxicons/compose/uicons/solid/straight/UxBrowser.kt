package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UxBrowser: ImageVector? = null

val Icons.Ss.UxBrowser: ImageVector
    get() = _UxBrowser ?: UXIcon(name = "UxBrowser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                lineTo(0f, 10f)
                close()
                moveTo(11.6f, 17.2f)
                curveToRelative(0f, 1.54f, -1.26f, 2.8f, -2.8f, 2.8f)
                reflectiveCurveToRelative(-2.8f, -1.26f, -2.8f, -2.8f)
                verticalLineToRelative(-4.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.2f)
                curveToRelative(0f, 0.66f, 0.54f, 1.2f, 1.2f, 1.2f)
                reflectiveCurveToRelative(1.2f, -0.54f, 1.2f, -1.2f)
                verticalLineToRelative(-4.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(4.2f)
                close()
                moveTo(18.3f, 20f)
                horizontalLineToRelative(-1.83f)
                lineToRelative(-1.01f, -1.85f)
                lineToRelative(-1.03f, 1.85f)
                horizontalLineToRelative(-1.83f)
                lineToRelative(1.94f, -3.5f)
                lineToRelative(-1.94f, -3.5f)
                horizontalLineToRelative(1.83f)
                lineToRelative(1.03f, 1.85f)
                lineToRelative(1.01f, -1.85f)
                horizontalLineToRelative(1.83f)
                lineToRelative(-1.93f, 3.5f)
                lineToRelative(1.93f, 3.5f)
                close()
            }
        }.also { _UxBrowser = it}
