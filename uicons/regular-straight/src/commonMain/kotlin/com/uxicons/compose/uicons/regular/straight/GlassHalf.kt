package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassHalf: ImageVector? = null

val Icons.Rs.GlassHalf: ImageVector
    get() = _GlassHalf ?: UXIcon(name = "GlassHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.11f, 0f)
                lineToRelative(1.75f, 21.25f)
                curveToRelative(0.13f, 1.54f, 1.44f, 2.75f, 2.99f, 2.75f)
                horizontalLineToRelative(12.18f)
                curveToRelative(1.57f, 0f, 2.85f, -1.18f, 2.99f, -2.74f)
                lineTo(22.89f, 0f)
                lineTo(1.11f, 0f)
                close()
                moveTo(18.03f, 22f)
                lineTo(5.85f, 22f)
                curveToRelative(-0.52f, 0f, -0.95f, -0.4f, -1.0f, -0.92f)
                lineToRelative(-0.67f, -8.08f)
                horizontalLineToRelative(15.55f)
                lineToRelative(-0.71f, 8.09f)
                curveToRelative(-0.05f, 0.52f, -0.47f, 0.91f, -1.0f, 0.91f)
                close()
                moveTo(19.91f, 11f)
                lineTo(4.02f, 11f)
                lineToRelative(-0.74f, -9f)
                horizontalLineToRelative(17.42f)
                lineToRelative(-0.79f, 9f)
                close()
            }
        }.also { _GlassHalf = it}
