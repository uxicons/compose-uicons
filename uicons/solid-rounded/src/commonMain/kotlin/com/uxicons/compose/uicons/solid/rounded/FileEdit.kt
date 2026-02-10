package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileEdit: ImageVector? = null

val Icons.Sr.FileEdit: ImageVector
    get() = _FileEdit ?: UXIcon(name = "FileEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                lineTo(12f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
                verticalLineToRelative(1.46f)
                horizontalLineToRelative(1.46f)
                curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.9f, -0.9f, 0.9f, -2.35f, 0f, -3.25f)
                curveToRelative(-0.9f, -0.9f, -2.35f, -0.9f, -3.25f, 0f)
                lineToRelative(-6.81f, 6.81f)
                close()
                moveTo(10f, 22.55f)
                curveToRelative(0f, -1.69f, 0.66f, -3.28f, 1.85f, -4.48f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(0.39f, -0.39f, 0.84f, -0.69f, 1.33f, -0.9f)
                curveToRelative(-0.0f, -0.12f, -0.01f, -0.24f, -0.02f, -0.36f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(10f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.46f)
                close()
            }
        }.also { _FileEdit = it}
