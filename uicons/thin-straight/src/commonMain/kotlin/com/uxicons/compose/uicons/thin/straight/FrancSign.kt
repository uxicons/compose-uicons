package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FrancSign: ImageVector? = null

val Icons.Ts.FrancSign: ImageVector
    get() = _FrancSign ?: UXIcon(name = "FrancSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(14.5f)
                verticalLineTo(1f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _FrancSign = it}
