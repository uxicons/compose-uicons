package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsdSquare: ImageVector? = null

val Icons.Bs.UsdSquare: ImageVector
    get() = _UsdSquare ?: UXIcon(name = "UsdSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                close()
                moveTo(16f, 9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 0.29f, 0.18f, 0.56f, 0.45f, 0.67f)
                lineToRelative(2.21f, 0.89f)
                curveToRelative(1.42f, 0.57f, 2.34f, 1.92f, 2.34f, 3.45f)
                curveToRelative(0f, 1.58f, -1.06f, 2.92f, -2.5f, 3.35f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.15f)
                curveToRelative(-1.44f, -0.43f, -2.5f, -1.77f, -2.5f, -3.35f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                curveToRelative(0f, -0.29f, -0.18f, -0.56f, -0.45f, -0.66f)
                lineToRelative(-2.21f, -0.89f)
                curveToRelative(-1.42f, -0.57f, -2.34f, -1.92f, -2.34f, -3.45f)
                curveToRelative(0f, -1.58f, 1.06f, -2.92f, 2.5f, -3.35f)
                verticalLineToRelative(-1.15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.15f)
                curveToRelative(1.44f, 0.43f, 2.5f, 1.77f, 2.5f, 3.35f)
                close()
            }
        }.also { _UsdSquare = it}
