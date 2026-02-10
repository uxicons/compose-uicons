package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Presentation: ImageVector? = null

val Icons.Ts.Presentation: ImageVector
    get() = _Presentation ?: UXIcon(name = "Presentation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                horizontalLineTo(3f)
                verticalLineTo(2.5f)
                close()
            }
        }.also { _Presentation = it}
