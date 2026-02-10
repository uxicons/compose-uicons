package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareX: ImageVector? = null

val Icons.Tr.SquareX: ImageVector
    get() = _SquareX ?: UXIcon(name = "SquareX") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(18.88f, 4.83f)
                lineToRelative(-6.22f, 7.17f)
                lineToRelative(6.22f, 7.17f)
                curveToRelative(0.18f, 0.21f, 0.16f, 0.52f, -0.05f, 0.7f)
                curveToRelative(-0.1f, 0.08f, -0.21f, 0.12f, -0.33f, 0.12f)
                curveToRelative(-0.14f, 0f, -0.28f, -0.06f, -0.38f, -0.17f)
                lineToRelative(-6.12f, -7.06f)
                lineToRelative(-6.12f, 7.06f)
                curveToRelative(-0.1f, 0.11f, -0.24f, 0.17f, -0.38f, 0.17f)
                curveToRelative(-0.12f, 0f, -0.23f, -0.04f, -0.33f, -0.12f)
                curveToRelative(-0.21f, -0.18f, -0.23f, -0.5f, -0.05f, -0.7f)
                lineToRelative(6.22f, -7.17f)
                lineToRelative(-6.22f, -7.17f)
                curveToRelative(-0.18f, -0.21f, -0.16f, -0.52f, 0.05f, -0.7f)
                curveToRelative(0.21f, -0.18f, 0.52f, -0.16f, 0.7f, 0.05f)
                lineToRelative(6.12f, 7.06f)
                lineToRelative(6.12f, -7.06f)
                curveToRelative(0.18f, -0.21f, 0.5f, -0.23f, 0.7f, -0.05f)
                curveToRelative(0.21f, 0.18f, 0.23f, 0.5f, 0.05f, 0.7f)
                close()
            }
        }.also { _SquareX = it}
