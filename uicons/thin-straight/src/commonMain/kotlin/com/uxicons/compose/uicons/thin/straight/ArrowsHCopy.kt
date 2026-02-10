package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsHCopy: ImageVector? = null

val Icons.Ts.ArrowsHCopy: ImageVector
    get() = _ArrowsHCopy ?: UXIcon(name = "ArrowsHCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.46f, 22.78f)
                verticalLineTo(1.22f)
                lineToRelative(3.77f, 3.77f)
                lineToRelative(0.71f, -0.71f)
                lineTo(13.15f, 0.49f)
                curveToRelative(-0.32f, -0.32f, -0.73f, -0.49f, -1.18f, -0.49f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.45f, 0f, -0.86f, 0.17f, -1.18f, 0.49f)
                lineToRelative(-3.79f, 3.79f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.77f, -3.77f)
                verticalLineTo(22.78f)
                lineToRelative(-3.77f, -3.77f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.79f, 3.79f)
                curveToRelative(0.31f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                horizontalLineToRelative(0f)
                curveToRelative(0.45f, 0f, 0.86f, -0.17f, 1.18f, -0.49f)
                lineToRelative(3.79f, -3.79f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.77f, 3.77f)
                close()
            }
        }.also { _ArrowsHCopy = it}
