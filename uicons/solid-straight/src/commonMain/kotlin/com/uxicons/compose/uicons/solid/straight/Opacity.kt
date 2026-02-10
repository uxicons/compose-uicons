package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Opacity: ImageVector? = null

val Icons.Ss.Opacity: ImageVector
    get() = _Opacity ?: UXIcon(name = "Opacity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.31f, 5.61f)
                lineTo(2.77f, 4.33f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 7.92f)
                lineToRelative(1.88f, 0.68f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.31f, 5.61f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcToRelative(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -1.72f)
                lineTo(0.18f, 9.94f)
                arcToRelative(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.14f)
                lineToRelative(1.97f, -0.34f)
                arcTo(10.12f, 10.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.51f, 2.63f)
                lineTo(7.81f, 0.75f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.57f, 2.1f)
                lineToRelative(1.3f, 1.52f)
                arcTo(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.51f, 2.63f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.24f, 21.16f)
                arcToRelative(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 2.1f)
                lineToRelative(0.7f, -1.88f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.98f, -1.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.6f, 15.41f)
                lineToRelative(-1.88f, 0.68f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 3.59f)
                lineTo(4.32f, 18.4f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 15.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.11f, 12.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.83f, 0.2f)
                lineToRelative(0.36f, 1.97f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                verticalLineTo(22f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, -0.16f)
                lineTo(9.83f, 23.8f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
            }
        }.also { _Opacity = it}
