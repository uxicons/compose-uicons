package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Ss.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.05f, 18f)
                lineToRelative(-1.54f, 5.67f)
                lineTo(0.17f, 18.69f)
                lineTo(3f, 8.28f)
                verticalLineToRelative(9.72f)
                lineTo(20.05f, 18f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(13f)
                lineTo(5f, 16f)
                lineTo(5f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 4.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(22f, 2.77f)
                lineToRelative(-6.11f, 6.11f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.59f, 5.59f)
                verticalLineToRelative(2.83f)
                lineToRelative(5.59f, -5.59f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(6.11f, -6.11f)
                lineTo(22f, 2.77f)
                close()
            }
        }.also { _Images = it}
