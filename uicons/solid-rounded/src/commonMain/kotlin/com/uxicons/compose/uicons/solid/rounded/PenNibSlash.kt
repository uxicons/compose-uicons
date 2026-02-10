package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNibSlash: ImageVector? = null

val Icons.Sr.PenNibSlash: ImageVector
    get() = _PenNibSlash ?: UXIcon(name = "PenNibSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.59f)
                lineTo(15.29f, 0.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(7f, 7f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineTo(13f, 2.59f)
                close()
                moveTo(18.71f, 17.3f)
                lineToRelative(1.68f, -4.49f)
                lineTo(11.19f, 3.61f)
                lineToRelative(-4.49f, 1.68f)
                lineTo(1.71f, 0.29f)
                curveTo(1.32f, -0.1f, 0.68f, -0.1f, 0.29f, 0.29f)
                reflectiveCurveTo(-0.1f, 1.32f, 0.29f, 1.71f)
                lineTo(22.29f, 23.71f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-5f, -5f)
                close()
                moveTo(10.98f, 15.23f)
                lineToRelative(5.04f, 5.04f)
                lineToRelative(-12.14f, 3.68f)
                curveToRelative(-0.9f, 0.27f, -1.57f, -0.84f, -0.9f, -1.5f)
                lineToRelative(5.51f, -5.51f)
                curveToRelative(0.16f, 0.04f, 0.33f, 0.07f, 0.51f, 0.07f)
                curveToRelative(1.03f, 0f, 1.87f, -0.78f, 1.98f, -1.78f)
                close()
                moveTo(1.56f, 21.03f)
                curveToRelative(-0.67f, 0.67f, -1.78f, 0f, -1.5f, -0.9f)
                lineTo(3.74f, 7.99f)
                lineToRelative(5.04f, 5.04f)
                curveToRelative(-1f, 0.11f, -1.78f, 0.95f, -1.78f, 1.98f)
                curveToRelative(0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f)
                lineTo(1.56f, 21.03f)
                close()
            }
        }.also { _PenNibSlash = it}
