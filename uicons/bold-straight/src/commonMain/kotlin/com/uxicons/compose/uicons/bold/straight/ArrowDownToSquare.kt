package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Bs.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8.51f)
                verticalLineToRelative(15.49f)
                horizontalLineTo(2f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(14f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.18f, -0.09f, -0.29f, -0.14f, -0.34f)
                reflectiveCurveToRelative(-0.17f, -0.15f, -0.35f, -0.15f)
                horizontalLineToRelative(-2.51f)
                reflectiveCurveToRelative(0f, -3.01f, 0f, -3.01f)
                horizontalLineToRelative(2.51f)
                curveToRelative(0.93f, 0f, 1.81f, 0.37f, 2.48f, 1.04f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.01f, 2.47f)
                close()
                moveTo(6.28f, 13.02f)
                lineToRelative(3.95f, 4.26f)
                curveToRelative(0.48f, 0.48f, 1.11f, 0.73f, 1.75f, 0.73f)
                reflectiveCurveToRelative(1.31f, -0.25f, 1.82f, -0.77f)
                lineToRelative(3.91f, -4.22f)
                lineToRelative(-2.2f, -2.04f)
                lineToRelative(-2.02f, 2.18f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(13.15f)
                lineToRelative(-2.02f, -2.17f)
                lineToRelative(-2.2f, 2.04f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
