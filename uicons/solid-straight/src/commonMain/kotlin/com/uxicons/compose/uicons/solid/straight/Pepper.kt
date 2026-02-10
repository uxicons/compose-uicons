package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Ss.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(1f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.21f, 9.82f)
                lineTo(0.36f, 9f)
                horizontalLineTo(2.2f)
                lineToRelative(0.13f, 0.85f)
                curveTo(2.69f, 12.2f, 3.85f, 15f, 7.32f, 15f)
                curveTo(9.62f, 15f, 12f, 13.5f, 12f, 11f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, -3.61f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.56f, 0f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11f)
                close()
                moveTo(16.8f, 5.14f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.02f, 5.8f)
                curveToRelative(0f, 0.07f, -0.02f, 0.13f, -0.02f, 0.2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                curveToRelative(0f, -0.07f, -0.02f, -0.13f, -0.02f, -0.2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, -0.74f)
                curveTo(18.24f, 1.6f, 16.06f, 0f, 14f, 0f)
                verticalLineTo(2f)
                curveTo(15.17f, 2f, 16.35f, 3.08f, 16.8f, 5.14f)
                close()
            }
        }.also { _Pepper = it}
