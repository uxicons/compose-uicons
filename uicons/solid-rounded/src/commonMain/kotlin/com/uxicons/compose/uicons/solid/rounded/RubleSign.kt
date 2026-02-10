package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RubleSign: ImageVector? = null

val Icons.Sr.RubleSign: ImageVector
    get() = _RubleSign ?: UXIcon(name = "RubleSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 15f)
                curveToRelative(9.93f, -0.35f, 9.92f, -14.65f, 0f, -15f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-1.31f, 0.01f, -1.31f, 2.0f, 0f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineTo(15f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(7f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(7.27f, 0.23f, 7.26f, 10.77f, 0f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
            }
        }.also { _RubleSign = it}
