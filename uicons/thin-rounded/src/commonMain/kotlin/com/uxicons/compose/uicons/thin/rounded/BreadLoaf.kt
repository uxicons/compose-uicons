package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Tr.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 5.47f)
                curveToRelative(-0.24f, -1.41f, -1.56f, -2.47f, -3.05f, -2.47f)
                horizontalLineTo(3.1f)
                curveTo(1.6f, 3f, 0.29f, 4.06f, 0.05f, 5.47f)
                curveToRelative(-0.25f, 1.48f, 0.59f, 2.88f, 1.95f, 3.36f)
                verticalLineToRelative(8.67f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(8.83f)
                curveToRelative(1.37f, -0.48f, 2.21f, -1.88f, 1.95f, -3.36f)
                close()
                moveTo(3f, 17.5f)
                verticalLineTo(8.45f)
                curveToRelative(0f, -0.24f, -0.17f, -0.44f, -0.4f, -0.49f)
                curveToRelative(-1.07f, -0.22f, -1.75f, -1.23f, -1.57f, -2.32f)
                curveToRelative(0.16f, -0.94f, 1.05f, -1.64f, 2.07f, -1.64f)
                horizontalLineTo(14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.95f, -0.67f, 1.77f, -1.6f, 1.96f)
                curveToRelative(-0.23f, 0.05f, -0.4f, 0.25f, -0.4f, 0.49f)
                verticalLineToRelative(9.05f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21.4f, 7.96f)
                curveToRelative(-0.23f, 0.05f, -0.4f, 0.25f, -0.4f, 0.49f)
                verticalLineToRelative(9.05f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4.55f)
                curveToRelative(0.65f, -0.64f, 1.05f, -1.52f, 1.05f, -2.5f)
                verticalLineTo(8.83f)
                curveToRelative(1.18f, -0.42f, 2f, -1.55f, 2f, -2.83f)
                curveToRelative(0f, -0.77f, -0.29f, -1.47f, -0.77f, -2f)
                horizontalLineToRelative(4.67f)
                curveToRelative(1.02f, 0f, 1.91f, 0.71f, 2.07f, 1.64f)
                curveToRelative(0.19f, 1.08f, -0.5f, 2.1f, -1.57f, 2.32f)
                close()
            }
        }.also { _BreadLoaf = it}
