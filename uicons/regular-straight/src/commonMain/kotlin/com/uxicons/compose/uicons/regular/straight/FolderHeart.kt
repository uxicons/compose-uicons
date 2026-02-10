package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderHeart: ImageVector? = null

val Icons.Rs.FolderHeart: ImageVector
    get() = _FolderHeart ?: UXIcon(name = "FolderHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(12.24f, 3f)
                lineTo(8.24f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 3f)
                lineTo(7.76f, 3f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 21f)
                lineTo(2f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(12f)
                lineTo(2f, 21f)
                close()
                moveTo(14f, 10.5f)
                curveToRelative(-0.78f, 0f, -1.48f, 0.27f, -2f, 0.73f)
                curveToRelative(-0.52f, -0.46f, -1.22f, -0.73f, -2f, -0.73f)
                curveToRelative(-1.65f, 0f, -3f, 1.42f, -3f, 3.16f)
                curveToRelative(0f, 2.65f, 3.69f, 5.35f, 4.43f, 5.86f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.74f, -0.51f, 4.43f, -3.21f, 4.43f, -5.86f)
                curveToRelative(0f, -1.74f, -1.35f, -3.16f, -3f, -3.16f)
                close()
                moveTo(12.0f, 17.46f)
                curveToRelative(-1.4f, -1.09f, -3.0f, -2.75f, -3.0f, -3.8f)
                curveToRelative(0f, -0.64f, 0.45f, -1.16f, 1f, -1.16f)
                curveToRelative(0.5f, 0f, 1f, 0.31f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.69f, 0.5f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.52f, 1f, 1.16f)
                curveToRelative(0f, 1.05f, -1.6f, 2.71f, -3.0f, 3.8f)
                close()
            }
        }.also { _FolderHeart = it}
