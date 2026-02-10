package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Rr.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.95f, 24f)
                horizontalLineToRelative(-5.8f)
                curveToRelative(-1.33f, 0f, -2.59f, -0.52f, -3.54f, -1.46f)
                lineTo(1.52f, 18.44f)
                curveTo(0.57f, 17.49f, 0.05f, 16.23f, 0.05f, 14.9f)
                verticalLineToRelative(-5.8f)
                curveTo(0.05f, 7.77f, 0.57f, 6.51f, 1.52f, 5.56f)
                lineTo(5.62f, 1.46f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                horizontalLineToRelative(5.8f)
                curveToRelative(1.34f, 0f, 2.59f, 0.52f, 3.54f, 1.46f)
                lineToRelative(4.1f, 4.1f)
                curveToRelative(0.94f, 0.94f, 1.46f, 2.2f, 1.46f, 3.54f)
                verticalLineToRelative(5.8f)
                curveToRelative(0f, 1.33f, -0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(-4.1f, 4.1f)
                curveToRelative(-0.94f, 0.94f, -2.2f, 1.46f, -3.54f, 1.46f)
                close()
                moveTo(9.15f, 2f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineTo(2.93f, 6.98f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(5.8f)
                curveToRelative(0f, 0.8f, 0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(4.1f, 4.1f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(5.8f)
                curveToRelative(0.8f, 0f, 1.56f, -0.31f, 2.12f, -0.88f)
                lineToRelative(4.1f, -4.1f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                verticalLineToRelative(-5.8f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                lineToRelative(-4.1f, -4.1f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-5.8f)
                close()
            }
        }.also { _Octagon = it}
