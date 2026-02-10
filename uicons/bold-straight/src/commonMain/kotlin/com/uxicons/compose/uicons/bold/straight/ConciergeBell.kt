package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Bs.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -6.11f, -4.59f, -11.17f, -10.5f, -11.91f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-6f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.09f)
                curveTo(4.59f, 5.83f, 0f, 10.89f, 0f, 17f)
                verticalLineToRelative(2f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(12f, 8f)
                curveToRelative(4.62f, 0f, 8.45f, 3.51f, 8.95f, 8f)
                horizontalLineTo(3.06f)
                curveToRelative(0.5f, -4.49f, 4.32f, -8f, 8.95f, -8f)
                close()
            }
        }.also { _ConciergeBell = it}
