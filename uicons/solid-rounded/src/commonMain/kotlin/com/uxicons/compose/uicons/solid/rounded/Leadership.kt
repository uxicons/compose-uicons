package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leadership: ImageVector? = null

val Icons.Sr.Leadership: ImageVector
    get() = _Leadership ?: UXIcon(name = "Leadership") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 7.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.48f, 13.65f)
                lineToRelative(-3.48f, 2.11f)
                verticalLineToRelative(-0.76f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.49f)
                lineToRelative(2.59f, -1.27f)
                curveToRelative(0.55f, -0.34f, 0.55f, -1.14f, 0f, -1.49f)
                lineToRelative(-2.63f, -1.57f)
                curveToRelative(-0.2f, -0.12f, -0.43f, -0.18f, -0.67f, -0.18f)
                curveToRelative(-0.72f, 0f, -1.3f, 0.58f, -1.3f, 1.3f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.86f, 0f, -1.63f, 0.37f, -2.18f, 0.95f)
                curveToRelative(-0.01f, 0.0f, -3.01f, 2.92f, -3.01f, 2.92f)
                curveToRelative(-0.14f, 0.14f, -0.31f, 0.23f, -0.5f, 0.26f)
                curveToRelative(0f, 0f, -5.35f, 1.05f, -5.41f, 1.08f)
                curveToRelative(-1.15f, 0.46f, -1.9f, 1.55f, -1.9f, 2.79f)
                verticalLineToRelative(7.2f)
                lineToRelative(-0.83f, 1.25f)
                curveToRelative(-0.31f, 0.46f, -0.18f, 1.08f, 0.28f, 1.39f)
                curveToRelative(0.17f, 0.11f, 0.36f, 0.17f, 0.55f, 0.17f)
                curveToRelative(0.32f, 0f, 0.64f, -0.16f, 0.83f, -0.45f)
                lineToRelative(1f, -1.5f)
                curveToRelative(0.11f, -0.16f, 0.17f, -0.36f, 0.17f, -0.56f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.72f)
                curveToRelative(0.37f, 0f, 0.72f, -0.1f, 1.04f, -0.29f)
                lineToRelative(13.76f, -8.36f)
                curveToRelative(0.47f, -0.29f, 0.62f, -0.9f, 0.34f, -1.37f)
                curveToRelative(-0.29f, -0.47f, -0.9f, -0.62f, -1.37f, -0.34f)
                close()
                moveTo(9f, 21.83f)
                verticalLineToRelative(-1.83f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.38f)
                lineToRelative(2.69f, -0.53f)
                curveToRelative(0.57f, -0.11f, 1.09f, -0.39f, 1.51f, -0.79f)
                lineToRelative(0.8f, -0.78f)
                verticalLineToRelative(10.09f)
                lineToRelative(-2f, 1.21f)
                close()
                moveTo(17f, 16.97f)
                lineToRelative(-4f, 2.43f)
                verticalLineToRelative(-4.4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.97f)
                close()
            }
        }.also { _Leadership = it}
