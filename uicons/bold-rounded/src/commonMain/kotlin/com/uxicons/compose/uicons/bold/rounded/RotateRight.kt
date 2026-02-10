package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateRight: ImageVector? = null

val Icons.Br.RotateRight: ImageVector
    get() = _RotateRight ?: UXIcon(name = "RotateRight", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(478.29f, 255.49f)
            curveToRelative(-16.13f, 0.14f, -29.69f, 12.16f, -31.76f, 28.16f)
            curveToRelative(-15.37f, 105.01f, -112.96f, 177.68f, -217.98f, 162.32f)
            reflectiveCurveTo(50.87f, 333.01f, 66.24f, 227.99f)
            reflectiveCurveTo(179.2f, 50.31f, 284.21f, 65.68f)
            curveToRelative(35.8f, 5.24f, 69.39f, 20.48f, 96.91f, 43.96f)
            lineToRelative(-24.11f, 24.11f)
            curveToRelative(-8.33f, 8.33f, -8.33f, 21.84f, 0f, 30.17f)
            curveToRelative(4.01f, 4.01f, 9.47f, 6.26f, 15.14f, 6.25f)
            horizontalLineToRelative(97.83f)
            curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
            verticalLineTo(50.99f)
            curveToRelative(-0f, -11.78f, -9.56f, -21.33f, -21.34f, -21.33f)
            curveToRelative(-5.66f, 0f, -11.08f, 2.25f, -15.08f, 6.25f)
            lineToRelative(-28.42f, 28.42f)
            curveTo(320.77f, -29.34f, 159.14f, -19.57f, 65.48f, 86.15f)
            reflectiveCurveTo(-18.42f, 353.51f, 87.3f, 447.17f)
            reflectiveCurveToRelative(267.35f, 83.89f, 361.02f, -21.83f)
            curveToRelative(32.97f, -37.22f, 54.38f, -83.24f, 61.61f, -132.43f)
            curveToRelative(2.83f, -17.61f, -9.16f, -34.18f, -26.77f, -37.01f)
            curveTo(481.55f, 255.64f, 479.92f, 255.51f, 478.29f, 255.49f)
            close()
        }
    }.also { _RotateRight = it }
