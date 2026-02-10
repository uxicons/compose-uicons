package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Sr.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.99f, 10.01f)
                verticalLineToRelative(8.99f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineTo(7f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-1.33f, 0f, -2.59f, -0.52f, -3.54f, -1.46f)
                curveToRelative(-0.94f, -0.94f, -1.46f, -2.2f, -1.46f, -3.54f)
                verticalLineTo(10f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(0f, 0f, 1.87f, 0f, 4f, 0f)
                verticalLineTo(15.43f)
                lineToRelative(-3.31f, -3.15f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.37f, -1.41f, 0.03f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.04f, 1.41f)
                lineToRelative(3.57f, 3.4f)
                curveToRelative(0.59f, 0.59f, 1.36f, 0.88f, 2.13f, 0.88f)
                reflectiveCurveToRelative(1.52f, -0.29f, 2.1f, -0.86f)
                lineToRelative(3.59f, -3.41f)
                curveToRelative(0.4f, -0.38f, 0.42f, -1.01f, 0.04f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.03f)
                lineToRelative(-3.31f, 3.15f)
                verticalLineTo(5f)
                curveToRelative(2.12f, 0f, 3.99f, 0f, 4f, 0f)
                curveToRelative(1.33f, 0f, 2.59f, 0.52f, 3.53f, 1.46f)
                curveToRelative(0.95f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
                close()
                moveTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(5f)
                curveToRelative(0.66f, 0f, 1.34f, 0f, 2f, 0f)
                verticalLineTo(1f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
