package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyCar: ImageVector? = null

val Icons.Sr.KeyCar: ImageVector
    get() = _KeyCar ?: UXIcon(name = "KeyCar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.52f, 16.52f)
                lineToRelative(-2.52f, 2.48f)
                horizontalLineToRelative(-3f)
                reflectiveCurveToRelative(0f, 2.0f, 0f, 2.0f)
                lineTo(4f, 21f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24.0f)
                curveTo(0.45f, 24f, 0f, 23.55f, 0f, 23f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0f, -1.06f, 0.42f, -2.08f, 1.17f, -2.83f)
                lineToRelative(6.14f, -6.14f)
                lineToRelative(4.21f, 4.33f)
                close()
                moveTo(22.13f, 11.83f)
                lineToRelative(-4.36f, 3.4f)
                curveToRelative(-1.45f, 1.13f, -3.52f, 1.0f, -4.82f, -0.3f)
                lineToRelative(-3.87f, -3.87f)
                curveToRelative(-1.31f, -1.31f, -1.43f, -3.41f, -0.26f, -4.86f)
                lineTo(12.35f, 1.81f)
                curveToRelative(1.67f, -2.07f, 4.68f, -2.41f, 6.78f, -0.78f)
                curveToRelative(0.62f, 0.48f, 1.25f, 1.02f, 1.86f, 1.63f)
                curveToRelative(0.79f, 0.79f, 1.49f, 1.67f, 2.1f, 2.52f)
                curveToRelative(1.51f, 2.12f, 1.08f, 5.05f, -0.97f, 6.65f)
                close()
                moveTo(19.69f, 6.28f)
                lineToRelative(-2f, -2f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2f, 2f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _KeyCar = it}
