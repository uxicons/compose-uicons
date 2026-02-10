package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MosqueAlt: ImageVector? = null

val Icons.Ss.MosqueAlt: ImageVector
    get() = _MosqueAlt ?: UXIcon(name = "MosqueAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                lineTo(19f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                close()
                moveTo(23f, 10f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                lineTo(2f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-12f)
                close()
                moveTo(13.87f, 17f)
                curveToRelative(0.72f, -0.93f, 1.13f, -1.96f, 1.13f, -2.94f)
                curveToRelative(0f, -3.27f, -2.88f, -4.72f, -4.79f, -5.68f)
                curveToRelative(-0.61f, -0.31f, -1.51f, -0.76f, -1.69f, -0.98f)
                curveToRelative(-0.08f, -0.38f, -0.17f, -0.91f, -0.23f, -1.39f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(-0.05f, 0.46f, -0.14f, 0.96f, -0.21f, 1.34f)
                curveToRelative(-0.18f, 0.27f, -1.09f, 0.73f, -1.7f, 1.04f)
                curveToRelative(-1.91f, 0.96f, -4.79f, 2.42f, -4.79f, 5.68f)
                curveToRelative(0f, 0.99f, 0.41f, 2.02f, 1.13f, 2.94f)
                horizontalLineToRelative(12.74f)
                close()
            }
        }.also { _MosqueAlt = it}
