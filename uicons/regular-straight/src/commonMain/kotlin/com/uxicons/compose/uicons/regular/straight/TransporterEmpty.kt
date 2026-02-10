package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransporterEmpty: ImageVector? = null

val Icons.Rs.TransporterEmpty: ImageVector
    get() = _TransporterEmpty ?: UXIcon(name = "TransporterEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                close()
            }
        }.also { _TransporterEmpty = it}
