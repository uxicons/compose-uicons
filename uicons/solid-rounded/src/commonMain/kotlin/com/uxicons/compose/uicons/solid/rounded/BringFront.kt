package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BringFront: ImageVector? = null

val Icons.Sr.BringFront: ImageVector
    get() = _BringFront ?: UXIcon(name = "BringFront") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(4f, 10f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(0f)
                curveToRelative(0.58f, 0f, 1f, -0.56f, 0.84f, -1.12f)
                curveToRelative(-0.48f, -1.66f, -2.02f, -2.88f, -3.84f, -2.88f)
                horizontalLineToRelative(-3f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.82f, 1.22f, 3.36f, 2.88f, 3.84f)
                curveToRelative(0.56f, 0.16f, 1.12f, -0.26f, 1.12f, -0.84f)
                horizontalLineToRelative(0f)
                close()
                moveTo(20f, 14f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.58f, 0f, -1f, 0.56f, -0.84f, 1.12f)
                curveToRelative(0.48f, 1.66f, 2.02f, 2.88f, 3.84f, 2.88f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.82f, -1.22f, -3.36f, -2.88f, -3.84f)
                curveToRelative(-0.56f, -0.16f, -1.12f, 0.26f, -1.12f, 0.84f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _BringFront = it}
