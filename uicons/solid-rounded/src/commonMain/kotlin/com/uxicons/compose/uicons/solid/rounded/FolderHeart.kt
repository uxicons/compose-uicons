package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderHeart: ImageVector? = null

val Icons.Sr.FolderHeart: ImageVector
    get() = _FolderHeart ?: UXIcon(name = "FolderHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-1f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.47f, 0f, 4.51f, 1.65f, 4.91f, 4f)
                lineTo(0f, 7.0f)
                close()
                moveTo(14.01f, 13f)
                curveToRelative(-0.49f, 0f, -0.93f, 0.41f, -1.02f, 0.95f)
                curveToRelative(-0.08f, 0.48f, -0.5f, 0.83f, -0.98f, 0.83f)
                reflectiveCurveToRelative(-0.9f, -0.35f, -0.98f, -0.82f)
                curveToRelative(-0.1f, -0.54f, -0.53f, -0.95f, -1.01f, -0.95f)
                curveToRelative(-0.55f, 0f, -1f, 0.54f, -1f, 1.2f)
                curveToRelative(0f, 1.04f, 1.51f, 2.8f, 3.01f, 4.0f)
                curveToRelative(1.48f, -1.2f, 2.99f, -2.96f, 2.99f, -4.0f)
                curveToRelative(0f, -0.66f, -0.45f, -1.2f, -1f, -1.2f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(17.01f, 14.2f)
                curveToRelative(0f, -1.76f, -1.35f, -3.2f, -3f, -3.2f)
                curveToRelative(-0.75f, 0f, -1.45f, 0.3f, -2.0f, 0.8f)
                curveToRelative(-0.54f, -0.5f, -1.24f, -0.8f, -2.0f, -0.8f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.2f)
                curveToRelative(0f, 2.37f, 2.87f, 4.86f, 3.75f, 5.56f)
                curveToRelative(0.36f, 0.29f, 0.8f, 0.43f, 1.25f, 0.43f)
                reflectiveCurveToRelative(0.89f, -0.14f, 1.25f, -0.43f)
                curveToRelative(0.88f, -0.71f, 3.75f, -3.2f, 3.75f, -5.56f)
                close()
            }
        }.also { _FolderHeart = it}
