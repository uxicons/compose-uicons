package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bridge: ImageVector? = null

val Icons.Bs.Bridge: ImageVector
    get() = _Bridge ?: UXIcon(name = "Bridge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                lineTo(0f, 13.9f)
                lineToRelative(1.36f, 0.12f)
                curveToRelative(2.07f, 0.19f, 3.63f, 1.9f, 3.63f, 3.98f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.08f, 1.56f, -3.79f, 3.63f, -3.98f)
                lineToRelative(1.36f, -0.12f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                close()
                moveTo(21f, 5f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 5f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(7f, 3f)
                verticalLineToRelative(2f)
                lineTo(3f, 5f)
                lineTo(3f, 3f)
                lineTo(7f, 3f)
                close()
                moveTo(17.49f, 13.68f)
                curveToRelative(-1.28f, -1.63f, -3.27f, -2.67f, -5.49f, -2.67f)
                reflectiveCurveToRelative(-4.21f, 1.05f, -5.49f, 2.67f)
                curveToRelative(-0.88f, -1.12f, -2.09f, -1.97f, -3.51f, -2.38f)
                verticalLineToRelative(-3.29f)
                lineTo(21f, 8f)
                verticalLineToRelative(3.29f)
                curveToRelative(-1.42f, 0.42f, -2.63f, 1.26f, -3.51f, 2.38f)
                close()
            }
        }.also { _Bridge = it}
