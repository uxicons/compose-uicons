package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Tr.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.2f, 0f, -2.33f, -0.47f, -3.18f, -1.32f)
                curveToRelative(-0.85f, -0.85f, -1.32f, -1.98f, -1.32f, -3.18f)
                verticalLineTo(9.5f)
                curveToRelative(0f, -2.48f, 2.01f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.51f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.94f, 0.37f, 1.81f, 1.03f, 2.48f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.47f, 1.02f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(9.51f)
                curveToRelative(0f, -0.94f, -0.37f, -1.82f, -1.03f, -2.48f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.47f, -1.02f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.49f)
                reflectiveCurveToRelative(0.01f, 0f, 0.01f, 0f)
                curveToRelative(1.2f, 0f, 2.33f, 0.47f, 3.18f, 1.31f)
                curveToRelative(0.85f, 0.85f, 1.32f, 1.98f, 1.32f, 3.19f)
                verticalLineToRelative(9.99f)
                close()
                moveTo(7.35f, 13.14f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.18f, -0.71f, 0.02f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                lineToRelative(3.58f, 3.41f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.29f, -0.26f, 1.76f, -0.72f)
                lineToRelative(3.59f, -3.41f)
                curveToRelative(0.2f, -0.19f, 0.21f, -0.51f, 0.02f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.21f, -0.71f, -0.02f)
                lineToRelative(-3.59f, 3.42f)
                curveToRelative(-0.16f, 0.16f, -0.35f, 0.28f, -0.56f, 0.35f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(16.91f)
                curveToRelative(-0.21f, -0.07f, -0.4f, -0.19f, -0.57f, -0.35f)
                lineToRelative(-3.59f, -3.41f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
