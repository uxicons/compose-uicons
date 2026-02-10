package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Ts.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.32f, 9.43f)
                curveToRelative(-1.03f, -1.89f, -3.35f, -5.5f, -7.35f, -8.49f)
                curveToRelative(-0.83f, -0.62f, -1.84f, -0.95f, -2.89f, -0.93f)
                curveToRelative(-0.95f, 0.01f, -1.88f, 0.3f, -2.68f, 0.83f)
                lineTo(0f, 11.8f)
                verticalLineToRelative(12.2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.88f)
                curveToRelative(0f, -0.95f, -0.23f, -1.89f, -0.68f, -2.7f)
                close()
                moveTo(1f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                lineTo(1f, 16f)
                close()
                moveTo(23f, 17f)
                verticalLineToRelative(2f)
                lineTo(1f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(22f)
                close()
                moveTo(11.01f, 1.63f)
                curveToRelative(0.62f, -0.41f, 1.35f, -0.62f, 2.09f, -0.63f)
                curveToRelative(0.78f, -0.02f, 1.62f, 0.24f, 2.28f, 0.73f)
                curveToRelative(3.85f, 2.88f, 6.08f, 6.35f, 7.07f, 8.17f)
                curveToRelative(0.34f, 0.63f, 0.53f, 1.35f, 0.55f, 2.1f)
                lineTo(1.19f, 12f)
                lineTo(11.01f, 1.63f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                lineTo(1f, 23f)
                close()
            }
        }.also { _CakeSlice = it}
