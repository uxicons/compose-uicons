package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Ss.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 0f)
                lineTo(2.95f, 5.04f)
                curveToRelative(-0.46f, 0.44f, -0.77f, 1.01f, -0.9f, 1.64f)
                curveToRelative(-0.18f, 0.98f, 0.12f, 1.98f, 0.83f, 2.68f)
                lineToRelative(3.12f, 3.02f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-5.68f)
                lineToRelative(9f, -2.01f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                close()
            }
        }.also { _HandBackPointDown = it}
