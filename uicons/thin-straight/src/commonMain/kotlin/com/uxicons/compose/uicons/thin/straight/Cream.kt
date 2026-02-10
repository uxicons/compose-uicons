package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cream: ImageVector? = null

val Icons.Ts.Cream: ImageVector
    get() = _Cream ?: UXIcon(name = "Cream") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12.05f)
                verticalLineToRelative(-4.05f)
                horizontalLineToRelative(-2f)
                curveTo(20f, 2.79f, 16.12f, 0.11f, 15.96f, 0f)
                horizontalLineToRelative(-0.96f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.41f, -2.25f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-4.45f, 0f, -5.3f, 3.64f, -5.46f, 5f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(4.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(9.5f, 4f)
                horizontalLineToRelative(3f)
                curveToRelative(1.09f, 0f, 3.07f, -0.6f, 3.44f, -2.76f)
                curveToRelative(0.92f, 0.8f, 3.06f, 3.06f, 3.06f, 6.76f)
                lineTo(5.04f, 8f)
                curveToRelative(0.14f, -1.18f, 0.87f, -4f, 4.46f, -4f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                lineTo(3f, 12f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                close()
            }
        }.also { _Cream = it}
