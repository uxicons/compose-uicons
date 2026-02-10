package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideMask: ImageVector? = null

val Icons.Rr.HeadSideMask: ImageVector
    get() = _HeadSideMask ?: UXIcon(name = "HeadSideMask") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.43f, 0f, -0.81f, -0.28f, -0.95f, -0.68f)
                lineToRelative(-2.91f, -8.72f)
                lineTo(2.57f, 7.83f)
                curveToRelative(-0.28f, 0.74f, -0.46f, 1.52f, -0.54f, 2.33f)
                curveToRelative(-0.21f, 2.27f, 0.44f, 4.5f, 1.81f, 6.3f)
                curveToRelative(0.74f, 0.97f, 1.15f, 2.24f, 1.15f, 3.57f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(6f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -0.89f, -0.26f, -1.73f, -0.74f, -2.36f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(3.51f, 6.02f)
                lineToRelative(8.84f, 6.98f)
                horizontalLineToRelative(1.32f)
                curveToRelative(2.58f, 0f, 5.14f, -0.85f, 7.2f, -2.4f)
                lineToRelative(0.13f, -0.1f)
                curveToRelative(-0.83f, -1.74f, -1.99f, -3.88f, -2.78f, -4.85f)
                curveToRelative(-2.02f, -2.69f, -5.18f, -4.02f, -8.5f, -3.56f)
                curveToRelative(-2.58f, 0.35f, -4.82f, 1.84f, -6.22f, 3.93f)
                close()
                moveTo(22f, 13f)
                curveToRelative(-0.01f, -0.12f, -0.08f, -0.34f, -0.18f, -0.62f)
                curveToRelative(-2.36f, 1.69f, -5.25f, 2.62f, -8.15f, 2.62f)
                horizontalLineToRelative(-0.28f)
                lineToRelative(2.33f, 7f)
                horizontalLineToRelative(0.28f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HeadSideMask = it}
