package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopRefresh: ImageVector? = null

val Icons.Bs.LaptopRefresh: ImageVector
    get() = _LaptopRefresh ?: UXIcon(name = "LaptopRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(8.4f)
                curveToRelative(-0.26f, 0.79f, -0.4f, 1.63f, -0.4f, 2.5f)
                curveToRelative(0f, 0.17f, 0.01f, 0.33f, 0.03f, 0.5f)
                horizontalLineToRelative(-5.03f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(5.54f)
                lineToRelative(0.92f, -1f)
                horizontalLineToRelative(3.31f)
                verticalLineToRelative(-2.57f)
                curveToRelative(1.08f, -0.14f, 2.1f, -0.49f, 3f, -1.01f)
                close()
                moveTo(18f, 14.5f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -1.2f, -0.36f, -2.31f, -0.96f, -3.25f)
                lineToRelative(-2.28f, 2.07f)
                curveToRelative(0.16f, 0.36f, 0.24f, 0.76f, 0.24f, 1.18f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(2.43f)
                lineToRelative(3.58f, -3.16f)
                curveToRelative(0.56f, -0.48f, 0.56f, -1.32f, 0f, -1.8f)
                lineToRelative(-3.58f, -3.16f)
                verticalLineToRelative(2.59f)
                curveToRelative(-2.83f, 0.48f, -5f, 2.94f, -5f, 5.91f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
            }
        }.also { _LaptopRefresh = it}
