package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHistoryCirclePlus: ImageVector? = null

val Icons.Ss.RectangleHistoryCirclePlus: ImageVector
    get() = _RectangleHistoryCirclePlus ?: UXIcon(name = "RectangleHistoryCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 2f)
                lineTo(6f, 2f)
                lineTo(6f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
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
                moveTo(10f, 18f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                lineTo(3f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(12.72f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
            }
        }.also { _RectangleHistoryCirclePlus = it}
