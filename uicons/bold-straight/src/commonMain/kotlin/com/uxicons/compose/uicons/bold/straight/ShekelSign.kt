package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShekelSign: ImageVector? = null

val Icons.Bs.ShekelSign: ImageVector
    get() = _ShekelSign ?: UXIcon(name = "ShekelSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 24f)
                horizontalLineTo(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(4f)
                verticalLineTo(24f)
                close()
                moveTo(23f, 15.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(15.5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                verticalLineTo(24f)
                horizontalLineToRelative(7.5f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                close()
            }
        }.also { _ShekelSign = it}
