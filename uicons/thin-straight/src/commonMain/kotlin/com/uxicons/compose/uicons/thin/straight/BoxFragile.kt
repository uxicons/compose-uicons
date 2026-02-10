package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxFragile: ImageVector? = null

val Icons.Ts.BoxFragile: ImageVector
    get() = _BoxFragile ?: UXIcon(name = "BoxFragile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                curveToRelative(0f, 2.59f, 1.98f, 4.72f, 4.5f, 4.97f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.02f)
                curveToRelative(2.52f, -0.25f, 4.5f, -2.39f, 4.5f, -4.97f)
                lineTo(17f, 4f)
                lineTo(7f, 4f)
                verticalLineToRelative(7f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(3.82f)
                lineToRelative(-2.15f, 4f)
                horizontalLineToRelative(2.98f)
                lineToRelative(-1.57f, 2.75f)
                lineToRelative(0.87f, 0.5f)
                lineToRelative(2.43f, -4.25f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(1.62f, -3f)
                horizontalLineToRelative(3.05f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                lineTo(8f, 5f)
                close()
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
            }
        }.also { _BoxFragile = it}
