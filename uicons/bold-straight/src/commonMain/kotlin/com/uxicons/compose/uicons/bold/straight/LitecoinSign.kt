package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Bs.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(7.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.39f)
                lineTo(0f, 14.44f)
                verticalLineToRelative(-3.17f)
                lineToRelative(4f, -1.33f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(8.94f)
                lineToRelative(9f, -3f)
                verticalLineToRelative(3.17f)
                lineToRelative(-9f, 3f)
                verticalLineToRelative(8.39f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(14.5f)
                close()
            }
        }.also { _LitecoinSign = it}
