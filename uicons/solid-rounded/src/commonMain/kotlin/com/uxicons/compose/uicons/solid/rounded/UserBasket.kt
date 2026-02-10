package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBasket: ImageVector? = null

val Icons.Sr.UserBasket: ImageVector
    get() = _UserBasket ?: UXIcon(name = "UserBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 17.86f)
                lineToRelative(-0.4f, 2.72f)
                curveToRelative(-0.29f, 1.95f, -1.99f, 3.42f, -3.96f, 3.42f)
                horizontalLineToRelative(-4.62f)
                curveToRelative(-1.97f, 0f, -3.67f, -1.47f, -3.96f, -3.42f)
                lineToRelative(-0.4f, -2.72f)
                curveToRelative(-0.25f, -1.46f, 0.99f, -2.9f, 2.47f, -2.86f)
                horizontalLineToRelative(3.79f)
                lineToRelative(2.2f, -4.44f)
                curveToRelative(0.24f, -0.5f, 0.84f, -0.7f, 1.34f, -0.45f)
                curveToRelative(0.49f, 0.24f, 0.7f, 0.84f, 0.45f, 1.34f)
                lineToRelative(-1.76f, 3.56f)
                horizontalLineToRelative(2.36f)
                curveToRelative(1.48f, -0.04f, 2.72f, 1.4f, 2.47f, 2.86f)
                close()
                moveTo(2f, 6f)
                curveTo(2f, 2.69f, 4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveTo(2f, 9.31f, 2f, 6f)
                close()
                moveTo(8.66f, 18.15f)
                curveToRelative(-0.19f, -1.29f, 0.19f, -2.6f, 1.05f, -3.6f)
                curveToRelative(0.09f, -0.11f, 0.21f, -0.19f, 0.31f, -0.29f)
                curveToRelative(-0.65f, -0.17f, -1.32f, -0.27f, -2.02f, -0.27f)
                curveTo(3.59f, 14f, 0f, 17.59f, 0f, 22f)
                curveToRelative(0f, 0.97f, 0.7f, 2f, 2f, 2f)
                lineTo(10.57f, 24f)
                curveToRelative(-0.78f, -0.86f, -1.33f, -1.93f, -1.5f, -3.13f)
                lineToRelative(-0.4f, -2.72f)
                close()
            }
        }.also { _UserBasket = it}
