package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignalArrow: ImageVector? = null

val Icons.Ss.DirectionSignalArrow: ImageVector
    get() = _DirectionSignalArrow ?: UXIcon(name = "DirectionSignalArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 10.59f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.75f, 2.75f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.12f, 0f, -2.16f, 0.37f, -3f, 1.0f)
                verticalLineTo(3f)
                lineToRelative(2.75f, 2.75f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.75f, -2.75f)
                verticalLineToRelative(13.0f)
                curveToRelative(-0.84f, -0.63f, -1.88f, -1.0f, -3f, -1.0f)
                horizontalLineTo(3f)
                lineToRelative(2.75f, -2.75f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.75f, 3.75f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.75f, -2.75f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5f)
                lineToRelative(-2.75f, 2.75f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _DirectionSignalArrow = it}
