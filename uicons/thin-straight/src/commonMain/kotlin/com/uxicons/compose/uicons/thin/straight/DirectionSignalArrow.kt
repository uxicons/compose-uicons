package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignalArrow: ImageVector? = null

val Icons.Ts.DirectionSignalArrow: ImageVector
    get() = _DirectionSignalArrow ?: UXIcon(name = "DirectionSignalArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.56f, 12.56f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.6f, -3.6f)
                horizontalLineToRelative(-6.71f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(1.29f)
                lineToRelative(3.6f, 3.6f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.6f, 3.6f)
                horizontalLineToRelative(6.71f)
                curveToRelative(1.41f, 0f, 2.67f, 0.65f, 3.5f, 1.68f)
                verticalLineTo(1.29f)
                lineToRelative(-3.6f, 3.6f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(10.94f, 0.44f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.6f, -3.6f)
                verticalLineToRelative(11.38f)
                curveToRelative(0.83f, -1.02f, 2.09f, -1.68f, 3.5f, -1.68f)
                horizontalLineToRelative(6.71f)
                lineToRelative(-3.6f, -3.6f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                close()
            }
        }.also { _DirectionSignalArrow = it}
