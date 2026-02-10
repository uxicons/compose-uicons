package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Tr.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 23.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(0.0f, -4.02f)
                curveToRelative(3.63f, -0.26f, 6.5f, -3.29f, 6.5f, -7.03f)
                lineToRelative(-0.8f, -9.22f)
                curveToRelative(-0.14f, -1.56f, -1.42f, -2.74f, -2.99f, -2.74f)
                horizontalLineToRelative(-6.42f)
                curveToRelative(-1.57f, 0f, -2.85f, 1.18f, -2.99f, 2.74f)
                lineToRelative(-0.8f, 9.26f)
                curveToRelative(0f, 3.69f, 2.87f, 6.72f, 6.5f, 6.98f)
                lineToRelative(-0.0f, 4.02f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(6.8f, 2.83f)
                curveToRelative(0.09f, -1.04f, 0.95f, -1.83f, 1.99f, -1.83f)
                horizontalLineToRelative(6.42f)
                curveToRelative(1.04f, 0f, 1.9f, 0.79f, 1.99f, 1.83f)
                lineToRelative(0.19f, 2.17f)
                lineTo(6.62f, 5f)
                lineToRelative(0.19f, -2.17f)
                close()
                moveTo(6.0f, 12.04f)
                lineToRelative(0.53f, -6.04f)
                horizontalLineToRelative(10.95f)
                lineToRelative(0.52f, 6.0f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6.0f, -5.96f)
                close()
            }
        }.also { _GlassChampagne = it}
