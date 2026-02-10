package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareK: ImageVector? = null

val Icons.Rr.SquareK: ImageVector
    get() = _SquareK ?: UXIcon(name = "SquareK") {
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
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(17.74f, 6.67f)
                lineToRelative(-3.99f, 4.43f)
                lineToRelative(4.09f, 6.36f)
                curveToRelative(0.3f, 0.46f, 0.16f, 1.08f, -0.3f, 1.38f)
                curveToRelative(-0.17f, 0.11f, -0.35f, 0.16f, -0.54f, 0.16f)
                curveToRelative(-0.33f, 0f, -0.65f, -0.16f, -0.84f, -0.46f)
                lineToRelative(-4.21f, -6.54f)
                horizontalLineToRelative(-3.96f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(6.0f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4.05f)
                lineToRelative(4.2f, -4.67f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.44f, 1.41f, -0.07f)
                reflectiveCurveToRelative(0.44f, 1.0f, 0.07f, 1.41f)
                close()
            }
        }.also { _SquareK = it}
