package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FrancSign: ImageVector? = null

val Icons.Bs.FrancSign: ImageVector
    get() = _FrancSign ?: UXIcon(name = "FrancSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(4f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(14.5f)
                verticalLineTo(3f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }.also { _FrancSign = it}
