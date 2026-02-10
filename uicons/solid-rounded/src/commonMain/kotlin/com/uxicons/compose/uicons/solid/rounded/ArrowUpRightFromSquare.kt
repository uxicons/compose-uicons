package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightFromSquare: ImageVector? = null

val Icons.Sr.ArrowUpRightFromSquare: ImageVector
    get() = _ArrowUpRightFromSquare ?: UXIcon(name = "ArrowUpRightFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineTo(5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineTo(13.5f)
                curveToRelative(0.4f, 0f, 0.77f, 0.24f, 0.92f, 0.62f)
                curveToRelative(0.15f, 0.37f, 0.07f, 0.8f, -0.22f, 1.09f)
                lineToRelative(-7.32f, 7.32f)
                curveToRelative(-1.1f, 1.1f, -1.14f, 2.86f, -0.08f, 4.0f)
                curveToRelative(0.54f, 0.58f, 1.27f, 0.91f, 2.06f, 0.93f)
                curveToRelative(0.78f, 0.02f, 1.54f, -0.28f, 2.1f, -0.85f)
                lineToRelative(7.32f, -7.32f)
                curveToRelative(0.29f, -0.29f, 0.71f, -0.37f, 1.09f, -0.22f)
                curveToRelative(0.37f, 0.15f, 0.62f, 0.52f, 0.62f, 0.92f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6.59f)
                lineTo(8.29f, 14.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineTo(22f, 3.41f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ArrowUpRightFromSquare = it}
