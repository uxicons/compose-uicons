package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Bs.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.4f, 0f)
                lineTo(2.02f, 5.15f)
                curveToRelative(-1.36f, 1.36f, -1.36f, 3.58f, 0f, 4.95f)
                lineToRelative(3.98f, 3.98f)
                verticalLineToRelative(5.94f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3.83f)
                lineToRelative(8f, -2f)
                lineTo(22f, 0.02f)
                lineTo(7.4f, 0f)
                close()
                moveTo(19f, 11.84f)
                lineToRelative(-8f, 2f)
                verticalLineToRelative(6.17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(9f, 8.01f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.82f)
                lineToRelative(-1.85f, -1.85f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, -0.02f, -0.69f)
                lineTo(8.6f, 3f)
                lineToRelative(10.4f, 0.01f)
                lineTo(19f, 11.84f)
                close()
            }
        }.also { _HandBackPointDown = it}
