package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateRight: ImageVector? = null

val Icons.Sr.RotateRight: ImageVector
    get() = _RotateRight ?: UXIcon(name = "RotateRight", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(489.8f, 256f)
                curveToRelative(-10.79f, -0.14f, -19.92f, 7.94f, -21.1f, 18.67f)
                curveToRelative(-9.96f, 117.75f, -113.49f, 205.14f, -231.24f, 195.18f)
                reflectiveCurveTo(32.31f, 356.35f, 42.28f, 238.6f)
                reflectiveCurveTo(155.77f, 33.46f, 273.52f, 43.42f)
                curveToRelative(50.98f, 4.31f, 98.73f, 26.75f, 134.59f, 63.24f)
                horizontalLineToRelative(-66.6f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                reflectiveCurveToRelative(9.55f, 21.33f, 21.33f, 21.33f)
                horizontalLineToRelative(88.38f)
                curveToRelative(21.87f, -0.01f, 39.6f, -17.74f, 39.62f, -39.62f)
                verticalLineTo(21.33f)
                curveTo(469.51f, 9.55f, 459.96f, 0f, 448.18f, 0f)
                curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
                verticalLineToRelative(44.33f)
                curveTo(321.55f, -28.42f, 159.91f, -19.34f, 65.83f, 85.95f)
                reflectiveCurveToRelative(-85f, 266.93f, 20.29f, 361.02f)
                reflectiveCurveToRelative(266.93f, 85f, 361.02f, -20.29f)
                curveToRelative(36.58f, -40.93f, 59.01f, -92.55f, 63.98f, -147.21f)
                curveToRelative(1.1f, -11.81f, -7.59f, -22.28f, -19.41f, -23.38f)
                curveTo(491.07f, 256.03f, 490.43f, 256f, 489.8f, 256f)
                close()
            }
        }.also { _RotateRight = it}
