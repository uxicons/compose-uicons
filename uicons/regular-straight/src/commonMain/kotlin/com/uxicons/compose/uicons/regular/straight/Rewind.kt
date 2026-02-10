package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rewind: ImageVector? = null

val Icons.Rs.Rewind: ImageVector
    get() = _Rewind ?: UXIcon(name = "Rewind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6.49f)
                lineTo(15f, 0.14f)
                lineTo(1.28f, 9.23f)
                lineToRelative(-0.03f, 0.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.88f)
                lineTo(15f, 23.94f)
                lineTo(15f, 17.52f)
                lineToRelative(9f, 6.43f)
                lineTo(24f, 0.06f)
                close()
                moveTo(22f, 20.06f)
                lineTo(13f, 13.63f)
                verticalLineToRelative(6.43f)
                lineTo(2.42f, 12.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -1.62f)
                lineTo(13f, 3.86f)
                verticalLineToRelative(6.51f)
                lineToRelative(9f, -6.43f)
                close()
            }
        }.also { _Rewind = it}
