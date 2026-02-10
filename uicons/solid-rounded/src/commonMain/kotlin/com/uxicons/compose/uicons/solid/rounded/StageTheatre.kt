package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StageTheatre: ImageVector? = null

val Icons.Sr.StageTheatre: ImageVector
    get() = _StageTheatre ?: UXIcon(name = "StageTheatre") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.74f, 16f)
                horizontalLineToRelative(4.26f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.97f, 0f, -1.7f, -0.88f, -1.54f, -1.85f)
                curveToRelative(0.43f, -2.63f, 2.56f, -4.71f, 3.72f, -6.15f)
                close()
                moveTo(4.26f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.96f)
                curveToRelative(0.96f, 0f, 1.68f, -0.87f, 1.52f, -1.83f)
                curveToRelative(-0.42f, -2.64f, -2.56f, -4.73f, -3.72f, -6.17f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.11f, -1.4f, -7.64f, -4.65f, -8f, -12f)
                curveToRelative(-0.36f, 7.35f, -4.89f, 10.6f, -8f, 12f)
                lineTo(0f, 14f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(8.93f, 3.15f)
                curveToRelative(0.08f, -0.61f, -0.39f, -1.15f, -1f, -1.15f)
                curveToRelative(-0.49f, 0f, -0.93f, 0.35f, -0.99f, 0.84f)
                curveToRelative(-0.35f, 2.62f, -1.44f, 4.3f, -2.6f, 5.37f)
                curveToRelative(-0.21f, 0.19f, -0.34f, 0.45f, -0.34f, 0.74f)
                curveToRelative(0f, 0.85f, 1.01f, 1.31f, 1.65f, 0.74f)
                curveToRelative(1.48f, -1.32f, 2.85f, -3.37f, 3.28f, -6.54f)
                close()
                moveTo(20f, 8.95f)
                curveToRelative(0f, -0.28f, -0.13f, -0.55f, -0.34f, -0.74f)
                curveToRelative(-1.16f, -1.07f, -2.23f, -2.75f, -2.58f, -5.37f)
                curveToRelative(-0.07f, -0.49f, -0.5f, -0.84f, -0.99f, -0.84f)
                curveToRelative(-0.61f, 0f, -1.08f, 0.55f, -1f, 1.15f)
                curveToRelative(0.43f, 3.17f, 1.79f, 5.22f, 3.26f, 6.54f)
                curveToRelative(0.64f, 0.57f, 1.65f, 0.11f, 1.65f, -0.74f)
                close()
            }
        }.also { _StageTheatre = it}
