package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowDownToLine: ImageVector? = null

val Icons.Sr.TentArrowDownToLine: ImageVector
    get() = _TentArrowDownToLine ?: UXIcon(name = "TentArrowDownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.27f, 5.32f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.15f)
                lineTo(4f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.42f)
                lineToRelative(2.32f, -2.15f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-2.61f, 2.43f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.84f, -2.06f, 0.84f)
                curveToRelative(-0.76f, 0f, -1.52f, -0.29f, -2.1f, -0.87f)
                lineTo(0.32f, 6.73f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                close()
                moveTo(14.0f, 19f)
                curveToRelative(-0.1f, 0f, -0.35f, 0.03f, -0.47f, 0.3f)
                lineToRelative(-2.54f, 4.7f)
                horizontalLineToRelative(6.03f)
                lineToRelative(-2.52f, -4.64f)
                curveToRelative(-0.15f, -0.33f, -0.4f, -0.36f, -0.5f, -0.36f)
                close()
                moveTo(23.6f, 17.94f)
                curveToRelative(-0.02f, -0.05f, -5.82f, -8.62f, -5.82f, -8.62f)
                curveToRelative(-1.11f, -1.55f, -2.35f, -2.31f, -3.78f, -2.31f)
                curveToRelative(-1.67f, 0f, -2.52f, 0.84f, -3.72f, 2.24f)
                curveToRelative(-0.03f, 0.03f, -5.85f, 8.65f, -5.87f, 8.7f)
                curveToRelative(-0.61f, 1.32f, -0.52f, 2.83f, 0.26f, 4.06f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.71f)
                lineToRelative(3.03f, -5.6f)
                curveToRelative(0.39f, -0.84f, 1.27f, -1.4f, 2.26f, -1.4f)
                reflectiveCurveToRelative(1.87f, 0.56f, 2.29f, 1.46f)
                lineToRelative(3.0f, 5.54f)
                horizontalLineToRelative(0.43f)
                curveToRelative(1.47f, 0f, 2.81f, -0.74f, 3.6f, -1.98f)
                curveToRelative(0.79f, -1.23f, 0.89f, -2.76f, 0.27f, -4.09f)
                close()
            }
        }.also { _TentArrowDownToLine = it}
