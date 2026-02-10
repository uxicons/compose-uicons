package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MilkAlt: ImageVector? = null

val Icons.Bs.MilkAlt: ImageVector
    get() = _MilkAlt ?: UXIcon(name = "MilkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.99f, 9.33f)
                lineToRelative(-1.46f, -3.42f)
                curveToRelative(-0.35f, -0.81f, -0.53f, -1.68f, -0.53f, -2.56f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(1f)
                lineTo(18f, 0f)
                lineTo(6f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.36f)
                curveToRelative(0f, 0.89f, -0.18f, 1.75f, -0.53f, 2.56f)
                lineToRelative(-1.46f, 3.42f)
                curveToRelative(-0.67f, 1.56f, -1.01f, 3.22f, -1.01f, 4.92f)
                verticalLineToRelative(9.74f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-9.74f)
                curveToRelative(0f, -1.7f, -0.34f, -3.36f, -1.01f, -4.92f)
                close()
                moveTo(17f, 21f)
                lineTo(7f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-7.91f)
                curveToRelative(0.11f, -0.85f, 0.33f, -1.69f, 0.68f, -2.48f)
                lineToRelative(1.46f, -3.42f)
                curveToRelative(0.51f, -1.19f, 0.77f, -2.45f, 0.77f, -3.74f)
                verticalLineToRelative(-0.36f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.36f)
                curveToRelative(0f, 1.29f, 0.26f, 2.55f, 0.77f, 3.74f)
                lineToRelative(1.46f, 3.42f)
                curveToRelative(0.51f, 1.19f, 0.77f, 2.45f, 0.77f, 3.74f)
                verticalLineToRelative(6.74f)
                close()
            }
        }.also { _MilkAlt = it}
