package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _U: ImageVector? = null

val Icons.Rs.U: ImageVector
    get() = _U ?: UXIcon(name = "U") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(14f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _U = it}
