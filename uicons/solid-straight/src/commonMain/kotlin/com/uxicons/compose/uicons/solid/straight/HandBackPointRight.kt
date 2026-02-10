package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRight: ImageVector? = null

val Icons.Ss.HandBackPointRight: ImageVector
    get() = _HandBackPointRight ?: UXIcon(name = "HandBackPointRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 8.0f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.39f)
                lineToRelative(-3.02f, -3.12f)
                curveToRelative(-0.7f, -0.7f, -1.71f, -1.01f, -2.68f, -0.83f)
                curveToRelative(-0.62f, 0.13f, -1.2f, 0.44f, -1.64f, 0.9f)
                lineTo(0f, 8.0f)
                verticalLineToRelative(14f)
                horizontalLineTo(13.81f)
                lineToRelative(2.01f, -9f)
                horizontalLineToRelative(5.68f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _HandBackPointRight = it}
