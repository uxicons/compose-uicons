package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleThreeQuarters: ImageVector? = null

val Icons.Rr.CircleThreeQuarters: ImageVector
    get() = _CircleThreeQuarters ?: UXIcon(name = "CircleThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.98f, 24f)
                curveToRelative(-0.44f, 0f, -0.89f, -0.02f, -1.34f, -0.07f)
                curveTo(5.13f, 23.32f, 0.68f, 18.87f, 0.08f, 13.36f)
                curveTo(-0.61f, 7.2f, 3.5f, 1.36f, 9.43f, 0.07f)
                curveToRelative(0.86f, -0.19f, 1.75f, 0.03f, 2.44f, 0.58f)
                curveToRelative(0.72f, 0.58f, 1.13f, 1.44f, 1.13f, 2.36f)
                verticalLineToRelative(7.99f)
                horizontalLineToRelative(7.99f)
                curveToRelative(0.92f, 0f, 1.78f, 0.41f, 2.36f, 1.13f)
                curveToRelative(0.56f, 0.69f, 0.77f, 1.58f, 0.58f, 2.44f)
                curveToRelative(-1.2f, 5.49f, -6.31f, 9.43f, -11.96f, 9.43f)
                close()
                moveTo(10.04f, 2f)
                curveToRelative(-0.06f, 0f, -0.12f, 0f, -0.19f, 0.02f)
                curveTo(4.92f, 3.1f, 1.49f, 7.98f, 2.06f, 13.14f)
                curveToRelative(0.51f, 4.59f, 4.21f, 8.29f, 8.79f, 8.79f)
                curveToRelative(5.17f, 0.58f, 10.05f, -2.85f, 11.12f, -7.79f)
                curveToRelative(0.08f, -0.36f, -0.08f, -0.63f, -0.19f, -0.76f)
                curveToRelative(-0.2f, -0.25f, -0.49f, -0.39f, -0.8f, -0.39f)
                horizontalLineTo(12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(3.01f)
                curveToRelative(0f, -0.31f, -0.14f, -0.61f, -0.39f, -0.8f)
                curveToRelative(-0.11f, -0.08f, -0.3f, -0.21f, -0.57f, -0.21f)
                close()
            }
        }.also { _CircleThreeQuarters = it}
