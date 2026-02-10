package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrameOpen: ImageVector? = null

val Icons.Rc.WindowFrameOpen: ImageVector
    get() = _WindowFrameOpen ?: UXIcon(name = "WindowFrameOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 13f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -6.1f, -1.08f, -9.21f, -1.12f, -9.34f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.5f, -0.59f, -0.6f)
                curveToRelative(-0.12f, -0.04f, -2.89f, -1.06f, -7.29f, -1.06f)
                reflectiveCurveToRelative(-7.17f, 1.02f, -7.29f, 1.06f)
                curveToRelative(-0.28f, 0.1f, -0.49f, 0.32f, -0.59f, 0.6f)
                curveToRelative(-0.05f, 0.13f, -1.12f, 3.23f, -1.12f, 9.34f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(18.99f, 11f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(-7.98f)
                curveToRelative(2.51f, 0.1f, 4.32f, 0.54f, 5.12f, 0.77f)
                curveToRelative(0.25f, 0.95f, 0.78f, 3.37f, 0.86f, 7.21f)
                close()
                moveTo(5.88f, 3.79f)
                curveToRelative(0.8f, -0.23f, 2.62f, -0.67f, 5.12f, -0.77f)
                verticalLineToRelative(7.98f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(0.08f, -3.85f, 0.61f, -6.26f, 0.86f, -7.21f)
                close()
                moveTo(21.96f, 22.29f)
                curveToRelative(-0.13f, 0.43f, -0.53f, 0.71f, -0.96f, 0.71f)
                curveToRelative(-0.53f, -0.03f, -2.87f, -0.89f, -9f, -0.9f)
                curveToRelative(-5.74f, 0f, -8.69f, 0.85f, -8.71f, 0.86f)
                curveToRelative(-0.53f, 0.16f, -1.08f, -0.14f, -1.24f, -0.67f)
                curveToRelative(-0.16f, -0.53f, 0.14f, -1.08f, 0.67f, -1.24f)
                curveToRelative(0.04f, -0.01f, 0.46f, -0.13f, 1.24f, -0.28f)
                curveToRelative(-0.21f, -0.77f, -0.56f, -2.31f, -0.78f, -4.67f)
                curveToRelative(-0.05f, -0.55f, 0.35f, -1.04f, 0.91f, -1.09f)
                curveToRelative(0.54f, -0.05f, 1.04f, 0.36f, 1.09f, 0.91f)
                curveToRelative(0.23f, 2.5f, 0.62f, 4.01f, 0.77f, 4.54f)
                curveToRelative(1.5f, -0.19f, 3.51f, -0.35f, 6.06f, -0.35f)
                reflectiveCurveToRelative(4.56f, 0.16f, 6.06f, 0.35f)
                curveToRelative(0.15f, -0.52f, 0.55f, -2.03f, 0.77f, -4.54f)
                curveToRelative(0.05f, -0.55f, 0.55f, -0.96f, 1.09f, -0.91f)
                curveToRelative(0.55f, 0.05f, 0.96f, 0.54f, 0.91f, 1.09f)
                curveToRelative(-0.21f, 2.35f, -0.57f, 3.9f, -0.78f, 4.67f)
                curveToRelative(0.78f, 0.15f, 1.19f, 0.27f, 1.24f, 0.28f)
                curveToRelative(0.53f, 0.16f, 0.83f, 0.72f, 0.67f, 1.25f)
                close()
            }
        }.also { _WindowFrameOpen = it}
