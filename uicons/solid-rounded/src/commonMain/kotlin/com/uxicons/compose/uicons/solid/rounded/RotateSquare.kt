package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Sr.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.02f, 0f, -5.64f, -1.7f, -7f, -4.18f)
                verticalLineToRelative(2.18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(1.04f, 1.79f, 2.96f, 3f, 5.17f, 3f)
                curveToRelative(2.72f, 0f, 5.02f, -1.82f, 5.75f, -4.31f)
                curveToRelative(0.12f, -0.41f, 0.52f, -0.69f, 0.95f, -0.69f)
                horizontalLineToRelative(0f)
                curveToRelative(0.65f, 0f, 1.16f, 0.62f, 0.97f, 1.25f)
                curveToRelative(-0.97f, 3.32f, -4.04f, 5.75f, -7.67f, 5.75f)
                close()
                moveTo(21f, 9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.19f)
                curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.18f, -3f)
                curveToRelative(-2.72f, 0f, -5.02f, 1.82f, -5.75f, 4.31f)
                curveToRelative(-0.12f, 0.41f, -0.52f, 0.69f, -0.95f, 0.69f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.65f, 0f, -1.16f, -0.62f, -0.97f, -1.25f)
                curveToRelative(0.97f, -3.32f, 4.04f, -5.75f, 7.67f, -5.75f)
                curveToRelative(3.02f, 0f, 5.64f, 1.68f, 7f, 4.15f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _RotateSquare = it}
