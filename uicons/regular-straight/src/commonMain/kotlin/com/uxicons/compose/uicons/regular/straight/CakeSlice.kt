package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Rs.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.29f, 9.29f)
                curveToRelative(-1.0f, -1.84f, -3.27f, -5.37f, -7.17f, -8.29f)
                curveToRelative(-0.89f, -0.66f, -1.97f, -0.99f, -3.08f, -1.0f)
                curveToRelative(-1.01f, 0.01f, -2.0f, 0.32f, -2.84f, 0.88f)
                lineTo(0f, 11.6f)
                verticalLineToRelative(12.4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11.88f)
                curveToRelative(0f, -1.0f, -0.24f, -1.98f, -0.71f, -2.83f)
                close()
                moveTo(11.39f, 2.49f)
                curveToRelative(0.5f, -0.31f, 1.08f, -0.48f, 1.67f, -0.49f)
                curveToRelative(0.67f, -0.02f, 1.33f, 0.2f, 1.86f, 0.6f)
                curveToRelative(3.6f, 2.69f, 5.69f, 5.95f, 6.61f, 7.65f)
                curveToRelative(0.29f, 0.53f, 0.44f, 1.13f, 0.46f, 1.76f)
                lineTo(2.38f, 12f)
                lineTo(11.39f, 2.49f)
                close()
                moveTo(22f, 14f)
                verticalLineToRelative(3f)
                lineTo(2f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                lineTo(2f, 22f)
                close()
            }
        }.also { _CakeSlice = it}
