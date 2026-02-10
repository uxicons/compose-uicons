package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortShapesDown: ImageVector? = null

val Icons.Tr.SortShapesDown: ImageVector
    get() = _SortShapesDown ?: UXIcon(name = "SortShapesDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 10f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(14f, 7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(15f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(22f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(15f, 3.5f)
                close()
                moveTo(10.86f, 19.16f)
                curveToRelative(0.19f, 0.2f, 0.18f, 0.52f, -0.02f, 0.71f)
                lineToRelative(-3.59f, 3.41f)
                curveToRelative(-0.46f, 0.46f, -1.09f, 0.72f, -1.76f, 0.72f)
                reflectiveCurveToRelative(-1.3f, -0.26f, -1.77f, -0.73f)
                lineTo(0.16f, 19.86f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.51f, -0.02f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.02f)
                lineToRelative(3.59f, 3.41f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.28f, 0.57f, 0.35f)
                lineTo(5.01f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(6.01f, 22.91f)
                curveToRelative(0.21f, -0.07f, 0.4f, -0.19f, 0.56f, -0.35f)
                lineToRelative(3.59f, -3.42f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.02f)
                close()
                moveTo(23.32f, 20.08f)
                lineToRelative(-3.09f, -5.04f)
                curveToRelative(-0.35f, -0.64f, -1f, -1.03f, -1.73f, -1.03f)
                reflectiveCurveToRelative(-1.38f, 0.38f, -1.72f, 1.01f)
                lineToRelative(-3.12f, 5.09f)
                curveToRelative(-0.33f, 0.62f, -0.32f, 1.34f, 0.04f, 1.94f)
                reflectiveCurveToRelative(0.99f, 0.96f, 1.69f, 0.96f)
                horizontalLineToRelative(6.21f)
                curveToRelative(0.7f, 0f, 1.33f, -0.36f, 1.69f, -0.96f)
                reflectiveCurveToRelative(0.37f, -1.33f, 0.03f, -1.97f)
                close()
                moveTo(22.43f, 21.54f)
                curveToRelative(-0.18f, 0.3f, -0.49f, 0.47f, -0.83f, 0.47f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-0.34f, 0f, -0.65f, -0.18f, -0.83f, -0.47f)
                curveToRelative(-0.18f, -0.3f, -0.18f, -0.65f, -0.03f, -0.93f)
                lineToRelative(3.12f, -5.09f)
                curveToRelative(0.17f, -0.32f, 0.49f, -0.51f, 0.85f, -0.51f)
                reflectiveCurveToRelative(0.68f, 0.19f, 0.86f, 0.53f)
                lineToRelative(3.09f, 5.04f)
                curveToRelative(0.16f, 0.3f, 0.16f, 0.66f, -0.02f, 0.96f)
                close()
            }
        }.also { _SortShapesDown = it}
