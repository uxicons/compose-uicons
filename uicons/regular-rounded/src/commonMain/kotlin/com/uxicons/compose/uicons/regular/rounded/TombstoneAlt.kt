package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TombstoneAlt: ImageVector? = null

val Icons.Rr.TombstoneAlt: ImageVector
    get() = _TombstoneAlt ?: UXIcon(name = "TombstoneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-12f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(4f, 10f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                verticalLineToRelative(12f)
                horizontalLineTo(4f)
                verticalLineToRelative(-12f)
                close()
            }
        }.also { _TombstoneAlt = it}
