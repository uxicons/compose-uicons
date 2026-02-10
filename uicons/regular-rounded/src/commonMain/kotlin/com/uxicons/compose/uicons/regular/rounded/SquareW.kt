package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareW: ImageVector? = null

val Icons.Rr.SquareW: ImageVector
    get() = _SquareW ?: UXIcon(name = "SquareW") {
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
                moveTo(18.99f, 6.15f)
                lineToRelative(-1.75f, 11.35f)
                curveToRelative(-0.12f, 0.8f, -0.74f, 1.49f, -1.75f, 1.49f)
                curveToRelative(-0.72f, 0f, -1.36f, -0.43f, -1.63f, -1.12f)
                lineToRelative(-1.85f, -4.76f)
                lineToRelative(-1.85f, 4.76f)
                curveToRelative(-0.29f, 0.75f, -1.05f, 1.19f, -1.84f, 1.11f)
                curveToRelative(-0.8f, -0.09f, -1.43f, -0.69f, -1.55f, -1.48f)
                lineToRelative(-1.75f, -11.35f)
                curveToRelative(-0.08f, -0.55f, 0.29f, -1.06f, 0.84f, -1.14f)
                curveToRelative(0.55f, -0.08f, 1.06f, 0.29f, 1.14f, 0.84f)
                lineToRelative(1.61f, 10.48f)
                lineToRelative(2.47f, -6.33f)
                curveToRelative(0.15f, -0.38f, 0.52f, -0.64f, 0.93f, -0.64f)
                reflectiveCurveToRelative(0.78f, 0.25f, 0.93f, 0.64f)
                lineToRelative(2.47f, 6.33f)
                lineToRelative(1.61f, -10.48f)
                curveToRelative(0.08f, -0.55f, 0.6f, -0.92f, 1.14f, -0.84f)
                curveToRelative(0.55f, 0.08f, 0.92f, 0.59f, 0.84f, 1.14f)
                close()
            }
        }.also { _SquareW = it}
