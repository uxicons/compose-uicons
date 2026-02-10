package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podium: ImageVector? = null

val Icons.Ss.Podium: ImageVector
    get() = _Podium ?: UXIcon(name = "Podium") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                horizontalLineTo(4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(2.15f)
                lineToRelative(2f, 12f)
                horizontalLineToRelative(15.69f)
                lineToRelative(2f, -12f)
                horizontalLineToRelative(2.15f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Podium = it}
