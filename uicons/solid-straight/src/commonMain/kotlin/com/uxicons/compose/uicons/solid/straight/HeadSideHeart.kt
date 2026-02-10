package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideHeart: ImageVector? = null

val Icons.Ss.HeadSideHeart: ImageVector
    get() = _HeadSideHeart ?: UXIcon(name = "HeadSideHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10.16f)
                curveToRelative(0f, 1.05f, -1.61f, 2.71f, -3f, 3.8f)
                curveToRelative(-1.39f, -1.09f, -3f, -2.75f, -3f, -3.8f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                close()
                moveTo(24f, 12.79f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-0.45f, 3.39f)
                curveToRelative(-0.2f, 1.49f, -1.47f, 2.61f, -2.97f, 2.61f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.46f, -0.16f, -0.91f, -0.46f, -1.26f)
                curveTo(0.67f, 15.78f, -0.22f, 12.92f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.18f, 1.46f, 2.3f, 4.02f, 3.48f, 6.72f)
                lineToRelative(0.72f, 1.65f)
                close()
                moveTo(16f, 10.16f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 2.65f, 3.69f, 5.35f, 4.43f, 5.86f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.74f, -0.51f, 4.43f, -3.21f, 4.43f, -5.86f)
                close()
            }
        }.also { _HeadSideHeart = it}
