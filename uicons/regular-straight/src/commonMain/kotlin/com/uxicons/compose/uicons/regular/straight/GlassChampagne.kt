package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Rs.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 18.9f)
                curveToRelative(3.39f, -0.49f, 6f, -3.41f, 6.0f, -7.01f)
                lineToRelative(-1.08f, -11.89f)
                lineTo(6.09f, -0f)
                lineToRelative(-1.09f, 11.98f)
                curveToRelative(0f, 3.52f, 2.61f, 6.43f, 6f, 6.92f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.1f)
                close()
                moveTo(16.09f, 2f)
                lineToRelative(0.27f, 3f)
                lineTo(7.64f, 5f)
                lineToRelative(0.27f, -3f)
                horizontalLineToRelative(8.17f)
                close()
                moveTo(7.0f, 12.07f)
                lineToRelative(0.46f, -5.07f)
                horizontalLineToRelative(9.09f)
                lineToRelative(0.46f, 4.98f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5.0f, -4.91f)
                close()
            }
        }.also { _GlassChampagne = it}
