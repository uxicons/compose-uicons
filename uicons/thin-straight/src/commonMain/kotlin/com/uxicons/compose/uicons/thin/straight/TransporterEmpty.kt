package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransporterEmpty: ImageVector? = null

val Icons.Ts.TransporterEmpty: ImageVector
    get() = _TransporterEmpty ?: UXIcon(name = "TransporterEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 23f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                close()
            }
        }.also { _TransporterEmpty = it}
