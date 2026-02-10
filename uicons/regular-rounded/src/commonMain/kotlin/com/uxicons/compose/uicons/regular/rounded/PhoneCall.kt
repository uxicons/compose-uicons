package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Rr.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 1f)
                close()
                moveTo(14f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                close()
                moveTo(23.09f, 16.74f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.38f)
                lineToRelative(-0.91f, 1.05f)
                curveToRelative(-8.19f, 7.84f, -28.12f, -12.08f, -20.4f, -20.3f)
                lineToRelative(1.15f, -1f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.26f, 0.91f)
                curveToRelative(0.03f, 0.03f, 1.88f, 2.44f, 1.88f, 2.44f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 4.28f)
                lineTo(7.98f, 9.08f)
                arcToRelative(12.78f, 12.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.93f, 6.95f)
                lineToRelative(1.47f, -1.17f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.28f, -0.01f)
                reflectiveCurveTo(23.06f, 16.71f, 23.09f, 16.74f)
                close()
                moveTo(21.72f, 18.19f)
                reflectiveCurveToRelative(-2.39f, -1.84f, -2.42f, -1.87f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0f)
                curveToRelative(-0.03f, 0.03f, -2.04f, 1.64f, -2.04f, 1.64f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, 0.15f)
                arcTo(15.01f, 15.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.9f, 9.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, -1f)
                reflectiveCurveTo(7.65f, 6.28f, 7.68f, 6.26f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.55f)
                curveToRelative(-0.03f, -0.03f, -1.87f, -2.42f, -1.87f, -2.42f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.51f, 0.04f)
                lineToRelative(-1.15f, 1f)
                curveTo(-2.5f, 10.11f, 14.78f, 26.42f, 20.72f, 20.8f)
                lineToRelative(0.91f, -1.05f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.72f, 18.19f)
                close()
            }
        }.also { _PhoneCall = it}
