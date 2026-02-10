package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandmarkAlt: ImageVector? = null

val Icons.Bs.LandmarkAlt: ImageVector
    get() = _LandmarkAlt ?: UXIcon(name = "LandmarkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(24f, 21f)
                close()
                moveTo(23f, 19f)
                lineTo(1f, 19f)
                verticalLineToRelative(-3f)
                lineTo(3f, 16f)
                verticalLineToRelative(-5f)
                lineTo(1f, 11f)
                verticalLineToRelative(-3f)
                lineTo(3.35f, 8f)
                curveToRelative(0.95f, -3.28f, 3.72f, -5.8f, 7.15f, -6.37f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 1.63f)
                curveToRelative(3.42f, 0.58f, 6.2f, 3.09f, 7.15f, 6.37f)
                horizontalLineToRelative(2.35f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(11f, 11f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(6.55f, 8f)
                horizontalLineToRelative(10.91f)
                curveToRelative(-0.95f, -2.06f, -3.04f, -3.5f, -5.45f, -3.5f)
                reflectiveCurveToRelative(-4.5f, 1.44f, -5.45f, 3.5f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _LandmarkAlt = it}
