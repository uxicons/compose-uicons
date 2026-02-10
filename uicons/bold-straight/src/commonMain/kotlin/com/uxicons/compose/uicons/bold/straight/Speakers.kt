package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speakers: ImageVector? = null

val Icons.Bs.Speakers: ImageVector
    get() = _Speakers ?: UXIcon(name = "Speakers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 13f)
                curveToRelative(0.35f, 0f, 0.69f, 0.07f, 1f, 0.18f)
                verticalLineToRelative(5.63f)
                curveToRelative(-0.31f, 0.11f, -0.65f, 0.18f, -1f, 0.18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.37f, 0f, 0.7f, -0.11f, 1f, -0.28f)
                verticalLineToRelative(-3.44f)
                curveToRelative(-0.29f, -0.17f, -0.63f, -0.28f, -1f, -0.28f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-14f)
                lineTo(10f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(8f)
                lineTo(21f, 3f)
                close()
                moveTo(17f, 19f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveTo(17f, 9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                lineTo(3f, 21f)
                lineTo(3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(0f, -1.13f, 0.39f, -2.16f, 1.03f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                close()
            }
        }.also { _Speakers = it}
