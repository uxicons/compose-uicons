package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MosqueAlt: ImageVector? = null

val Icons.Sr.MosqueAlt: ImageVector
    get() = _MosqueAlt ?: UXIcon(name = "MosqueAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(-1.18f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                verticalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(13.88f, 17f)
                curveToRelative(0.72f, -0.93f, 1.12f, -1.95f, 1.12f, -2.94f)
                curveToRelative(0f, -3.27f, -2.88f, -4.72f, -4.79f, -5.68f)
                curveToRelative(-0.64f, -0.32f, -1.6f, -0.81f, -1.71f, -1.01f)
                verticalLineToRelative(-1.36f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.32f)
                curveToRelative(-0.17f, 0.27f, -1.09f, 0.74f, -1.71f, 1.05f)
                curveToRelative(-1.91f, 0.96f, -4.79f, 2.42f, -4.79f, 5.68f)
                curveToRelative(0f, 0.98f, 0.41f, 2.01f, 1.13f, 2.94f)
                horizontalLineToRelative(12.74f)
                close()
                moveTo(23f, 22f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                lineTo(2f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _MosqueAlt = it}
