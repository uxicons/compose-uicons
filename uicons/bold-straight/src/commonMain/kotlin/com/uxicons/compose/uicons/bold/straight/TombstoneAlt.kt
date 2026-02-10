package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TombstoneAlt: ImageVector? = null

val Icons.Bs.TombstoneAlt: ImageVector
    get() = _TombstoneAlt ?: UXIcon(name = "TombstoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                verticalLineToRelative(-11f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                verticalLineToRelative(11f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(11f)
                horizontalLineTo(5f)
                verticalLineToRelative(-11f)
                close()
            }
        }.also { _TombstoneAlt = it}
