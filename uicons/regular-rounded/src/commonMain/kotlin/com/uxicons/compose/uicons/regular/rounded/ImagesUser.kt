package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ImagesUser: ImageVector? = null

val Icons.Rr.ImagesUser: ImageVector
    get() = _ImagesUser ?: UXIcon(name = "ImagesUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                horizontalLineToRelative(-9f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12.05f, 16f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                reflectiveCurveToRelative(2.22f, 0.86f, 2.45f, 2f)
                horizontalLineToRelative(-4.9f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.25f, -2.25f, -2.16f, -4f, -4.47f, -4f)
                reflectiveCurveToRelative(-4.22f, 1.75f, -4.47f, 4f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.23f, 0.45f, -2.42f, 1.28f, -3.34f)
                curveToRelative(0.37f, -0.41f, 1.0f, -0.45f, 1.41f, -0.08f)
                curveToRelative(0.41f, 0.37f, 0.45f, 1f, 0.08f, 1.41f)
                curveToRelative(-0.49f, 0.55f, -0.77f, 1.26f, -0.77f, 2.0f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 8.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _ImagesUser = it}
