package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideHeart: ImageVector? = null

val Icons.Sr.HeadSideHeart: ImageVector
    get() = _HeadSideHeart ?: UXIcon(name = "HeadSideHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10.16f)
                curveToRelative(0f, 0.87f, -1.17f, 2.35f, -3f, 3.79f)
                curveToRelative(-1.83f, -1.44f, -3f, -2.92f, -3f, -3.79f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                close()
                moveTo(24f, 13f)
                curveToRelative(0f, 0.97f, -0.7f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.48f, -2.46f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-0.97f)
                curveToRelative(0f, -0.9f, -0.26f, -1.73f, -0.74f, -2.35f)
                curveTo(0.58f, 15.48f, -0.2f, 12.75f, 0.05f, 9.98f)
                curveTo(0.5f, 4.95f, 4.46f, 0.79f, 9.45f, 0.11f)
                curveToRelative(4.04f, -0.56f, 7.91f, 1.06f, 10.35f, 4.31f)
                curveToRelative(1.27f, 1.57f, 4.2f, 7.16f, 4.2f, 8.58f)
                close()
                moveTo(16f, 10.16f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 2.03f, 2.12f, 4.09f, 3.9f, 5.47f)
                curveToRelative(0.32f, 0.25f, 0.71f, 0.38f, 1.1f, 0.38f)
                reflectiveCurveToRelative(0.77f, -0.12f, 1.1f, -0.38f)
                curveToRelative(1.78f, -1.38f, 3.9f, -3.44f, 3.9f, -5.47f)
                close()
            }
        }.also { _HeadSideHeart = it}
