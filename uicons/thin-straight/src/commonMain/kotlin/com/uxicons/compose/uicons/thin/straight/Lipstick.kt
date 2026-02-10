package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lipstick: ImageVector? = null

val Icons.Ts.Lipstick: ImageVector
    get() = _Lipstick ?: UXIcon(name = "Lipstick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 1.67f)
                curveToRelative(0f, -0.58f, -0.3f, -1.11f, -0.79f, -1.42f)
                curveToRelative(-0.49f, -0.3f, -1.1f, -0.33f, -1.62f, -0.07f)
                lineToRelative(-4.21f, 2.1f)
                curveToRelative(-0.85f, 0.43f, -1.38f, 1.28f, -1.38f, 2.24f)
                verticalLineToRelative(4.48f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 4.52f)
                curveToRelative(0f, -0.57f, 0.32f, -1.09f, 0.83f, -1.34f)
                lineToRelative(4.21f, -2.1f)
                curveToRelative(0.21f, -0.11f, 0.45f, -0.1f, 0.65f, 0.03f)
                curveToRelative(0.2f, 0.12f, 0.32f, 0.33f, 0.32f, 0.57f)
                verticalLineToRelative(7.33f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4.48f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 23f)
                lineTo(6f, 23f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Lipstick = it}
