package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HikingBoot: ImageVector? = null

val Icons.Ss.HikingBoot: ImageVector
    get() = _HikingBoot ?: UXIcon(name = "HikingBoot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                lineTo(9f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 6f)
                lineTo(5f, 6f)
                lineTo(5f, 2f)
                close()
                moveTo(20.52f, 13.6f)
                curveToRelative(-1.02f, -0.31f, -1.85f, -0.51f, -2.59f, -0.68f)
                curveToRelative(-0.04f, -0.01f, -0.07f, -0.02f, -0.1f, -0.02f)
                lineToRelative(-2.0f, 2.89f)
                lineToRelative(-1.6f, -1.19f)
                lineToRelative(1.56f, -2.29f)
                curveToRelative(-0.46f, -0.19f, -0.87f, -0.43f, -1.31f, -0.78f)
                lineToRelative(-2.49f, 1.38f)
                lineToRelative(-0.97f, -1.75f)
                lineToRelative(2.99f, -1.66f)
                lineTo(14.0f, 3f)
                curveToRelative(0f, -0.94f, -0.39f, -1.77f, -1.08f, -2.33f)
                curveToRelative(-0.72f, -0.58f, -1.69f, -0.8f, -2.58f, -0.6f)
                lineToRelative(-3.33f, 1.42f)
                lineTo(7.0f, 6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(0f, 8f)
                verticalLineToRelative(11f)
                lineTo(8.17f, 19f)
                curveToRelative(0.32f, 0f, 0.64f, 0.08f, 0.92f, 0.22f)
                lineToRelative(4.91f, 2.54f)
                verticalLineToRelative(2.23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.97f)
                curveToRelative(0f, -2.24f, -1.2f, -4.82f, -3.48f, -5.43f)
                close()
            }
        }.also { _HikingBoot = it}
