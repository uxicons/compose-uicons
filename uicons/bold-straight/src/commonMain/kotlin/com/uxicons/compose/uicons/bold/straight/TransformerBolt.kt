package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformerBolt: ImageVector? = null

val Icons.Bs.TransformerBolt: ImageVector
    get() = _TransformerBolt ?: UXIcon(name = "TransformerBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(1f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14f)
                lineTo(1f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                lineTo(6f, 7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(14f)
                close()
                moveTo(8.72f, 12.9f)
                lineToRelative(2.28f, -4.57f)
                lineToRelative(2.68f, 1.34f)
                lineToRelative(-1.43f, 2.86f)
                horizontalLineToRelative(1.45f)
                curveToRelative(0.62f, 0f, 1.2f, 0.32f, 1.54f, 0.84f)
                curveToRelative(0.34f, 0.53f, 0.38f, 1.18f, 0.11f, 1.75f)
                lineToRelative(-2.1f, 4.51f)
                lineToRelative(-2.72f, -1.27f)
                lineToRelative(1.32f, -2.83f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.64f, 0f, -1.22f, -0.32f, -1.55f, -0.86f)
                reflectiveCurveToRelative(-0.36f, -1.2f, -0.08f, -1.77f)
                close()
            }
        }.also { _TransformerBolt = it}
