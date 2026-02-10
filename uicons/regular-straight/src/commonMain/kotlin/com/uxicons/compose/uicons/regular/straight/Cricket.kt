package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cricket: ImageVector? = null

val Icons.Rs.Cricket: ImageVector
    get() = _Cricket ?: UXIcon(name = "Cricket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.81f, 11.35f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.74f)
                lineToRelative(0f, 0f)
                lineTo(21.5f, 3.91f)
                lineToRelative(1.04f, 1.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(19.04f, 1.46f)
                lineTo(20.09f, 2.5f)
                lineTo(16.4f, 6.19f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.74f, 0f)
                lineToRelative(-0.71f, -0.7f)
                lineTo(0.34f, 17.1f)
                lineToRelative(-0.07f, 0.22f)
                curveToRelative(-0.04f, 0.13f, -1.03f, 3.19f, 1.1f, 5.32f)
                arcTo(4.81f, 4.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.86f, 24f)
                arcToRelative(6.24f, 6.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.82f, -0.27f)
                lineToRelative(0.22f, -0.07f)
                lineTo(18.51f, 12.05f)
                close()
                moveTo(5.85f, 21.89f)
                arcTo(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.78f, 21.22f)
                arcToRelative(3.37f, 3.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -3.07f)
                lineToRelative(7.63f, -7.63f)
                arcTo(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.67f)
                lineTo(10f, 14f)
                horizontalLineToRelative(2.41f)
                arcToRelative(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.26f)
                close()
                moveTo(14.92f, 12.82f)
                arcToRelative(4.26f, 4.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -0.82f)
                lineTo(12f, 12f)
                verticalLineToRelative(-0.33f)
                arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.82f, -2.59f)
                lineToRelative(0.84f, -0.84f)
                arcToRelative(4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.04f, 0.69f)
                arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 3.04f)
                close()
                moveTo(20.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 17f)
                close()
                moveTo(20.5f, 22f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 22f)
                close()
            }
        }.also { _Cricket = it}
