package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Bs.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                lineTo(20f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 3.01f, -2.4f, 6.5f, -5.5f, 6.5f)
                lineTo(17.21f, 15f)
                lineToRelative(-0.81f, 4f)
                lineTo(3.11f, 19f)
                lineTo(0.07f, 4.1f)
                arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.39f, 0f)
                lineTo(16.11f, 0f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.31f, 4.06f)
                curveTo(22.3f, 4.34f, 24f, 5.95f, 24f, 8.5f)
                close()
                moveTo(16.48f, 3.5f)
                curveToRelative(0.04f, -0.32f, -0.07f, -0.46f, -0.37f, -0.5f)
                lineTo(3.39f, 3f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, 0.47f)
                lineTo(5.56f, 16f)
                horizontalLineToRelative(8.38f)
                close()
                moveTo(21f, 8.5f)
                curveToRelative(0f, -0.43f, 0f, -1.4f, -2.17f, -1.49f)
                lineTo(17.82f, 12f)
                lineTo(18.5f, 12f)
                curveTo(19.64f, 12f, 21f, 10.1f, 21f, 8.5f)
                close()
            }
        }.also { _MugAlt = it}
