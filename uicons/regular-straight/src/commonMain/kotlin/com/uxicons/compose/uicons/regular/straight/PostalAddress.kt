package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PostalAddress: ImageVector? = null

val Icons.Rs.PostalAddress: ImageVector
    get() = _PostalAddress ?: UXIcon(name = "PostalAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(10f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(21.5f, 14f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(20.41f, 16f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineToRelative(-1.71f, -1.71f)
                horizontalLineToRelative(4.83f)
                close()
                moveTo(14f, 22f)
                verticalLineToRelative(-4.76f)
                lineToRelative(1.88f, 1.88f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(1.88f, -1.88f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(10f, 21.19f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 2.8f, 0f, 2.8f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-7.06f, -6.91f, -7.06f, -6.91f)
                curveToRelative(-0.0f, -0.0f, -0.0f, -0.01f, -0.01f, -0.01f)
                horizontalLineToRelative(-0.0f)
                curveTo(-0.97f, 13.17f, -0.97f, 6.83f, 2.93f, 2.93f)
                curveTo(4.82f, 1.04f, 7.33f, 0f, 10f, 0f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(1.89f, 1.89f, 2.93f, 4.4f, 2.93f, 7.07f)
                curveToRelative(0f, 0.68f, -0.07f, 1.35f, -0.2f, 2f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(0.17f, -0.65f, 0.26f, -1.31f, 0.26f, -2f)
                curveToRelative(0f, -2.14f, -0.83f, -4.15f, -2.34f, -5.66f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.66f, -2.34f)
                reflectiveCurveToRelative(-4.15f, 0.83f, -5.66f, 2.34f)
                curveToRelative(-3.12f, 3.12f, -3.12f, 8.19f, -0.0f, 11.31f)
                lineToRelative(5.66f, 5.53f)
                close()
            }
        }.also { _PostalAddress = it}
