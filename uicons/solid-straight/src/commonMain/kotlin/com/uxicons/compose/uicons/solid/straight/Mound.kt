package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Ss.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1.78f)
                lineToRelative(6.68f, -12.08f)
                curveToRelative(1.09f, -1.97f, 3.08f, -3.14f, 5.32f, -3.14f)
                reflectiveCurveToRelative(4.24f, 1.17f, 5.32f, 3.14f)
                lineToRelative(6.68f, 12.08f)
                verticalLineToRelative(1.78f)
                close()
            }
        }.also { _Mound = it}
