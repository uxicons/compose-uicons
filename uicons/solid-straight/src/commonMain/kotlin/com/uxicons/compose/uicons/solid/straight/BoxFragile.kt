package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxFragile: ImageVector? = null

val Icons.Ss.BoxFragile: ImageVector
    get() = _BoxFragile ?: UXIcon(name = "BoxFragile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, 2.41f, -1.72f, 4.43f, -4f, 4.9f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.1f)
                curveToRelative(-2.28f, -0.47f, -4f, -2.48f, -4f, -4.9f)
                lineTo(7f, 4f)
                horizontalLineToRelative(4.25f)
                lineToRelative(-2.22f, 5f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-1.28f, 2.55f)
                lineToRelative(1.79f, 0.9f)
                lineToRelative(2.72f, -5.45f)
                horizontalLineToRelative(-2.98f)
                lineToRelative(1.33f, -3f)
                horizontalLineToRelative(3.56f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _BoxFragile = it}
