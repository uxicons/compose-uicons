package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareQ: ImageVector? = null

val Icons.Rr.SquareQ: ImageVector
    get() = _SquareQ ?: UXIcon(name = "SquareQ") {
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
                moveTo(16.87f, 16.46f)
                curveToRelative(0.7f, -0.99f, 1.11f, -2.2f, 1.11f, -3.51f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -3.34f, -2.69f, -6.05f, -5.99f, -6.05f)
                reflectiveCurveToRelative(-6.01f, 2.72f, -6.01f, 6.05f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 3.34f, 2.7f, 6.05f, 6.01f, 6.05f)
                curveToRelative(1.29f, 0f, 2.49f, -0.41f, 3.47f, -1.12f)
                lineToRelative(0.83f, 0.83f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.83f, -0.83f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.21f, 0f, -4.01f, -1.82f, -4.01f, -4.05f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -2.23f, 1.8f, -4.05f, 4.01f, -4.05f)
                curveToRelative(2.24f, 0f, 3.99f, 1.78f, 3.99f, 4.05f)
                verticalLineToRelative(1.89f)
                curveToRelative(0f, 0.77f, -0.2f, 1.48f, -0.55f, 2.08f)
                lineToRelative(-1.73f, -1.73f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.74f, 1.74f)
                curveToRelative(-0.59f, 0.35f, -1.29f, 0.55f, -2.04f, 0.55f)
                close()
            }
        }.also { _SquareQ = it}
