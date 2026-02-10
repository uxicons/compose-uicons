package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopRefresh: ImageVector? = null

val Icons.Ss.LaptopRefresh: ImageVector
    get() = _LaptopRefresh ?: UXIcon(name = "LaptopRefresh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(1.05f)
                lineToRelative(-1.53f, -1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.75f, 0.75f, 0.75f, 1.97f, 0f, 2.72f)
                lineToRelative(-2.55f, 2.55f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.45f, -1.45f)
                horizontalLineToRelative(-0.97f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -0.4f, -0.08f, -0.79f, -0.19f, -1.15f)
                lineToRelative(1.54f, -1.54f)
                curveToRelative(0.41f, 0.81f, 0.65f, 1.73f, 0.65f, 2.7f)
                curveToRelative(0f, 0f, 0f, 0.02f, -0.0f, 0.05f)
                curveToRelative(-0.03f, 3.29f, -2.71f, 5.95f, -6.0f, 5.95f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(15.01f, 21f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(-0.85f, -1f)
                horizontalLineToRelative(-8.14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8.14f)
                lineToRelative(-0.85f, 1f)
                close()
                moveTo(9.93f, 19f)
                horizontalLineToRelative(4.16f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(7.07f)
                verticalLineToRelative(-2.08f)
                curveToRelative(-1.18f, 0.68f, -2.54f, 1.08f, -4f, 1.08f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                curveToRelative(0f, -1.06f, 0.21f, -2.07f, 0.59f, -3f)
                horizontalLineToRelative(-8.59f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(7.08f)
                lineToRelative(0.85f, 1f)
                close()
            }
        }.also { _LaptopRefresh = it}
