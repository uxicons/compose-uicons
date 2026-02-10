package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenImage: ImageVector? = null

val Icons.Sr.BrokenImage: ImageVector
    get() = _BrokenImage ?: UXIcon(name = "BrokenImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                lineTo(14f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.24f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(5.49f, 13.63f)
                curveToRelative(0.84f, -0.84f, 2.2f, -0.84f, 3.04f, 0f)
                lineToRelative(3.37f, 3.37f)
                curveToRelative(0.06f, 0.06f, 0.15f, 0.06f, 0.21f, 0f)
                lineToRelative(3.37f, -3.37f)
                curveToRelative(0.84f, -0.84f, 2.2f, -0.84f, 3.04f, 0f)
                lineToRelative(3.48f, 3.48f)
                verticalLineToRelative(-6.63f)
                curveToRelative(0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.49f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(12f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.49f, -0.02f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(12.12f)
                lineToRelative(3.49f, -3.49f)
                close()
                moveTo(17.11f, 15.04f)
                reflectiveCurveToRelative(-0.16f, -0.05f, -0.21f, 0f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(-0.84f, 0.84f, -2.2f, 0.84f, -3.04f, 0f)
                lineToRelative(-3.37f, -3.37f)
                curveToRelative(-0.06f, -0.06f, -0.16f, -0.06f, -0.21f, 0f)
                lineToRelative(-4.82f, 4.82f)
                curveToRelative(0.41f, 2.34f, 2.46f, 4.13f, 4.92f, 4.13f)
                horizontalLineToRelative(10f)
                curveToRelative(2.46f, 0f, 4.51f, -1.79f, 4.92f, -4.13f)
                lineToRelative(-4.82f, -4.82f)
                close()
            }
        }.also { _BrokenImage = it}
