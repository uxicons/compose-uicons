package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MilkAlt: ImageVector? = null

val Icons.Sr.MilkAlt: ImageVector
    get() = _MilkAlt ?: UXIcon(name = "MilkAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 17f)
                lineTo(4f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
                moveTo(19.11f, 9.23f)
                lineToRelative(-1.63f, -4.19f)
                curveToRelative(-0.32f, -0.81f, -0.48f, -1.67f, -0.48f, -2.54f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(7f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(0.49f)
                curveToRelative(0f, 0.87f, -0.16f, 1.73f, -0.48f, 2.54f)
                lineToRelative(-1.63f, 4.19f)
                curveToRelative(-0.35f, 0.9f, -0.59f, 1.83f, -0.73f, 2.77f)
                horizontalLineToRelative(9.84f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(4f, 19f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-5.05f)
                curveToRelative(0f, -1.62f, -0.3f, -3.21f, -0.89f, -4.72f)
                close()
            }
        }.also { _MilkAlt = it}
