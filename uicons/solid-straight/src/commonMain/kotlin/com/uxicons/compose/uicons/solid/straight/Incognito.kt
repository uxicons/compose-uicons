package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Incognito: ImageVector? = null

val Icons.Ss.Incognito: ImageVector
    get() = _Incognito ?: UXIcon(name = "Incognito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcTo(19.52f, 19.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.05f, 8.48f)
                curveTo(4.52f, 0.12f, 8.81f, 0f, 9f, 0f)
                curveToRelative(0.15f, 0f, 1.44f, 0.1f, 3f, 2.51f)
                curveTo(13.51f, 0.13f, 14.85f, 0f, 15f, 0f)
                curveToRelative(0.19f, 0f, 4.48f, 0.12f, 4.95f, 8.48f)
                arcTo(19.52f, 19.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
                moveTo(22.08f, 9.67f)
                arcTo(20.36f, 20.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(20.34f, 20.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.92f, 9.67f)
                curveTo(0.65f, 10.3f, 0f, 11.07f, 0f, 12f)
                curveToRelative(0f, 3.16f, 7.54f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, -0.84f, 12f, -4f)
                curveTo(24f, 11.07f, 23.35f, 10.3f, 22.08f, 9.67f)
                close()
                moveTo(16.5f, 17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, 2.17f)
                arcToRelative(4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.53f, 0f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.19f, 2.03f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.07f, 0.21f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.5f, 17f)
                close()
            }
        }.also { _Incognito = it}
