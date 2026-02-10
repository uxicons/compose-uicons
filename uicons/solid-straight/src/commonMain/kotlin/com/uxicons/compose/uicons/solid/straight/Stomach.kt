package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stomach: ImageVector? = null

val Icons.Ss.Stomach: ImageVector
    get() = _Stomach ?: UXIcon(name = "Stomach") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.96f, -2.6f, 2.84f, -3.14f, 3f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.71f)
                curveToRelative(0.27f, 0.17f, 0.54f, 0.33f, 0.8f, 0.49f)
                curveToRelative(2.01f, 1.27f, 3.91f, 2.48f, 8.49f, 2.5f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.83f, 0f, 3.57f, -0.72f, 4.89f, -2.03f)
                curveToRelative(1.34f, -1.33f, 2.08f, -3.1f, 2.08f, -4.97f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(20f, 13.5f)
                curveToRelative(-0.35f, -0.21f, -1.01f, -0.5f, -2f, -0.5f)
                curveToRelative(-0.81f, 0f, -1.34f, 0.2f, -1.95f, 0.43f)
                curveToRelative(-0.69f, 0.27f, -1.48f, 0.57f, -2.66f, 0.57f)
                curveToRelative(-0.93f, 0f, -1.74f, -0.19f, -2.39f, -0.41f)
                verticalLineToRelative(-2.16f)
                curveToRelative(0.48f, 0.24f, 1.33f, 0.58f, 2.39f, 0.58f)
                curveToRelative(0.81f, 0f, 1.34f, -0.2f, 1.95f, -0.43f)
                curveToRelative(0.69f, -0.27f, 1.48f, -0.57f, 2.66f, -0.57f)
                curveToRelative(0.8f, 0f, 1.46f, 0.14f, 2f, 0.32f)
                verticalLineToRelative(2.18f)
                close()
            }
        }.also { _Stomach = it}
