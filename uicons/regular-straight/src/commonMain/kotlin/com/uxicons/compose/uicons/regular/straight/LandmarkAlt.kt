package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandmarkAlt: ImageVector? = null

val Icons.Rs.LandmarkAlt: ImageVector
    get() = _LandmarkAlt ?: UXIcon(name = "LandmarkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(24f, 22f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                verticalLineToRelative(-2f)
                lineTo(3f, 18f)
                verticalLineToRelative(-6f)
                lineTo(1f, 12f)
                verticalLineToRelative(-2f)
                lineTo(3.06f, 10f)
                curveToRelative(0.46f, -4.17f, 3.78f, -7.48f, 7.94f, -7.94f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2.06f)
                curveToRelative(4.17f, 0.46f, 7.48f, 3.78f, 7.94f, 7.94f)
                horizontalLineToRelative(2.06f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10f, 12f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5.07f, 10f)
                horizontalLineToRelative(13.86f)
                curveToRelative(-0.49f, -3.39f, -3.41f, -6f, -6.93f, -6f)
                reflectiveCurveToRelative(-6.44f, 2.61f, -6.93f, 6f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _LandmarkAlt = it}
