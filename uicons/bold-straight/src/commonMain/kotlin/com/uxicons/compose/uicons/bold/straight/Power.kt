package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Bs.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2.76f)
                verticalLineTo(6.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                verticalLineTo(2.76f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Power = it}
