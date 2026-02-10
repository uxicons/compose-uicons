package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Tr.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.57f, 0f)
                lineTo(5.58f, 0f)
                curveTo(3.1f, 0f, 1.08f, 2.02f, 1.08f, 4.5f)
                lineTo(1.08f, 20.98f)
                curveToRelative(0f, 1.2f, 0.86f, 2.48f, 1.92f, 2.85f)
                curveToRelative(0.31f, 0.11f, 0.63f, 0.16f, 0.94f, 0.16f)
                curveToRelative(0.73f, 0f, 1.45f, -0.29f, 1.99f, -0.83f)
                lineToRelative(6.15f, -6.12f)
                lineToRelative(6.08f, 6.05f)
                curveToRelative(0.81f, 0.8f, 1.98f, 1.1f, 3.0f, 0.74f)
                curveToRelative(1.17f, -0.41f, 1.92f, -1.46f, 1.92f, -2.69f)
                lineTo(23.07f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(22.07f, 21.15f)
                curveToRelative(0f, 0.81f, -0.48f, 1.48f, -1.25f, 1.74f)
                curveToRelative(-0.66f, 0.23f, -1.42f, 0.03f, -1.96f, -0.51f)
                lineToRelative(-6.43f, -6.4f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.7f, 0f)
                lineToRelative(-6.5f, 6.47f)
                curveToRelative(-0.51f, 0.51f, -1.22f, 0.67f, -1.9f, 0.43f)
                curveToRelative(-0.65f, -0.23f, -1.24f, -1.14f, -1.24f, -1.91f)
                lineTo(2.08f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12.99f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(22.07f, 21.15f)
                close()
            }
        }.also { _Bookmark = it}
