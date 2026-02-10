package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Bs.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.51f, 9.63f)
                curveToRelative(-0.78f, -1.53f, -3.05f, -5.43f, -7.25f, -8.57f)
                curveTo(15.31f, 0.35f, 14.18f, 0f, 12.98f, 0f)
                curveToRelative(-1.07f, 0.01f, -2.12f, 0.34f, -3.01f, 0.93f)
                lineTo(0f, 10.88f)
                verticalLineToRelative(13.12f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-12.32f)
                curveToRelative(0f, -0.72f, -0.17f, -1.4f, -0.49f, -2.04f)
                close()
                moveTo(11.75f, 3.36f)
                curveToRelative(0.39f, -0.23f, 0.82f, -0.35f, 1.27f, -0.36f)
                curveToRelative(0.51f, -0.02f, 1.03f, 0.15f, 1.44f, 0.46f)
                curveToRelative(3.7f, 2.77f, 5.69f, 6.19f, 6.38f, 7.53f)
                curveToRelative(0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.01f)
                lineTo(4.12f, 11f)
                lineToRelative(7.63f, -7.64f)
                close()
                moveTo(21f, 14f)
                verticalLineToRelative(2f)
                lineTo(3f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _CakeSlice = it}
