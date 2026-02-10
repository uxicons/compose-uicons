package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tax: ImageVector? = null

val Icons.Ts.Tax: ImageVector
    get() = _Tax ?: UXIcon(name = "Tax") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(22.5f, 13f)
                horizontalLineToRelative(-1.08f)
                lineToRelative(-1.67f, 3.02f)
                lineToRelative(-1.67f, -3.02f)
                horizontalLineToRelative(-1.08f)
                lineToRelative(2.21f, 4.01f)
                lineToRelative(-2.21f, 3.99f)
                horizontalLineToRelative(1.1f)
                lineToRelative(1.65f, -3.0f)
                lineToRelative(1.65f, 3.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(-2.21f, -3.99f)
                lineToRelative(2.21f, -4.01f)
                close()
                moveTo(2f, 23f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(1f)
                lineTo(1f, 24f)
                lineTo(1f, 2.5f)
                curveTo(1f, 1.12f, 2.12f, 0f, 3.5f, 0f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 1f)
                lineTo(3.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(14f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(14f, 1.71f)
                verticalLineToRelative(5.29f)
                close()
                moveTo(11.03f, 21f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(1.83f, -6.93f)
                curveToRelative(0.09f, -0.39f, 0.35f, -0.72f, 0.72f, -0.91f)
                curveToRelative(0.37f, -0.19f, 0.81f, -0.2f, 1.19f, -0.04f)
                curveToRelative(0.4f, 0.17f, 0.71f, 0.54f, 0.81f, 0.98f)
                lineToRelative(1.71f, 6.9f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(-0.5f, -2f)
                horizontalLineToRelative(-3.18f)
                lineToRelative(-0.53f, 2f)
                close()
                moveTo(11.82f, 18f)
                horizontalLineToRelative(2.67f)
                lineToRelative(-0.91f, -3.67f)
                curveToRelative(-0.03f, -0.14f, -0.12f, -0.25f, -0.23f, -0.3f)
                curveToRelative(-0.12f, -0.05f, -0.24f, -0.05f, -0.35f, 0.01f)
                curveToRelative(-0.1f, 0.05f, -0.18f, 0.15f, -0.21f, 0.26f)
                lineToRelative(-0.97f, 3.69f)
                close()
            }
        }.also { _Tax = it}
