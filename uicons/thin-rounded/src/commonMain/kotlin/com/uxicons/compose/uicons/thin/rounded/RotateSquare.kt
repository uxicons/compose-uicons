package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Tr.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(19f, 5.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.68f)
                curveToRelative(-1.07f, -1.85f, -3.03f, -3f, -5.18f, -3f)
                curveToRelative(-3.12f, 0f, -5.75f, 2.43f, -5.98f, 5.54f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, -0.0f)
                curveToRelative(-0.28f, -0.02f, -0.48f, -0.26f, -0.46f, -0.54f)
                curveToRelative(0.28f, -3.62f, 3.34f, -6.46f, 6.98f, -6.46f)
                curveToRelative(2.48f, 0f, 4.74f, 1.31f, 6f, 3.42f)
                verticalLineToRelative(-2.92f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(18.98f, 12.54f)
                curveToRelative(-0.28f, 3.62f, -3.34f, 6.46f, -6.98f, 6.46f)
                curveToRelative(-2.48f, 0f, -4.74f, -1.31f, -6f, -3.42f)
                verticalLineToRelative(2.92f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.68f)
                curveToRelative(1.07f, 1.85f, 3.03f, 3f, 5.18f, 3f)
                curveToRelative(3.12f, 0f, 5.75f, -2.43f, 5.98f, -5.54f)
                curveToRelative(0.02f, -0.28f, 0.28f, -0.48f, 0.54f, -0.46f)
                curveToRelative(0.28f, 0.02f, 0.48f, 0.26f, 0.46f, 0.54f)
                close()
            }
        }.also { _RotateSquare = it}
