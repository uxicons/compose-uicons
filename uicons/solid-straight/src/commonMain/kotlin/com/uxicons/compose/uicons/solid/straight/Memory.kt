package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Memory: ImageVector? = null

val Icons.Ss.Memory: ImageVector
    get() = _Memory ?: UXIcon(name = "Memory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.04f, 18f)
                lineTo(24f, 18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                verticalLineToRelative(-1.5f)
                lineTo(0.04f, 20.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(24f, 16f)
                lineTo(0.04f, 16f)
                verticalLineToRelative(-4f)
                reflectiveCurveToRelative(2f, -0.58f, 2f, -2.5f)
                reflectiveCurveTo(0.04f, 7f, 0.04f, 7f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0.19f, -1.47f, 1.44f, -2.62f, 2.96f, -2.62f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(-2f, 0.58f, -2f, 2.5f)
                reflectiveCurveToRelative(1.95f, 2.48f, 1.99f, 2.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 13f)
                horizontalLineToRelative(2f)
                lineTo(8f, 5f)
                close()
                moveTo(13f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 13f)
                horizontalLineToRelative(2f)
                lineTo(13f, 5f)
                close()
                moveTo(18f, 5f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 13f)
                horizontalLineToRelative(2f)
                lineTo(18f, 5f)
                close()
            }
        }.also { _Memory = it}
