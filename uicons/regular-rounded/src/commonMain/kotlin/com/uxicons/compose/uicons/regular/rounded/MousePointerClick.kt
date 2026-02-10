package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MousePointerClick: ImageVector? = null

val Icons.Rr.MousePointerClick: ImageVector
    get() = _MousePointerClick ?: UXIcon(name = "MousePointerClick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(6f, 9f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(6.31f, 3.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(16.24f, 6.76f)
                curveToRelative(0.26f, 0f, 0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                close()
                moveTo(22.04f, 16.85f)
                curveToRelative(-0.12f, 0.36f, -0.43f, 0.62f, -0.81f, 0.67f)
                lineToRelative(-2.69f, 0.38f)
                lineToRelative(0.72f, 1.61f)
                curveToRelative(0.68f, 1.33f, 0.31f, 3.02f, -0.88f, 3.89f)
                curveToRelative(-1.46f, 1.12f, -3.73f, 0.59f, -4.54f, -1.06f)
                lineToRelative(-0.89f, -1.95f)
                lineToRelative(-2.3f, 2.01f)
                curveToRelative(-0.3f, 0.26f, -0.71f, 0.32f, -1.07f, 0.16f)
                curveToRelative(-0.36f, -0.16f, -0.59f, -0.52f, -0.59f, -0.91f)
                verticalLineToRelative(-11.86f)
                curveToRelative(0f, -1.11f, 0.62f, -2.08f, 1.63f, -2.54f)
                curveToRelative(1.01f, -0.46f, 2.15f, -0.3f, 2.99f, 0.43f)
                lineToRelative(8.18f, 8.14f)
                curveToRelative(0.27f, 0.27f, 0.36f, 0.67f, 0.24f, 1.02f)
                close()
                moveTo(18.96f, 15.82f)
                lineTo(12.26f, 9.15f)
                curveToRelative(-0.29f, -0.25f, -0.65f, -0.14f, -0.8f, -0.07f)
                curveToRelative(-0.14f, 0.06f, -0.46f, 0.26f, -0.46f, 0.72f)
                verticalLineToRelative(9.65f)
                lineToRelative(1.65f, -1.44f)
                curveToRelative(0.24f, -0.21f, 0.56f, -0.29f, 0.87f, -0.23f)
                curveToRelative(0.31f, 0.07f, 0.57f, 0.27f, 0.7f, 0.56f)
                lineToRelative(1.43f, 3.12f)
                curveToRelative(0.12f, 0.23f, 0.38f, 0.43f, 0.68f, 0.5f)
                curveToRelative(0.31f, 0.07f, 0.62f, 0.01f, 0.88f, -0.18f)
                curveToRelative(0.4f, -0.29f, 0.51f, -0.91f, 0.26f, -1.42f)
                lineToRelative(-1.29f, -2.87f)
                curveToRelative(-0.13f, -0.29f, -0.12f, -0.62f, 0.04f, -0.89f)
                reflectiveCurveToRelative(0.43f, -0.46f, 0.74f, -0.51f)
                lineToRelative(2.02f, -0.28f)
                close()
            }
        }.also { _MousePointerClick = it}
