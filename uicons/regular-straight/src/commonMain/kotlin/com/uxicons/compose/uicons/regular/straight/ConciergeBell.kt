package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Rs.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -5.73f, -4.4f, -10.45f, -10f, -10.95f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                horizontalLineToRelative(-6f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.05f)
                curveTo(5.4f, 5.55f, 1f, 10.27f, 1f, 16f)
                verticalLineToRelative(3f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(13f)
                close()
                moveTo(3f, 16f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ConciergeBell = it}
