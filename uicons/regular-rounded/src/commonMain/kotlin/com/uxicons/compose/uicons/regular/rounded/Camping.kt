package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Rr.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.0f, 24f)
                lineTo(19f, 24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, -7.13f)
                lineTo(16.54f, 2.9f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.06f, -0.03f)
                lineToRelative(-7f, 14f)
                lineTo(0.47f, 16.9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 24f)
                close()
                moveTo(8.4f, 22f)
                lineTo(11.12f, 16.56f)
                arcTo(0.96f, 0.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcToRelative(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, 0.59f)
                lineTo(15.6f, 22f)
                close()
                moveTo(2.28f, 17.75f)
                lineToRelative(7f, -14.01f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.45f, 0.03f)
                lineToRelative(6.99f, 13.97f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                lineTo(17.84f, 22f)
                lineTo(14.7f, 15.72f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.38f, -0.03f)
                lineTo(6.17f, 22f)
                lineTo(5.0f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.73f, -4.25f)
                close()
            }
        }.also { _Camping = it}
