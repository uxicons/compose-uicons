package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Ss.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 18.9f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(7f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-3.39f, -0.49f, -6f, -3.4f, -6f, -6.92f)
                lineToRelative(0.45f, -4.98f)
                horizontalLineToRelative(13.1f)
                lineToRelative(0.45f, 4.89f)
                curveToRelative(0.0f, 3.6f, -2.61f, 6.52f, -6.0f, 7.01f)
                close()
                moveTo(18.37f, 5f)
                lineToRelative(-0.46f, -5f)
                lineTo(6.09f, -0f)
                lineToRelative(-0.45f, 5f)
                horizontalLineToRelative(12.73f)
                close()
            }
        }.also { _GlassChampagne = it}
