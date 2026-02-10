package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PodiumStar: ImageVector? = null

val Icons.Rs.PodiumStar: ImageVector
    get() = _PodiumStar ?: UXIcon(name = "PodiumStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                lineTo(0f, 10f)
                verticalLineToRelative(2f)
                lineTo(2.15f, 12f)
                lineToRelative(2f, 12f)
                horizontalLineToRelative(15.69f)
                lineToRelative(2f, -12f)
                horizontalLineToRelative(2.15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(18.15f, 22f)
                lineTo(5.85f, 22f)
                lineToRelative(-1.67f, -10f)
                horizontalLineToRelative(15.64f)
                lineToRelative(-1.67f, 10f)
                close()
                moveTo(12.48f, 12.99f)
                lineToRelative(0.65f, 2.01f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.3f, 0.92f)
                lineToRelative(-1.71f, 1.24f)
                lineToRelative(0.65f, 2.01f)
                lineToRelative(-0.78f, 0.57f)
                lineToRelative(-1.71f, -1.24f)
                lineToRelative(-1.7f, 1.24f)
                lineToRelative(-0.78f, -0.57f)
                lineToRelative(0.65f, -2.01f)
                lineToRelative(-1.71f, -1.24f)
                lineToRelative(0.3f, -0.92f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.65f, -2.0f)
                lineToRelative(0.96f, -0.01f)
                close()
            }
        }.also { _PodiumStar = it}
