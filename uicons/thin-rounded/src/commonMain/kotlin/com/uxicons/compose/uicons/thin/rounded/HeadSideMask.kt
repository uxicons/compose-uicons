package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMask: ImageVector? = null

val Icons.Tr.HeadSideMask: ImageVector
    get() = _HeadSideMask ?: UXIcon(name = "HeadSideMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.55f)
                verticalLineToRelative(2.45f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.22f, 0f, -0.41f, -0.14f, -0.48f, -0.35f)
                lineToRelative(-3.09f, -9.84f)
                lineTo(2.02f, 6.83f)
                curveToRelative(-0.52f, 1.09f, -0.86f, 2.26f, -0.95f, 3.47f)
                curveToRelative(-0.18f, 2.46f, 0.43f, 4.74f, 1.78f, 6.6f)
                curveToRelative(0.75f, 1.04f, 1.15f, 2.18f, 1.15f, 3.32f)
                verticalLineToRelative(1.28f)
                curveToRelative(0f, 1.11f, 0.81f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.47f, 0f, -2.5f, -1.03f, -2.5f, -2.5f)
                verticalLineToRelative(-1.28f)
                curveToRelative(0f, -0.92f, -0.33f, -1.87f, -0.96f, -2.73f)
                curveTo(0.56f, 15.44f, -0.12f, 12.93f, 0.07f, 10.23f)
                curveTo(0.44f, 5.29f, 4.5f, 0.85f, 9.32f, 0.13f)
                curveToRelative(4.02f, -0.61f, 8.03f, 1.03f, 10.46f, 4.27f)
                curveToRelative(1.37f, 1.7f, 4.23f, 7.86f, 4.23f, 9.14f)
                close()
                moveTo(2.5f, 5.94f)
                lineToRelative(9.67f, 7.06f)
                horizontalLineToRelative(1.58f)
                curveToRelative(2.55f, 0f, 5.47f, -0.24f, 7.85f, -2.03f)
                lineToRelative(0.4f, -0.3f)
                curveToRelative(-0.89f, -2.06f, -2.16f, -4.61f, -3.01f, -5.66f)
                curveTo(16.77f, 2.05f, 13.13f, 0.57f, 9.47f, 1.12f)
                curveToRelative(-2.87f, 0.43f, -5.44f, 2.32f, -6.97f, 4.83f)
                close()
                moveTo(23f, 13.54f)
                curveToRelative(0f, -0.26f, -0.24f, -0.99f, -0.61f, -1.92f)
                lineToRelative(-0.19f, 0.14f)
                curveToRelative(-2.62f, 1.96f, -5.74f, 2.23f, -8.46f, 2.23f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(2.82f, 9f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                verticalLineToRelative(-2.45f)
                close()
            }
        }.also { _HeadSideMask = it}
