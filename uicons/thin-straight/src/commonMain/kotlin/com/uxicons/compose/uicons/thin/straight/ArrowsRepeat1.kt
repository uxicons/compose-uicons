package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat1: ImageVector? = null

val Icons.Ts.ArrowsRepeat1: ImageVector
    get() = _ArrowsRepeat1 ?: UXIcon(name = "ArrowsRepeat1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                verticalLineToRelative(-6.35f)
                lineToRelative(-2.14f, 2.2f)
                lineToRelative(-0.72f, -0.7f)
                lineToRelative(3.07f, -3.15f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(15.78f)
                lineToRelative(-3.77f, 3.77f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.79f, -3.79f)
                curveToRelative(0.65f, -0.65f, 0.65f, -1.71f, 0f, -2.36f)
                lineToRelative(-3.79f, -3.79f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.77f, 3.77f)
                lineTo(7f, 5.0f)
                curveTo(3.14f, 5f, 0f, 8.14f, 0f, 12f)
                lineTo(1f, 12f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                lineTo(1.22f, 18f)
                lineToRelative(3.77f, -3.77f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.49f, 17.32f)
                curveToRelative(-0.65f, 0.65f, -0.65f, 1.71f, 0f, 2.36f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.77f, -3.77f)
                horizontalLineToRelative(15.78f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowsRepeat1 = it}
