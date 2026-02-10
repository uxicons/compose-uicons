package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyImage: ImageVector? = null

val Icons.Sr.CopyImage: ImageVector
    get() = _CopyImage ?: UXIcon(name = "CopyImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(10f, 2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.07f, 0.34f, 2.06f, 0.91f, 2.87f)
                lineToRelative(6.1f, -6.1f)
                curveToRelative(1.01f, -1.01f, 2.66f, -1.02f, 3.68f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.23f, 0.23f, 0.62f, 0.23f, 0.85f, 0f)
                lineToRelative(5.95f, -5.95f)
                curveToRelative(-0.8f, -1.69f, -2.53f, -2.86f, -4.52f, -2.86f)
                close()
                moveTo(9.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 7.21f)
                verticalLineToRelative(5.79f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(10f, 18f)
                curveToRelative(-0.97f, 0f, -1.87f, -0.28f, -2.64f, -0.75f)
                lineToRelative(6.06f, -6.06f)
                curveToRelative(0.23f, -0.23f, 0.62f, -0.23f, 0.85f, 0f)
                lineToRelative(1.04f, 1.04f)
                curveToRelative(0.98f, 0.98f, 2.69f, 0.98f, 3.67f, 0f)
                lineToRelative(5.02f, -5.02f)
                close()
                moveTo(18f, 20f)
                curveToRelative(-0.91f, 1.21f, -2.37f, 2f, -4f, 2f)
                lineTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.06f, 1.25f, -3.83f, 3.03f, -4.59f)
                curveToRelative(-0.02f, 0.2f, -0.03f, 0.39f, -0.03f, 0.59f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _CopyImage = it}
