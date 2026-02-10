package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Ss.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11f)
                verticalLineToRelative(-2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3f)
                curveTo(1f, 10.27f, 5.4f, 5.56f, 11f, 5.05f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(1f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                curveToRelative(5.6f, 0.51f, 10f, 5.22f, 10f, 10.95f)
                verticalLineToRelative(3f)
                horizontalLineTo(13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                close()
            }
        }.also { _ConciergeBell = it}
