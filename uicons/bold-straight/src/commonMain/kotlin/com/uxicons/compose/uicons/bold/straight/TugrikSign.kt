package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TugrikSign: ImageVector? = null

val Icons.Bs.TugrikSign: ImageVector
    get() = _TugrikSign ?: UXIcon(name = "TugrikSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 3f)
                verticalLineToRelative(5.66f)
                lineToRelative(6.5f, -2.17f)
                verticalLineToRelative(3.17f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(2.33f)
                lineToRelative(6.5f, -2.17f)
                verticalLineToRelative(3.17f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(6.67f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.67f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(-3.17f)
                lineToRelative(6.5f, -2.17f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-6.5f, 2.17f)
                verticalLineToRelative(-3.17f)
                lineToRelative(6.5f, -2.17f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                verticalLineTo(3f)
                horizontalLineTo(13.5f)
                close()
            }
        }.also { _TugrikSign = it}
