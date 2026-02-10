package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TugrikSign: ImageVector? = null

val Icons.Ts.TugrikSign: ImageVector
    get() = _TugrikSign ?: UXIcon(name = "TugrikSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 1f)
                verticalLineTo(9.06f)
                lineToRelative(7.5f, -2.5f)
                verticalLineToRelative(1.05f)
                lineToRelative(-7.5f, 2.5f)
                verticalLineToRelative(3.39f)
                lineToRelative(7.5f, -2.5f)
                verticalLineToRelative(1.05f)
                lineToRelative(-7.5f, 2.5f)
                verticalLineToRelative(9.45f)
                horizontalLineToRelative(-1f)
                verticalLineTo(14.88f)
                lineToRelative(-7.5f, 2.5f)
                verticalLineToRelative(-1.05f)
                lineToRelative(7.5f, -2.5f)
                verticalLineToRelative(-3.39f)
                lineToRelative(-7.5f, 2.5f)
                verticalLineToRelative(-1.05f)
                lineToRelative(7.5f, -2.5f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                verticalLineTo(1f)
                horizontalLineTo(12.5f)
                close()
            }
        }.also { _TugrikSign = it}
