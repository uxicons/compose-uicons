package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNibSlash: ImageVector? = null

val Icons.Ss.PenNibSlash: ImageVector
    get() = _PenNibSlash ?: UXIcon(name = "PenNibSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.21f, 2.79f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(8f, 8f)
                lineToRelative(-2.79f, 2.79f)
                lineTo(13.21f, 2.79f)
                close()
                moveTo(20.36f, 12.77f)
                lineTo(11.23f, 3.64f)
                lineToRelative(-4.52f, 1.65f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.25f, -5.25f)
                lineToRelative(1.65f, -4.52f)
                close()
                moveTo(9f, 17f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.03f, -0.51f, -0.07f)
                lineTo(1.42f, 24f)
                lineToRelative(14.6f, -3.74f)
                lineToRelative(-5.04f, -5.04f)
                curveToRelative(-0.11f, 1f, -0.95f, 1.78f, -1.98f, 1.78f)
                close()
                moveTo(7.07f, 15.51f)
                curveToRelative(-0.04f, -0.16f, -0.07f, -0.33f, -0.07f, -0.51f)
                curveToRelative(0f, -1.03f, 0.78f, -1.87f, 1.78f, -1.98f)
                lineTo(3.74f, 7.98f)
                lineTo(0f, 22.58f)
                lineToRelative(7.07f, -7.07f)
                close()
            }
        }.also { _PenNibSlash = it}
