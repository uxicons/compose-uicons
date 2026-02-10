package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italian: ImageVector? = null

val Icons.Ts.Italian: ImageVector
    get() = _Italian ?: UXIcon(name = "Italian") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                lineTo(11f, 6f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(15.86f)
                curveToRelative(0.04f, 1.28f, -1.52f, 2.11f, -2.56f, 1.37f)
                lineToRelative(-4.09f, -2.73f)
                lineTo(6f, 21f)
                verticalLineToRelative(-3.57f)
                lineToRelative(-3.44f, 2.29f)
                curveToRelative(-1.04f, 0.74f, -2.6f, -0.1f, -2.56f, -1.37f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(6.35f, 16f)
                horizontalLineToRelative(11.65f)
                lineTo(18f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(15.86f)
                curveToRelative(-0.02f, 0.5f, 0.6f, 0.83f, 1.01f, 0.54f)
                lineToRelative(4.34f, -2.89f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(12f)
                lineTo(7f, 17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10.65f)
                lineToRelative(4.34f, 2.89f)
                curveToRelative(0.41f, 0.29f, 1.03f, -0.04f, 1.01f, -0.54f)
                lineTo(23.0f, 6.5f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                lineTo(7f, 5f)
                close()
            }
        }.also { _Italian = it}
