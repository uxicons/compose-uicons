package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsdSquare: ImageVector? = null

val Icons.Sr.UsdSquare: ImageVector
    get() = _UsdSquare ?: UXIcon(name = "UsdSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(13f, 17f)
                verticalLineToRelative(1f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-0.27f)
                curveToRelative(-1.07f, 0f, -2.06f, -0.57f, -2.6f, -1.5f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.36f, -1.37f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.36f)
                curveToRelative(0.18f, 0.31f, 0.51f, 0.5f, 0.87f, 0.5f)
                horizontalLineToRelative(2.27f)
                curveToRelative(1.0f, 0.07f, 1.44f, -1.55f, 0.36f, -1.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-3.5f, -0.65f, -2.75f, -5.75f, 0.69f, -5.73f)
                verticalLineToRelative(-1f)
                curveToRelative(0.01f, -1.31f, 2.0f, -1.31f, 2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(0.27f)
                curveToRelative(1.07f, 0f, 2.06f, 0.57f, 2.6f, 1.5f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.36f, 1.37f)
                curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.36f)
                curveToRelative(-0.18f, -0.31f, -0.51f, -0.5f, -0.87f, -0.5f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-1.0f, -0.07f, -1.44f, 1.55f, -0.36f, 1.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(3.5f, 0.65f, 2.75f, 5.75f, -0.69f, 5.73f)
                close()
            }
        }.also { _UsdSquare = it}
