package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Ss.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 12f)
                lineTo(0f, 12f)
                lineTo(10.19f, 0.88f)
                curveToRelative(0.85f, -0.56f, 1.83f, -0.87f, 2.84f, -0.88f)
                curveToRelative(1.11f, 0.01f, 2.19f, 0.33f, 3.08f, 1.0f)
                curveToRelative(3.91f, 2.92f, 6.17f, 6.45f, 7.17f, 8.29f)
                curveToRelative(0.45f, 0.82f, 0.68f, 1.75f, 0.7f, 2.71f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                lineTo(0f, 20f)
                verticalLineToRelative(4f)
                close()
                moveTo(0f, 14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                lineTo(0f, 14f)
                close()
            }
        }.also { _CakeSlice = it}
