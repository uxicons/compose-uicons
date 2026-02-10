package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToLine: ImageVector? = null

val Icons.Ts.ArrowsToLine: ImageVector
    get() = _ArrowsToLine ?: UXIcon(name = "ArrowsToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(0f, 12.5f)
                verticalLineToRelative(-1f)
                lineTo(24f, 11.5f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0.45f, 0f, 0.86f, -0.17f, 1.18f, -0.49f)
                lineToRelative(3.79f, -3.79f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.77f, 3.77f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 7.78f)
                lineToRelative(-3.77f, -3.77f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.79f, 3.79f)
                curveToRelative(0.32f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                close()
                moveTo(10.82f, 15.49f)
                lineToRelative(-3.79f, 3.79f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.77f, -3.77f)
                verticalLineToRelative(7.78f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.78f)
                lineToRelative(3.77f, 3.77f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(-0.63f, -0.63f, -1.73f, -0.63f, -2.36f, 0f)
                close()
            }
        }.also { _ArrowsToLine = it}
