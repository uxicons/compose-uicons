package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Ss.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4.06f)
                lineToRelative(-4.63f, -4.24f)
                curveToRelative(-0.49f, -0.44f, -0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(4.63f, -4.24f)
                verticalLineToRelative(4.08f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ArrowAltCircleLeft = it}
