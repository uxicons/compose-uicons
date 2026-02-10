package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassChampagne: ImageVector? = null

val Icons.Br.GlassChampagne: ImageVector
    get() = _GlassChampagne ?: UXIcon(name = "GlassChampagne") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.5f, 21f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2.17f)
            curveToRelative(3.14f, -0.69f, 5.5f, -3.49f, 5.5f, -6.83f)
            curveToRelative(0f, -0.05f, -0.83f, -8.83f, -0.83f, -8.83f)
            curveToRelative(-0.17f, -1.81f, -1.67f, -3.17f, -3.48f, -3.17f)
            horizontalLineToRelative(-5.36f)
            curveToRelative(-1.81f, 0f, -3.31f, 1.36f, -3.48f, 3.17f)
            curveToRelative(0f, 0f, -0.83f, 8.78f, -0.83f, 8.83f)
            curveToRelative(0f, 3.35f, 2.36f, 6.14f, 5.5f, 6.83f)
            verticalLineToRelative(2.17f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9.32f, 3f)
            horizontalLineToRelative(5.36f)
            curveToRelative(0.26f, 0f, 0.47f, 0.19f, 0.5f, 0.45f)
            lineToRelative(0.15f, 1.55f)
            horizontalLineToRelative(-6.65f)
            lineToRelative(0.15f, -1.55f)
            curveToRelative(0.02f, -0.26f, 0.24f, -0.45f, 0.5f, -0.45f)
            close()
            moveTo(8f, 12.07f)
            lineToRelative(0.39f, -4.07f)
            horizontalLineToRelative(7.22f)
            lineToRelative(0.39f, 4.07f)
            curveToRelative(-0.04f, 2.17f, -1.82f, 3.93f, -4f, 3.93f)
            reflectiveCurveToRelative(-3.96f, -1.76f, -4f, -3.93f)
            close()
        }
    }.also { _GlassChampagne = it }
