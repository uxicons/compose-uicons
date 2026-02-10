package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignalArrow: ImageVector? = null

val Icons.Bs.DirectionSignalArrow: ImageVector
    get() = _DirectionSignalArrow ?: UXIcon(name = "DirectionSignalArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.54f)
                curveToRelative(0f, 0.67f, -0.26f, 1.29f, -0.73f, 1.77f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.9f, -1.9f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.46f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0f, -3.54f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.9f, 1.9f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.9f, 0f, 1.75f, 0.22f, 2.5f, 0.6f)
                verticalLineTo(4.71f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.97f, -0.97f, 2.56f, -0.97f, 3.54f, 0f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.9f, -1.9f)
                verticalLineToRelative(6.94f)
                curveToRelative(0.75f, -0.39f, 1.6f, -0.6f, 2.5f, -0.6f)
                horizontalLineToRelative(3.29f)
                lineToRelative(-1.9f, -1.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                close()
            }
        }.also { _DirectionSignalArrow = it}
