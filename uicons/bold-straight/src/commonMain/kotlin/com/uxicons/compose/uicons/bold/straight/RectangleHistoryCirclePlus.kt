package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHistoryCirclePlus: ImageVector? = null

val Icons.Bs.RectangleHistoryCirclePlus: ImageVector
    get() = _RectangleHistoryCirclePlus ?: UXIcon(name = "RectangleHistoryCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.72f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(-2.52f, 0f, -4.77f, 1.17f, -6.24f, 3f)
                lineTo(3.5f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.59f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.19f, 2.13f, 3f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                lineTo(18f, 0f)
                close()
            }
        }.also { _RectangleHistoryCirclePlus = it}
