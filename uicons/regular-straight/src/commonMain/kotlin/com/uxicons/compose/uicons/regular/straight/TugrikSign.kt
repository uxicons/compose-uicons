package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TugrikSign: ImageVector? = null

val Icons.Rs.TugrikSign: ImageVector
    get() = _TugrikSign ?: UXIcon(name = "TugrikSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                verticalLineToRelative(6.89f)
                lineToRelative(7f, -2.33f)
                verticalLineToRelative(2.11f)
                lineToRelative(-7f, 2.33f)
                verticalLineToRelative(2.33f)
                lineToRelative(7f, -2.33f)
                verticalLineToRelative(2.11f)
                lineToRelative(-7f, 2.33f)
                verticalLineToRelative(8.56f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.89f)
                lineToRelative(-7f, 2.33f)
                verticalLineToRelative(-2.11f)
                lineToRelative(7f, -2.33f)
                verticalLineToRelative(-2.33f)
                lineToRelative(-7f, 2.33f)
                verticalLineToRelative(-2.11f)
                lineToRelative(7f, -2.33f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                close()
            }
        }.also { _TugrikSign = it}
