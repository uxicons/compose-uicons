package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Sr.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.34f, 12f)
                curveToRelative(0.28f, -0.79f, 0.72f, -1.51f, 1.31f, -2.13f)
                curveTo(1.65f, 9.87f, 10.13f, 0.92f, 10.19f, 0.88f)
                curveToRelative(0.85f, -0.56f, 1.83f, -0.87f, 2.84f, -0.88f)
                curveToRelative(1.11f, 0.01f, 2.19f, 0.33f, 3.08f, 1.0f)
                curveToRelative(3.4f, 2.54f, 5.56f, 5.54f, 6.78f, 7.6f)
                curveToRelative(0.61f, 1.04f, 0.98f, 2.2f, 1.08f, 3.41f)
                lineTo(0.34f, 12f)
                close()
                moveTo(0f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                lineTo(0f, 14f)
                close()
                moveTo(0.1f, 20f)
                curveToRelative(0.47f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(2.41f, 0f, 4.43f, -1.72f, 4.9f, -4f)
                lineTo(0.1f, 20f)
                close()
            }
        }.also { _CakeSlice = it}
