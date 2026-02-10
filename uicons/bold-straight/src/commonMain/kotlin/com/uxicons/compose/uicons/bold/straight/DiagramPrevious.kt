package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramPrevious: ImageVector? = null

val Icons.Bs.DiagramPrevious: ImageVector
    get() = _DiagramPrevious ?: UXIcon(name = "DiagramPrevious") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 10f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, -3.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, 3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(0f, 14f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-6.5f)
                lineTo(13.5f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                lineTo(21f, 17f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4.64f)
                lineToRelative(-5.24f, -5.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.23f, -0.02f)
                lineToRelative(-5.26f, 5.14f)
                lineTo(0f, 10f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _DiagramPrevious = it}
