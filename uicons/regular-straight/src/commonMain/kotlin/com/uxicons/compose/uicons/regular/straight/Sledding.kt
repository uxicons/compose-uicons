package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sledding: ImageVector? = null

val Icons.Rs.Sledding: ImageVector
    get() = _Sledding ?: UXIcon(name = "Sledding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.73f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.28f, 2.04f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.06f, -0.17f)
                lineTo(0.04f, 14.77f)
                lineToRelative(0.86f, -1.81f)
                lineTo(19.52f, 21.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, -0.94f)
                close()
                moveTo(18.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
                close()
                moveTo(8.58f, 11.16f)
                arcTo(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.36f, 14.5f)
                arcTo(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.95f, 16f)
                horizontalLineTo(16.2f)
                lineToRelative(0.48f, 2.23f)
                lineToRelative(2.28f, 1.08f)
                lineTo(17.81f, 14f)
                horizontalLineTo(10.95f)
                arcToRelative(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.82f, -0.45f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.15f, -1.32f)
                lineTo(13.72f, 6.58f)
                lineToRelative(1.08f, 0.69f)
                arcToRelative(1.18f, 1.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.11f, 1.46f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.04f, 0.04f)
                lineTo(12.63f, 12f)
                horizontalLineTo(15.08f)
                lineToRelative(1.2f, -2.07f)
                curveToRelative(0f, -0.01f, 0f, -0.01f, 0.01f, -0.02f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -4.15f)
                lineTo(13.39f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(7.73f)
                close()
            }
        }.also { _Sledding = it}
