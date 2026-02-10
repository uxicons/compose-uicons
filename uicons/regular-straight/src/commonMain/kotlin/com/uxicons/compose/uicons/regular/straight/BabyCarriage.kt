package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCarriage: ImageVector? = null

val Icons.Rs.BabyCarriage: ImageVector
    get() = _BabyCarriage ?: UXIcon(name = "BabyCarriage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                lineTo(13f, 0f)
                lineTo(13f, 9f)
                lineTo(5.41f, 9f)
                lineTo(4.12f, 7.71f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 8f)
                arcTo(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.71f, 9.12f)
                lineTo(4f, 10.41f)
                lineTo(4f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4.87f)
                lineTo(9.26f, 19.13f)
                curveTo(5.58f, 18.11f, 4.68f, 23.82f, 8.5f, 24f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.26f, -3.55f)
                lineTo(14f, 16.56f)
                lineToRelative(3.24f, 3.89f)
                arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 24f)
                curveToRelative(3.82f, -0.18f, 2.92f, -5.89f, -0.76f, -4.87f)
                lineTo(16.14f, 16f)
                lineTo(21f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 10f)
                curveTo(24f, 0.11f, 15.09f, 0f, 15f, 0f)
                close()
                moveTo(15f, 2f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.96f, 7f)
                lineTo(15f, 9f)
                close()
                moveTo(22f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(7f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(6f, 11f)
                lineTo(22f, 11f)
                close()
            }
        }.also { _BabyCarriage = it}
