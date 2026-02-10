package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterBottle: ImageVector? = null

val Icons.Sc.WaterBottle: ImageVector
    get() = _WaterBottle ?: UXIcon(name = "WaterBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.98f, 12.06f)
                curveToRelative(0.77f, -0.75f, 0.96f, -1.66f, 0.96f, -2.41f)
                curveToRelative(0f, -2.19f, -1.59f, -4.01f, -3.9f, -4.57f)
                verticalLineToRelative(-1.15f)
                curveToRelative(0.61f, -0.19f, 1.06f, -0.76f, 1.06f, -1.43f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.67f, 0.44f, 1.24f, 1.06f, 1.43f)
                verticalLineToRelative(1.15f)
                curveToRelative(-2.31f, 0.56f, -3.9f, 2.37f, -3.9f, 4.57f)
                curveToRelative(0f, 0.43f, 0.07f, 0.92f, 0.28f, 1.4f)
                horizontalLineToRelative(6.69f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(5.34f)
                curveToRelative(-0.21f, 0.49f, -0.28f, 0.98f, -0.28f, 1.42f)
                curveToRelative(0f, 0.4f, 0.06f, 0.86f, 0.24f, 1.31f)
                horizontalLineToRelative(6.95f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(5.3f)
                curveToRelative(-0.18f, 0.46f, -0.24f, 0.92f, -0.24f, 1.33f)
                curveToRelative(0f, 3.89f, 5.04f, 3.89f, 6.94f, 3.89f)
                curveToRelative(2.08f, 0f, 6.94f, 0f, 6.94f, -3.89f)
                curveToRelative(0f, -0.71f, -0.18f, -1.59f, -0.87f, -2.32f)
                curveToRelative(0.69f, -0.73f, 0.87f, -1.61f, 0.87f, -2.32f)
                curveToRelative(0f, -0.75f, -0.2f, -1.67f, -0.96f, -2.41f)
                close()
            }
        }.also { _WaterBottle = it}
