package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Incognito: ImageVector? = null

val Icons.Rs.Incognito: ImageVector
    get() = _Incognito ?: UXIcon(name = "Incognito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, 2.17f)
                arcToRelative(4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.53f, 0f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.19f, 2.03f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.07f, 0.21f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.5f, 17f)
                close()
                moveTo(7.5f, 22f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 22f)
                close()
                moveTo(16.5f, 22f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 22f)
                close()
                moveTo(19.98f, 8.9f)
                curveTo(19.64f, 0.11f, 15.2f, 0f, 15f, 0f)
                arcToRelative(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 1.3f)
                arcTo(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 0f)
                curveTo(8.8f, 0f, 4.37f, 0.11f, 4.02f, 8.9f)
                curveTo(1.36f, 9.62f, 0f, 10.66f, 0f, 12f)
                curveToRelative(0f, 3.16f, 7.54f, 4f, 12f, 4f)
                reflectiveCurveToRelative(12f, -0.84f, 12f, -4f)
                curveTo(24f, 10.66f, 22.64f, 9.62f, 19.98f, 8.9f)
                close()
                moveTo(8.99f, 2f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 1.45f)
                lineTo(12f, 5.24f)
                lineTo(12.9f, 3.45f)
                arcTo(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.97f, 2f)
                curveToRelative(0.03f, 0f, 2.85f, 0.27f, 3.02f, 7.31f)
                arcTo(20.98f, 20.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcToRelative(21.05f, 21.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.99f, -0.69f)
                curveTo(6.18f, 2.27f, 9f, 2f, 8.99f, 2f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-6.04f, 0f, -9.73f, -1.33f, -10.01f, -1.96f)
                curveToRelative(0.07f, -0.16f, 0.67f, -0.7f, 2.47f, -1.19f)
                lineToRelative(0.09f, 0.04f)
                curveTo(4.64f, 10.94f, 6.82f, 12f, 12f, 12f)
                reflectiveCurveToRelative(7.36f, -1.06f, 7.45f, -1.1f)
                lineToRelative(0.09f, -0.04f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.47f, 1.11f)
                curveTo(21.73f, 12.67f, 18.04f, 14f, 12f, 14f)
                close()
            }
        }.also { _Incognito = it}
