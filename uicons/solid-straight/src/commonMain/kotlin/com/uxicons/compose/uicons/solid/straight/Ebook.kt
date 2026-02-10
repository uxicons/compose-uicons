package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ebook: ImageVector? = null

val Icons.Ss.Ebook: ImageVector
    get() = _Ebook ?: UXIcon(name = "Ebook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.18f, 17f)
                horizontalLineToRelative(-4.35f)
                curveToRelative(0.38f, -0.82f, 1.21f, -1.4f, 2.17f, -1.4f)
                reflectiveCurveToRelative(1.79f, 0.58f, 2.17f, 1.4f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(21.86f, 17f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3f, -3.86f, -3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(1.3f, 0f, 2.44f, -0.62f, 3.16f, -1.58f)
                curveToRelative(-1.62f, -0.01f, -2.86f, -0.02f, -3.16f, -0.02f)
                curveToRelative(-1.11f, 0f, -2.05f, -0.77f, -2.31f, -1.8f)
                horizontalLineToRelative(6.25f)
                curveToRelative(0.1f, -0.53f, 0.06f, -1.09f, -0.08f, -1.6f)
                close()
                moveTo(2f, 18f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                verticalLineToRelative(-15.77f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-18f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8.25f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.25f, -2f, -0.25f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                close()
                moveTo(12.71f, 24f)
                horizontalLineToRelative(-10.71f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8.25f)
                curveToRelative(0.41f, 1.57f, 1.28f, 2.96f, 2.46f, 4f)
                close()
            }
        }.also { _Ebook = it}
