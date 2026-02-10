package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareZ: ImageVector? = null

val Icons.Rs.SquareZ: ImageVector
    get() = _SquareZ ?: UXIcon(name = "SquareZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(19f)
                close()
                moveTo(7.43f, 17f)
                horizontalLineToRelative(11.57f)
                verticalLineToRelative(2f)
                lineTo(6.77f, 19f)
                curveToRelative(-0.72f, 0f, -1.36f, -0.43f, -1.63f, -1.09f)
                curveToRelative(-0.27f, -0.66f, -0.12f, -1.42f, 0.38f, -1.92f)
                lineToRelative(11.05f, -8.99f)
                lineTo(5f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12.23f)
                curveToRelative(0.72f, 0f, 1.36f, 0.43f, 1.63f, 1.09f)
                curveToRelative(0.27f, 0.66f, 0.12f, 1.42f, -0.38f, 1.92f)
                lineToRelative(-11.05f, 8.99f)
                close()
            }
        }.also { _SquareZ = it}
