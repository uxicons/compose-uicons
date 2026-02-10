package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rewind: ImageVector? = null

val Icons.Ss.Rewind: ImageVector
    get() = _Rewind ?: UXIcon(name = "Rewind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6.49f)
                verticalLineTo(0.14f)
                lineTo(1.28f, 9.23f)
                lineToRelative(-0.03f, 0.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.88f)
                lineTo(15f, 23.94f)
                verticalLineTo(17.52f)
                lineToRelative(9f, 6.43f)
                verticalLineTo(0.06f)
                close()
            }
        }.also { _Rewind = it}
