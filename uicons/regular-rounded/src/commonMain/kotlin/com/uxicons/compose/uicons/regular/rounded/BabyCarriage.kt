package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BabyCarriage: ImageVector? = null

val Icons.Rr.BabyCarriage: ImageVector
    get() = _BabyCarriage ?: UXIcon(name = "BabyCarriage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(13f, 9f)
                lineTo(5.47f, 9f)
                lineTo(4.23f, 7.51f)
                curveTo(3.48f, 6.46f, 0.29f, 4.93f, 0f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.69f, 0.79f)
                lineTo(4f, 10.36f)
                lineTo(4f, 11f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(2.87f)
                lineToRelative(-2.6f, 3.12f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 1.32f)
                lineTo(14f, 16.56f)
                lineToRelative(3.23f, 3.88f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, -1.32f)
                lineTo(16.14f, 16f)
                lineTo(19f, 16f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 10f)
                curveTo(24f, 0.11f, 15.09f, 0f, 15f, 0f)
                close()
                moveTo(21.96f, 9f)
                lineTo(15f, 9f)
                lineToRelative(0f, -7f)
                arcTo(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.96f, 9f)
                close()
                moveTo(19f, 14f)
                lineTo(9f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(22f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                close()
            }
        }.also { _BabyCarriage = it}
