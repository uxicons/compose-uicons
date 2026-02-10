package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModeAlt: ImageVector? = null

val Icons.Rc.ModeAlt: ImageVector
    get() = _ModeAlt ?: UXIcon(name = "ModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.53f, 0f, -8f, 2.47f, -8f, 8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 5.53f, 2.47f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -2.47f, 8f, -8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -5.53f, -2.47f, -8f, -8f, -8f)
                close()
                moveTo(18f, 15f)
                curveToRelative(0f, 4.43f, -1.57f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.57f, -6f, -6f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -4.43f, 1.57f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.57f, 6f, 6f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-2.69f, 0f, -4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                reflectiveCurveToRelative(-1.31f, -4f, -4f, -4f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.59f, 0f, -2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                close()
            }
        }.also { _ModeAlt = it}
