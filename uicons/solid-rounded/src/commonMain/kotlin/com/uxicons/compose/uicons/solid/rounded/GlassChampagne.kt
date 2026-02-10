package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Sr.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.63f, 5f)
                lineToRelative(0.21f, -2.27f)
                curveToRelative(0.14f, -1.55f, 1.43f, -2.73f, 2.99f, -2.73f)
                horizontalLineToRelative(6.35f)
                curveToRelative(1.56f, 0f, 2.85f, 1.17f, 2.99f, 2.73f)
                lineToRelative(0.21f, 2.27f)
                lineTo(5.63f, 5f)
                close()
                moveTo(19.0f, 11.89f)
                lineToRelative(-0.45f, -4.89f)
                lineTo(5.45f, 7f)
                lineToRelative(-0.45f, 4.98f)
                curveToRelative(0f, 3.52f, 2.61f, 6.44f, 6f, 6.93f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.09f)
                curveToRelative(3.39f, -0.49f, 6f, -3.42f, 6.0f, -7.02f)
                close()
            }
        }.also { _GlassChampagne = it}
