package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingDocument: ImageVector? = null

val Icons.Ss.HandHoldingDocument: ImageVector
    get() = _HandHoldingDocument ?: UXIcon(name = "HandHoldingDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                horizontalLineToRelative(-4f)
                lineTo(11f, 0f)
                lineToRelative(4f, 4f)
                close()
                moveTo(9f, 6f)
                lineTo(9f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                lineTo(15f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(23.34f, 12.35f)
                lineToRelative(-10.67f, 11.65f)
                lineTo(3.0f, 24f)
                curveTo(1.35f, 24f, 0.0f, 22.65f, 0.0f, 21f)
                verticalLineToRelative(-7f)
                curveTo(0.0f, 12.35f, 1.35f, 11f, 3.0f, 11f)
                lineTo(11.79f, 11f)
                curveToRelative(1.22f, 0f, 2.21f, 0.99f, 2.21f, 2.21f)
                curveToRelative(0f, 1.09f, -0.82f, 2.04f, -1.9f, 2.19f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(0.28f, 1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(2.06f, -0.29f, 3.62f, -2.09f, 3.62f, -4.17f)
                curveToRelative(0f, -0.22f, -0.03f, -0.43f, -0.07f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                curveToRelative(0.91f, -1.04f, 2.67f, -1.12f, 3.67f, -0.16f)
                curveToRelative(1.05f, 0.96f, 1.14f, 2.6f, 0.19f, 3.67f)
                close()
            }
        }.also { _HandHoldingDocument = it}
