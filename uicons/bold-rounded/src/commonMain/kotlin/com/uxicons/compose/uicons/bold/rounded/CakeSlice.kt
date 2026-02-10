package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Br.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.33f, 7.21f)
            curveToRelative(-1.23f, -1.66f, -3.28f, -4.07f, -6.08f, -6.16f)
            curveToRelative(-1.83f, -1.36f, -4.35f, -1.42f, -6.29f, -0.13f)
            curveToRelative(-0.04f, 0.02f, -7.36f, 5.86f, -7.36f, 5.86f)
            curveToRelative(-1.64f, 1.22f, -2.61f, 3.17f, -2.61f, 5.21f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.22f)
            curveToRelative(0f, -1.84f, -0.58f, -3.59f, -1.67f, -5.06f)
            close()
            moveTo(3f, 16f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(2f)
            lineTo(3f, 16f)
            close()
            moveTo(4.44f, 9.17f)
            lineToRelative(7.24f, -5.77f)
            curveToRelative(0.87f, -0.56f, 1.98f, -0.53f, 2.78f, 0.06f)
            curveToRelative(2.5f, 1.87f, 4.35f, 4.05f, 5.46f, 5.54f)
            curveToRelative(0.45f, 0.6f, 0.76f, 1.28f, 0.93f, 2.0f)
            lineTo(3.15f, 11f)
            curveToRelative(0.22f, -0.71f, 0.66f, -1.36f, 1.29f, -1.83f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            horizontalLineToRelative(17.9f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            close()
        }
    }.also { _CakeSlice = it }
