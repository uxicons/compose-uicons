package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Ts.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(-9f)
                curveTo(0f, 4.04f, 4.04f, 0f, 9f, 0f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(1f, 17f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveTo(13.41f, 1f, 9f, 1f)
                reflectiveCurveTo(1f, 4.59f, 1f, 9f)
                verticalLineToRelative(8f)
                close()
                moveTo(20.0f, 9.08f)
                curveToRelative(-0.0f, 0.38f, -0.03f, 0.76f, -0.07f, 1.13f)
                curveToRelative(1.85f, 1.26f, 3.07f, 3.38f, 3.07f, 5.79f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.4f, 0f, -4.53f, -1.22f, -5.79f, -3.07f)
                curveToRelative(-0.37f, 0.04f, -0.75f, 0.06f, -1.13f, 0.07f)
                curveToRelative(1.39f, 2.39f, 3.96f, 4.0f, 6.92f, 4.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.96f, -1.61f, -5.54f, -4.0f, -6.92f)
                close()
            }
        }.also { _Comments = it}
