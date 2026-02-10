package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleRight: ImageVector? = null

val Icons.Rs.ArrowAltCircleRight: ImageVector
    get() = _ArrowAltCircleRight ?: UXIcon(name = "ArrowAltCircleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(17.63f, 12.9f)
                lineToRelative(-4.63f, 4.24f)
                verticalLineToRelative(-4.13f)
                lineTo(6f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                lineTo(13f, 7f)
                lineToRelative(4.63f, 4.24f)
                curveToRelative(0.49f, 0.44f, 0.49f, 1.22f, 0f, 1.66f)
                close()
            }
        }.also { _ArrowAltCircleRight = it}
