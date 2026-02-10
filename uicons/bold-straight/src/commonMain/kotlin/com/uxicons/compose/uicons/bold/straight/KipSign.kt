package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KipSign: ImageVector? = null

val Icons.Bs.KipSign: ImageVector
    get() = _KipSign ?: UXIcon(name = "KipSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.35f, 24f)
                lineTo(7f, 15.72f)
                verticalLineToRelative(8.28f)
                horizontalLineToRelative(-3f)
                verticalLineTo(14.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(10.02f)
                lineTo(17.73f, 0f)
                horizontalLineToRelative(4.4f)
                lineTo(9.81f, 11.5f)
                horizontalLineToRelative(12.19f)
                verticalLineToRelative(3f)
                horizontalLineTo(10.28f)
                lineToRelative(11.88f, 9.5f)
                horizontalLineToRelative(-4.8f)
                close()
            }
        }.also { _KipSign = it}
