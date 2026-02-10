package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Rs.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(18f, 16.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                close()
                moveTo(9.52f, 22f)
                horizontalLineToRelative(-3.19f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.89f)
                lineToRelative(-1.68f, -15.11f)
                horizontalLineToRelative(14.65f)
                lineToRelative(-0.23f, 2.07f)
                curveToRelative(0.68f, 0.08f, 1.34f, 0.24f, 1.96f, 0.47f)
                lineToRelative(0.28f, -2.54f)
                horizontalLineToRelative(1.68f)
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
                horizontalLineToRelative(5.02f)
                curveToRelative(-0.71f, -0.57f, -1.32f, -1.24f, -1.83f, -2f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _TrashClock = it}
