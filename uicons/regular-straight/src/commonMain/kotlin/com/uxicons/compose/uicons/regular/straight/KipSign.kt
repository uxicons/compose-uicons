package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KipSign: ImageVector? = null

val Icons.Rs.KipSign: ImageVector
    get() = _KipSign ?: UXIcon(name = "KipSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                horizontalLineTo(8.85f)
                lineToRelative(12.5f, 10f)
                horizontalLineToRelative(-3.2f)
                lineTo(7f, 15.08f)
                verticalLineToRelative(8.92f)
                horizontalLineToRelative(-2f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(10.7f)
                lineTo(18.46f, 0f)
                horizontalLineToRelative(2.93f)
                lineTo(8.54f, 12f)
                horizontalLineToRelative(13.46f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _KipSign = it}
