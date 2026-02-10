package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mockup: ImageVector? = null

val Icons.Ss.Mockup: ImageVector
    get() = _Mockup ?: UXIcon(name = "Mockup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14f)
                lineToRelative(10f, 3.42f)
                lineToRelative(-4.47f, 2.11f)
                lineToRelative(-2.11f, 4.47f)
                lineToRelative(-3.42f, -10f)
                close()
                moveTo(3f, 24f)
                lineTo(3f, 7.72f)
                lineTo(0f, 6.72f)
                lineTo(0f, 0f)
                lineTo(8.48f, 0f)
                lineToRelative(0.24f, 0.67f)
                curveToRelative(0.5f, 1.4f, 1.82f, 2.33f, 3.28f, 2.33f)
                reflectiveCurveToRelative(2.79f, -0.94f, 3.28f, -2.33f)
                lineToRelative(0.24f, -0.67f)
                horizontalLineToRelative(8.48f)
                lineTo(24f, 6.72f)
                lineToRelative(-3f, 1f)
                verticalLineToRelative(6.9f)
                lineToRelative(-11.21f, -3.84f)
                lineToRelative(4.52f, 13.21f)
                lineTo(3f, 23.99f)
                close()
                moveTo(14f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(18f, 7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(6f, 7f)
                verticalLineToRelative(4f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Mockup = it}
