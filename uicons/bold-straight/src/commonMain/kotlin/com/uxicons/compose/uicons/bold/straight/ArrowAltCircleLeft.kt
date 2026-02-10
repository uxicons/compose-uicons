package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Bs.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 10.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3.5f)
                lineToRelative(-4.63f, -4.24f)
                curveToRelative(-0.49f, -0.44f, -0.49f, -1.22f, 0f, -1.66f)
                lineToRelative(4.63f, -4.24f)
                verticalLineToRelative(3.63f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _ArrowAltCircleLeft = it}
