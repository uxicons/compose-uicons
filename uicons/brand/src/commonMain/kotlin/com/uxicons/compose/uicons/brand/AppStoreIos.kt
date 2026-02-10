package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppStoreIos: ImageVector? = null

val Icons.Brand.AppStoreIos: ImageVector
    get() = _AppStoreIos ?: UXIcon(name = "AppStoreIos") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.15f, 0.0f)
            horizontalLineTo(4.85f)
            curveTo(2.17f, 0.0f, 0f, 2.17f, 0f, 4.85f)
            verticalLineToRelative(14.3f)
            curveToRelative(0f, 2.68f, 2.17f, 4.84f, 4.85f, 4.84f)
            horizontalLineToRelative(14.3f)
            curveToRelative(2.68f, 0f, 4.85f, -2.17f, 4.85f, -4.85f)
            verticalLineTo(4.85f)
            curveTo(24.0f, 2.17f, 21.83f, 0.0f, 19.15f, 0.0f)
            close()
            moveTo(6.63f, 19.0f)
            curveToRelative(-0.3f, 0.53f, -0.97f, 0.7f, -1.49f, 0.4f)
            curveToRelative(-0.53f, -0.3f, -0.7f, -0.97f, -0.4f, -1.49f)
            lineToRelative(0.78f, -1.35f)
            curveToRelative(0.88f, -0.27f, 1.6f, -0.06f, 2.17f, 0.62f)
            lineTo(6.63f, 19.0f)
            close()
            moveTo(14.22f, 16.06f)
            horizontalLineTo(4.29f)
            curveToRelative(-0.61f, 0f, -1.09f, -0.49f, -1.09f, -1.09f)
            curveToRelative(0f, -0.61f, 0.49f, -1.09f, 1.09f, -1.09f)
            horizontalLineToRelative(2.78f)
            lineToRelative(3.56f, -6.18f)
            lineTo(9.52f, 5.76f)
            curveToRelative(-0.3f, -0.53f, -0.12f, -1.19f, 0.4f, -1.49f)
            curveToRelative(0.53f, -0.3f, 1.19f, -0.12f, 1.49f, 0.4f)
            lineToRelative(0.48f, 0.84f)
            lineToRelative(0.49f, -0.84f)
            curveToRelative(0.3f, -0.53f, 0.97f, -0.7f, 1.49f, -0.4f)
            curveToRelative(0.53f, 0.3f, 0.7f, 0.97f, 0.4f, 1.49f)
            lineToRelative(-4.68f, 8.11f)
            horizontalLineToRelative(3.39f)
            curveTo(14.08f, 13.87f, 14.7f, 15.16f, 14.22f, 16.06f)
            close()
            moveTo(19.57f, 16.06f)
            horizontalLineToRelative(-1.58f)
            lineToRelative(1.06f, 1.85f)
            curveToRelative(0.3f, 0.53f, 0.12f, 1.19f, -0.4f, 1.49f)
            curveToRelative(-0.53f, 0.3f, -1.19f, 0.12f, -1.49f, -0.4f)
            curveToRelative(-1.79f, -3.11f, -3.14f, -5.44f, -4.03f, -6.99f)
            curveToRelative(-0.92f, -1.58f, -0.26f, -3.16f, 0.38f, -3.7f)
            curveToRelative(0.72f, 1.23f, 1.79f, 3.09f, 3.22f, 5.57f)
            horizontalLineToRelative(2.84f)
            curveToRelative(0.61f, 0f, 1.09f, 0.49f, 1.09f, 1.09f)
            curveTo(20.66f, 15.58f, 20.17f, 16.06f, 19.57f, 16.06f)
            close()
        }
    }.also { _AppStoreIos = it }
