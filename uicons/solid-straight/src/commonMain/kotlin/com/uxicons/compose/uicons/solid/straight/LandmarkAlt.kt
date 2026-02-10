package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandmarkAlt: ImageVector? = null

val Icons.Ss.LandmarkAlt: ImageVector
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
                curveToRelative(0.46f, -4.16f, 3.78f, -7.48f, 7.94f, -7.94f)
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
                moveTo(5f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _LandmarkAlt = it}
