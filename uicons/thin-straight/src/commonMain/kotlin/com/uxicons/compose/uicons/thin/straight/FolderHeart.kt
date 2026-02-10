package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderHeart: ImageVector? = null

val Icons.Ts.FolderHeart: ImageVector
    get() = _FolderHeart ?: UXIcon(name = "FolderHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                lineTo(12.12f, 3f)
                lineTo(8.12f, 1f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 2f)
                lineTo(7.88f, 2f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 7f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 22f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(14f)
                lineTo(1f, 22f)
                close()
                moveTo(14.25f, 11f)
                curveToRelative(-0.95f, 0f, -1.76f, 0.43f, -2.25f, 1.13f)
                curveToRelative(-0.49f, -0.69f, -1.3f, -1.13f, -2.25f, -1.13f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0f, 2.77f, 4.52f, 5.95f, 4.71f, 6.08f)
                lineToRelative(0.28f, 0.2f)
                lineToRelative(0.28f, -0.2f)
                curveToRelative(0.19f, -0.13f, 4.71f, -3.31f, 4.71f, -6.08f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                close()
                moveTo(12f, 18.98f)
                curveToRelative(-1.34f, -0.99f, -4f, -3.32f, -4f, -5.05f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                curveToRelative(1.01f, 0f, 1.75f, 0.74f, 1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0f, -1.01f, 0.74f, -1.75f, 1.75f, -1.75f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.74f, -2.66f, 4.07f, -4f, 5.05f)
                close()
            }
        }.also { _FolderHeart = it}
