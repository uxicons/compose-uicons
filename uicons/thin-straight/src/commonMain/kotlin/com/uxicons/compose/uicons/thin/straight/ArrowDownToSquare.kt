package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownToSquare: ImageVector? = null

val Icons.Ts.ArrowDownToSquare: ImageVector
    get() = _ArrowDownToSquare ?: UXIcon(name = "ArrowDownToSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7.5f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                reflectiveCurveTo(2f, 7.5f, 2f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(15.51f)
                horizontalLineTo(21f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -0.4f, -0.15f, -0.77f, -0.43f, -1.05f)
                curveToRelative(-0.28f, -0.29f, -0.66f, -0.44f, -1.06f, -0.44f)
                horizontalLineToRelative(-4.51f)
                reflectiveCurveToRelative(0f, -1.01f, 0f, -1.01f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.67f, 0f, 1.3f, 0.27f, 1.77f, 0.74f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.72f, 1.76f)
                close()
                moveTo(6.83f, 11.66f)
                lineToRelative(-0.73f, 0.68f)
                lineToRelative(4.84f, 5.22f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.78f, -0.15f, 1.08f, -0.45f)
                lineToRelative(4.83f, -5.21f)
                lineToRelative(-0.73f, -0.68f)
                lineToRelative(-4.67f, 5.04f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(16.7f)
                lineToRelative(-4.67f, -5.04f)
                close()
            }
        }.also { _ArrowDownToSquare = it}
