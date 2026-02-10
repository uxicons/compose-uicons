package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Bs.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 18.84f)
                curveToRelative(3.14f, -0.69f, 5.5f, -3.49f, 5.5f, -6.84f)
                lineToRelative(-1.14f, -12f)
                lineTo(6.14f, 0f)
                lineToRelative(-1.14f, 12f)
                curveToRelative(0f, 3.35f, 2.36f, 6.15f, 5.5f, 6.84f)
                verticalLineToRelative(2.16f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.16f)
                close()
                moveTo(15.14f, 3f)
                lineToRelative(0.19f, 2f)
                horizontalLineToRelative(-6.65f)
                lineToRelative(0.19f, -2f)
                horizontalLineToRelative(6.27f)
                close()
                moveTo(8f, 12.06f)
                lineToRelative(0.39f, -4.07f)
                horizontalLineToRelative(7.22f)
                lineToRelative(0.39f, 4.07f)
                curveToRelative(-0.04f, 2.18f, -1.82f, 3.94f, -4f, 3.94f)
                reflectiveCurveToRelative(-3.96f, -1.76f, -4f, -3.94f)
                close()
            }
        }.also { _GlassChampagne = it}
