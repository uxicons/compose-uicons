package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Ts.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                verticalLineToRelative(1f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(12f)
                lineTo(0f, 13.33f)
                verticalLineToRelative(-1f)
                lineToRelative(4f, -1.33f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(10.67f)
                lineToRelative(11f, -3.67f)
                verticalLineToRelative(1f)
                lineToRelative(-11f, 3.67f)
                verticalLineToRelative(9.83f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.5f)
                close()
            }
        }.also { _LitecoinSign = it}
