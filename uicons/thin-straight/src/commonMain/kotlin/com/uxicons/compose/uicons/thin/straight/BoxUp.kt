package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxUp: ImageVector? = null

val Icons.Ts.BoxUp: ImageVector
    get() = _BoxUp ?: UXIcon(name = "BoxUp") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(9f, 19f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                lineTo(9f, 20f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18.44f, 8.39f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.32f, -2.32f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(-2.5f, -2.5f)
                verticalLineToRelative(7.63f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-2.32f, 2.32f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.59f, -2.59f)
                curveToRelative(0.52f, -0.52f, 1.36f, -0.52f, 1.88f, 0f)
                lineToRelative(2.06f, 2.06f)
                lineToRelative(2.06f, -2.06f)
                curveToRelative(0.52f, -0.52f, 1.36f, -0.52f, 1.88f, 0f)
                close()
            }
        }.also { _BoxUp = it}
