package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformerBolt: ImageVector? = null

val Icons.Ss.TransformerBolt: ImageVector
    get() = _TransformerBolt ?: UXIcon(name = "TransformerBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(1f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16f)
                lineTo(1f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14.91f, 14.91f)
                lineToRelative(-2.1f, 4.51f)
                lineToRelative(-1.81f, -0.85f)
                lineToRelative(1.65f, -3.54f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-0.46f, 0f, -0.88f, -0.23f, -1.12f, -0.63f)
                reflectiveCurveToRelative(-0.26f, -0.87f, -0.06f, -1.28f)
                lineToRelative(2.28f, -4.57f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(-1.79f, 3.58f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.45f, 0f, 0.87f, 0.23f, 1.11f, 0.61f)
                curveToRelative(0.24f, 0.38f, 0.28f, 0.86f, 0.08f, 1.27f)
                close()
            }
        }.also { _TransformerBolt = it}
