package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Ss.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.99f, 8.01f)
                verticalLineToRelative(15.99f)
                horizontalLineTo(2f)
                reflectiveCurveToRelative(0f, -15.99f, 0f, -15.99f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                verticalLineTo(14.92f)
                lineToRelative(-3.8f, -4.1f)
                lineToRelative(-1.47f, 1.36f)
                lineToRelative(4.86f, 5.23f)
                curveToRelative(0.39f, 0.39f, 0.89f, 0.58f, 1.4f, 0.58f)
                reflectiveCurveToRelative(1.04f, -0.2f, 1.45f, -0.61f)
                lineToRelative(4.83f, -5.21f)
                lineToRelative(-1.47f, -1.36f)
                lineToRelative(-3.8f, 4.15f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.8f, 0f, 1.56f, 0.32f, 2.13f, 0.89f)
                curveToRelative(0.56f, 0.57f, 0.87f, 1.32f, 0.87f, 2.11f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, -5f, 0f, -5f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
