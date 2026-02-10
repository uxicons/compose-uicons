package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Incognito: ImageVector? = null

val Icons.Bs.Incognito: ImageVector
    get() = _Incognito ?: UXIcon(name = "Incognito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 9.08f)
                curveTo(19.5f, 1.45f, 15.53f, 0f, 14.98f, 0f)
                arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                arcTo(5.19f, 5.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.07f, 0f)
                curveTo(8.47f, 0f, 4.5f, 1.45f, 4.05f, 9.08f)
                curveTo(1.57f, 9.7f, 0f, 10.61f, 0f, 11.61f)
                curveTo(0f, 13.48f, 5.37f, 15f, 12f, 15f)
                reflectiveCurveToRelative(12f, -1.52f, 12f, -3.39f)
                curveTo(24f, 10.61f, 22.43f, 9.7f, 19.95f, 9.08f)
                close()
                moveTo(12f, 10f)
                arcToRelative(21.43f, 21.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, -0.49f)
                curveToRelative(0.22f, -4.73f, 1.89f, -6.14f, 2.42f, -6.48f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, 0.95f)
                lineTo(12f, 6.57f)
                lineToRelative(1.33f, -2.58f)
                arcToRelative(1.81f, 1.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.21f, -0.95f)
                curveToRelative(0.57f, 0.36f, 2.21f, 1.8f, 2.44f, 6.47f)
                arcTo(21.43f, 21.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
                moveTo(21f, 20f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.8f, 1.19f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.2f, 0.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.26f, -3.02f)
                arcTo(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 0.17f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 20f)
                close()
            }
        }.also { _Incognito = it}
