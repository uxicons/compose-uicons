package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Map: ImageVector? = null

val Icons.Rr.Map: ImageVector
    get() = _Map ?: UXIcon(name = "Map") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.68f, 1.17f)
                lineToRelative(-0.02f, -0.01f)
                lineToRelative(-2.71f, -0.9f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, -0.08f)
                lineTo(9.47f, 1.8f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.42f, 1.62f)
                lineToRelative(-0.5f, -0.23f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 18.07f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.6f, 4.8f)
                lineToRelative(2.87f, 0.9f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.96f, 24f)
                arcTo(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.3f, 23.82f)
                lineToRelative(5.8f, -1.6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.62f, 0.01f)
                lineToRelative(2.34f, 0.68f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.02f)
                lineTo(24f, 5.88f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.68f, 1.17f)
                close()
                moveTo(4.18f, 20.96f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.07f)
                lineTo(2f, 6f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, -2.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0.22f)
                reflectiveCurveToRelative(0.74f, 0.32f, 0.89f, 0.37f)
                lineTo(7.0f, 21.84f)
                close()
                moveTo(9f, 21.83f)
                lineTo(9f, 3.88f)
                arcToRelative(5.11f, 5.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.01f, -0.15f)
                lineTo(15f, 2.27f)
                lineTo(15f, 20.2f)
                close()
                moveTo(22f, 19.02f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.43f, 1.95f)
                lineTo(17f, 20.25f)
                lineTo(17f, 2.08f)
                lineToRelative(3.02f, 0.98f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.88f)
                close()
            }
        }.also { _Map = it}
