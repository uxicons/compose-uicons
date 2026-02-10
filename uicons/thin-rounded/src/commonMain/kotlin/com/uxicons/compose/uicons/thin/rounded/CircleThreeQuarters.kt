package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleThreeQuarters: ImageVector? = null

val Icons.Tr.CircleThreeQuarters: ImageVector
    get() = _CircleThreeQuarters ?: UXIcon(name = "CircleThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.91f, 24f)
                curveToRelative(-1.51f, 0f, -3.02f, -0.29f, -4.49f, -0.89f)
                curveToRelative(-2.96f, -1.19f, -5.34f, -3.58f, -6.53f, -6.54f)
                curveTo(-0.46f, 13.23f, -0.26f, 9.65f, 1.44f, 6.49f)
                curveTo(3.22f, 3.18f, 6.44f, 0.78f, 10.05f, 0.05f)
                curveToRelative(0.71f, -0.14f, 1.45f, 0.04f, 2.02f, 0.51f)
                curveToRelative(0.59f, 0.48f, 0.93f, 1.2f, 0.93f, 1.96f)
                verticalLineTo(11f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.76f, 0f, 1.47f, 0.34f, 1.96f, 0.93f)
                curveToRelative(0.47f, 0.57f, 0.65f, 1.31f, 0.51f, 2.02f)
                curveToRelative(-0.73f, 3.61f, -3.14f, 6.83f, -6.44f, 8.61f)
                curveToRelative(-1.78f, 0.96f, -3.68f, 1.44f, -5.61f, 1.44f)
                close()
                moveTo(10.53f, 1f)
                curveToRelative(-0.09f, 0f, -0.18f, 0f, -0.28f, 0.03f)
                curveTo(6.92f, 1.7f, 3.96f, 3.92f, 2.32f, 6.96f)
                curveToRelative(-1.56f, 2.89f, -1.74f, 6.17f, -0.5f, 9.24f)
                curveToRelative(1.09f, 2.71f, 3.27f, 4.89f, 5.98f, 5.98f)
                curveToRelative(3.07f, 1.24f, 6.35f, 1.06f, 9.25f, -0.5f)
                curveToRelative(3.05f, -1.64f, 5.27f, -4.6f, 5.94f, -7.93f)
                curveToRelative(0.08f, -0.42f, -0.03f, -0.85f, -0.3f, -1.19f)
                curveToRelative(-0.29f, -0.36f, -0.72f, -0.56f, -1.18f, -0.56f)
                horizontalLineTo(12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(2.51f)
                curveToRelative(0f, -0.46f, -0.2f, -0.89f, -0.56f, -1.18f)
                curveToRelative(-0.26f, -0.22f, -0.58f, -0.33f, -0.91f, -0.33f)
                close()
            }
        }.also { _CircleThreeQuarters = it}
