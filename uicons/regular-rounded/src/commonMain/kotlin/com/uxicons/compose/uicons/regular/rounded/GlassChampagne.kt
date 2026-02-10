package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Rr.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.09f)
                curveToRelative(3.39f, -0.49f, 6f, -3.42f, 6.0f, -7.02f)
                lineToRelative(-0.83f, -9.16f)
                curveToRelative(-0.14f, -1.55f, -1.43f, -2.73f, -2.99f, -2.73f)
                horizontalLineToRelative(-6.35f)
                curveToRelative(-1.56f, 0f, -2.85f, 1.17f, -2.99f, 2.73f)
                lineToRelative(-0.84f, 9.25f)
                curveToRelative(0f, 3.52f, 2.61f, 6.44f, 6f, 6.93f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8.83f, 2f)
                horizontalLineToRelative(6.35f)
                curveToRelative(0.52f, 0f, 0.95f, 0.39f, 1.0f, 0.91f)
                lineToRelative(0.19f, 2.09f)
                lineTo(7.64f, 5f)
                lineToRelative(0.19f, -2.09f)
                curveToRelative(0.05f, -0.52f, 0.47f, -0.91f, 1.0f, -0.91f)
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
