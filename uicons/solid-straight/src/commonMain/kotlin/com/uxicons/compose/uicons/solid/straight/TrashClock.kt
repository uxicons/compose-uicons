package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Ss.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19.29f, 20.71f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(0.6f, 0f, 1.18f, 0.07f, 1.74f, 0.19f)
                lineToRelative(0.56f, -4.19f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(0f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1.7f, 15.33f)
                curveToRelative(0.17f, 1.52f, 1.45f, 2.67f, 2.98f, 2.67f)
                horizontalLineToRelative(6.38f)
                curveToRelative(-1.66f, -1.47f, -2.71f, -3.61f, -2.71f, -6f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _TrashClock = it}
