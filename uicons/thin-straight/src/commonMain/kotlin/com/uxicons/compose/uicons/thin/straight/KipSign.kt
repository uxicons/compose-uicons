package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KipSign: ImageVector? = null

val Icons.Ts.KipSign: ImageVector
    get() = _KipSign ?: UXIcon(name = "KipSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13.5f)
                horizontalLineTo(7.43f)
                lineToRelative(13.15f, 10.5f)
                horizontalLineToRelative(-1.6f)
                lineTo(6f, 13.64f)
                verticalLineToRelative(10.36f)
                horizontalLineToRelative(-1f)
                verticalLineTo(13.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(12.31f)
                lineTo(19.15f, 0f)
                horizontalLineToRelative(1.47f)
                lineTo(7.27f, 12.5f)
                horizontalLineToRelative(14.73f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _KipSign = it}
