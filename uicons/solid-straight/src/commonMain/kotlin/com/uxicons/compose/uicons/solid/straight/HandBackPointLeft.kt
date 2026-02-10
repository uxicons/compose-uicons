package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointLeft: ImageVector? = null

val Icons.Ss.HandBackPointLeft: ImageVector
    get() = _HandBackPointLeft ?: UXIcon(name = "HandBackPointLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.95f, 2.95f)
                curveToRelative(-0.44f, -0.46f, -1.01f, -0.77f, -1.64f, -0.9f)
                curveToRelative(-0.98f, -0.18f, -1.98f, 0.12f, -2.68f, 0.83f)
                lineToRelative(-3.02f, 3.12f)
                horizontalLineToRelative(5.39f)
                verticalLineToRelative(2f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.68f)
                lineToRelative(2.01f, 9f)
                horizontalLineToRelative(13.81f)
                verticalLineTo(8f)
                lineToRelative(-5.04f, -5.05f)
                close()
            }
        }.also { _HandBackPointLeft = it}
