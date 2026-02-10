package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr0: ImageVector? = null

val Icons.Tr.Tr0: ImageVector
    get() = _Tr0 ?: UXIcon(name = "Tr0") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineTo(8f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                verticalLineTo(8f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
            }
        }.also { _Tr0 = it}
