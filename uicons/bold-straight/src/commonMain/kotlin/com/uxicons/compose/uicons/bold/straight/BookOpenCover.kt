package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenCover: ImageVector? = null

val Icons.Bs.BookOpenCover: ImageVector
    get() = _BookOpenCover ?: UXIcon(name = "BookOpenCover") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.21f, 3.41f)
                curveToRelative(-0.09f, -0.07f, -0.18f, -0.13f, -0.28f, -0.19f)
                curveToRelative(-0.18f, -0.95f, -0.7f, -1.8f, -1.49f, -2.4f)
                curveToRelative(-0.99f, -0.75f, -2.25f, -0.98f, -3.44f, -0.64f)
                lineToRelative(-3.64f, 1.04f)
                curveToRelative(-0.5f, 0.14f, -0.96f, 0.38f, -1.35f, 0.69f)
                curveToRelative(-0.39f, -0.31f, -0.85f, -0.55f, -1.35f, -0.69f)
                lineTo(7.01f, 0.18f)
                curveToRelative(-1.19f, -0.34f, -2.45f, -0.11f, -3.44f, 0.64f)
                curveToRelative(-0.79f, 0.6f, -1.31f, 1.45f, -1.49f, 2.4f)
                curveToRelative(-0.1f, 0.06f, -0.19f, 0.12f, -0.28f, 0.19f)
                curveToRelative(-1.14f, 0.86f, -1.79f, 2.17f, -1.79f, 3.59f)
                verticalLineToRelative(13.63f)
                lineToRelative(12f, 3.43f)
                lineToRelative(12f, -3.43f)
                lineTo(24.0f, 7f)
                curveToRelative(0f, -1.43f, -0.65f, -2.73f, -1.79f, -3.59f)
                close()
                moveTo(13.5f, 5f)
                curveToRelative(0f, -0.41f, 0.28f, -0.78f, 0.67f, -0.89f)
                curveToRelative(0f, 0f, 3.82f, -1.08f, 3.9f, -1.08f)
                curveToRelative(0.26f, 0f, 0.45f, 0.11f, 0.55f, 0.19f)
                curveToRelative(0.14f, 0.1f, 0.37f, 0.34f, 0.37f, 0.74f)
                verticalLineToRelative(13.48f)
                lineToRelative(-5.5f, 1.57f)
                lineTo(13.5f, 5f)
                close()
                moveTo(5f, 3.96f)
                curveToRelative(0f, -0.4f, 0.23f, -0.64f, 0.37f, -0.74f)
                curveToRelative(0.14f, -0.1f, 0.43f, -0.26f, 0.81f, -0.15f)
                lineToRelative(3.64f, 1.04f)
                curveToRelative(0.4f, 0.11f, 0.67f, 0.48f, 0.67f, 0.89f)
                verticalLineToRelative(14.01f)
                lineToRelative(-5.5f, -1.57f)
                lineTo(5f, 3.96f)
                close()
            }
        }.also { _BookOpenCover = it}
