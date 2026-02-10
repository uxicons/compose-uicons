package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleUp: ImageVector? = null

val Icons.Ts.ArrowAltCircleUp: ImageVector
    get() = _ArrowAltCircleUp ?: UXIcon(name = "ArrowAltCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(13.27f, 6.54f)
                curveToRelative(-0.61f, -0.68f, -1.79f, -0.68f, -2.4f, -0.0f)
                lineToRelative(-5f, 5.46f)
                horizontalLineToRelative(5.63f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5.77f)
                lineToRelative(-5f, -5.46f)
                close()
                moveTo(11.61f, 7.21f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.24f, -0.26f, 0.68f, -0.27f, 0.92f, 0.0f)
                lineToRelative(3.47f, 3.79f)
                horizontalLineToRelative(-7.86f)
                lineToRelative(3.47f, -3.79f)
                close()
            }
        }.also { _ArrowAltCircleUp = it}
