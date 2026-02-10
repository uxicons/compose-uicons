package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UkCountryCode: ImageVector? = null

val Icons.Ss.UkCountryCode: ImageVector
    get() = _UkCountryCode ?: UXIcon(name = "UkCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11.1f, 13.7f)
                curveToRelative(0f, 1.27f, -1.03f, 2.3f, -2.3f, 2.3f)
                reflectiveCurveToRelative(-2.3f, -1.03f, -2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 0.39f, 0.31f, 0.7f, 0.7f, 0.7f)
                reflectiveCurveToRelative(0.7f, -0.31f, 0.7f, -0.7f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(17.5f, 16f)
                horizontalLineToRelative(-1.74f)
                lineToRelative(-1.17f, -3f)
                horizontalLineToRelative(-0.48f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.48f)
                lineToRelative(1.17f, -3f)
                horizontalLineToRelative(1.74f)
                lineToRelative(-1.5f, 4f)
                close()
            }
        }.also { _UkCountryCode = it}
