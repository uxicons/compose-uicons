package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderHeart: ImageVector? = null

val Icons.Tr.FolderHeart: ImageVector
    get() = _FolderHeart ?: UXIcon(name = "FolderHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 11f)
                curveToRelative(-0.91f, 0f, -1.74f, 0.45f, -2.25f, 1.1f)
                curveToRelative(-0.51f, -0.66f, -1.34f, -1.1f, -2.25f, -1.1f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0f, 1.92f, 2.06f, 3.98f, 3.8f, 5.38f)
                curveToRelative(0.35f, 0.29f, 0.78f, 0.43f, 1.2f, 0.43f)
                reflectiveCurveToRelative(0.85f, -0.14f, 1.2f, -0.43f)
                curveToRelative(1.73f, -1.4f, 3.8f, -3.47f, 3.8f, -5.38f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                close()
                moveTo(12.57f, 18.54f)
                curveToRelative(-0.34f, 0.27f, -0.81f, 0.27f, -1.15f, 0f)
                curveToRelative(-2.18f, -1.76f, -3.43f, -3.44f, -3.43f, -4.6f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                curveToRelative(0.98f, 0f, 1.75f, 0.81f, 1.75f, 1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.69f, 0.77f, -1.5f, 1.75f, -1.5f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.17f, -1.25f, 2.85f, -3.43f, 4.6f)
                close()
                moveTo(19.5f, 3f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-0.23f, 0f, -0.46f, -0.06f, -0.67f, -0.16f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.34f, -0.17f, -0.73f, -0.26f, -1.12f, -0.26f)
                horizontalLineToRelative(-3.03f)
                curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 2f)
                horizontalLineToRelative(3.03f)
                curveToRelative(0.23f, 0f, 0.46f, 0.06f, 0.67f, 0.16f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.34f, 0.17f, 0.73f, 0.26f, 1.12f, 0.26f)
                horizontalLineToRelative(7.03f)
                curveToRelative(1.76f, 0f, 3.2f, 1.31f, 3.45f, 3f)
                lineTo(1f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 22f)
                lineTo(4.5f, 22f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _FolderHeart = it}
