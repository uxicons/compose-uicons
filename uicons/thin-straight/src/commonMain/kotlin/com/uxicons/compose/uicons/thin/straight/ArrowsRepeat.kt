package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat: ImageVector? = null

val Icons.Ts.ArrowsRepeat: ImageVector
    get() = _ArrowsRepeat ?: UXIcon(name = "ArrowsRepeat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                lineTo(0f, 12f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                horizontalLineToRelative(15.78f)
                lineToRelative(-3.77f, -3.77f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.79f, 3.79f)
                curveToRelative(0.65f, 0.65f, 0.65f, 1.71f, 0f, 2.36f)
                lineToRelative(-3.79f, 3.79f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.77f, -3.77f)
                lineTo(7f, 6.0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
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
        }.also { _ArrowsRepeat = it}
