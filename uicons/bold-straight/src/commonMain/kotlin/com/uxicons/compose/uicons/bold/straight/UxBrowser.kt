package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UxBrowser: ImageVector? = null

val Icons.Bs.UxBrowser: ImageVector
    get() = _UxBrowser ?: UXIcon(name = "UxBrowser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 20f)
                lineTo(3f, 20f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
                moveTo(4.5f, 14.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.33f)
                curveToRelative(0f, 0.64f, 0.36f, 1.17f, 1f, 1.17f)
                reflectiveCurveToRelative(1f, -0.52f, 1f, -1.17f)
                verticalLineToRelative(-4.33f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(12.5f, 18f)
                lineToRelative(2.21f, -4f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-2.21f, -3.99f)
                horizontalLineToRelative(2.57f)
                lineToRelative(0.92f, 1.67f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.92f, -1.67f)
                horizontalLineToRelative(2.57f)
                lineToRelative(-2.21f, 3.99f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(2.21f, 4f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(-0.93f, -1.68f)
                lineToRelative(-0.93f, 1.68f)
                horizontalLineToRelative(-2.57f)
                close()
            }
        }.also { _UxBrowser = it}
