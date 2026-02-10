package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Garlic: ImageVector? = null

val Icons.Rs.Garlic: ImageVector
    get() = _Garlic ?: UXIcon(name = "Garlic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5.47f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 5.47f)
                curveTo(6.21f, 6.72f, 0f, 11.54f, 0f, 18.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.74f, 3.12f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.52f, 0f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
                curveTo(24f, 11.54f, 17.8f, 6.72f, 16f, 5.47f)
                close()
                moveTo(14f, 2f)
                lineTo(14f, 5.82f)
                curveToRelative(-0.09f, 0.23f, -0.26f, 0.71f, -0.54f, 1.52f)
                curveToRelative(-0.38f, -0.58f, -0.64f, -0.91f, -0.68f, -0.96f)
                lineTo(12f, 5.4f)
                lineToRelative(-0.78f, 0.98f)
                curveToRelative(-0.04f, 0.05f, -0.3f, 0.39f, -0.68f, 0.96f)
                curveToRelative(-0.28f, -0.81f, -0.45f, -1.29f, -0.54f, -1.52f)
                lineTo(10f, 2f)
                close()
                moveTo(4.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.5f)
                curveTo(2f, 13.21f, 6.45f, 9.17f, 8.51f, 7.58f)
                curveToRelative(0.18f, 0.51f, 0.41f, 1.19f, 0.72f, 2.09f)
                arcTo(21.54f, 21.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.01f, 18.5f)
                lineTo(7f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 21f)
                close()
                moveTo(12f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                arcTo(20.07f, 20.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8.78f)
                arcTo(20.07f, 20.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(19.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18.5f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(21.54f, 21.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.21f, -8.83f)
                curveToRelative(0.3f, -0.9f, 0.54f, -1.58f, 0.72f, -2.09f)
                curveTo(17.55f, 9.17f, 22f, 13.21f, 22f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 21f)
                close()
            }
        }.also { _Garlic = it}
