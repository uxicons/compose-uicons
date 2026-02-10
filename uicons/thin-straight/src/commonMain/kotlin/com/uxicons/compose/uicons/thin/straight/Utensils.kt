package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Utensils: ImageVector? = null

val Icons.Ts.Utensils: ImageVector
    get() = _Utensils ?: UXIcon(name = "Utensils") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(7f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(11f, 0f)
                close()
                moveTo(21f, 8.77f)
                curveToRelative(0f, 4.72f, -4.14f, 9.31f, -5f, 10.2f)
                verticalLineToRelative(5.03f)
                horizontalLineToRelative(-1f)
                lineTo(15f, 1.5f)
                curveToRelative(0f, -0.66f, 0.4f, -1.22f, 1.03f, -1.42f)
                curveToRelative(0.62f, -0.21f, 1.29f, 0.0f, 1.68f, 0.53f)
                curveToRelative(1.5f, 2.01f, 3.29f, 5.06f, 3.29f, 8.15f)
                close()
                moveTo(16f, 17.46f)
                curveToRelative(1.39f, -1.65f, 4f, -5.21f, 4f, -8.7f)
                curveToRelative(0f, -2.82f, -1.68f, -5.67f, -3.1f, -7.56f)
                curveToRelative(-0.12f, -0.17f, -0.28f, -0.21f, -0.4f, -0.21f)
                curveToRelative(-0.08f, 0f, -0.14f, 0.02f, -0.17f, 0.03f)
                curveToRelative(-0.08f, 0.03f, -0.34f, 0.14f, -0.34f, 0.47f)
                verticalLineToRelative(15.96f)
                close()
            }
        }.also { _Utensils = it}
